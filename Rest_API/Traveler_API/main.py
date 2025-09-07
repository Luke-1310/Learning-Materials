#Creare un ambiente virtuale in python -> python_api -m venv api_env (nome_ambiente_virtuale)
#Entrare nell'ambiente virtuale -> source api_env/bin/activate (Linux/Mac) o api_env\Scripts\activate (Windows)
#Installare Flask -> pip install Flask
#Installare Flask-Alchemy -> pip install Flask-SQLAlchemy
#Creare requirements.txt -> pip freeze > requirements.txt (serve per condividere le librerie installate nell'ambiente virtuale con altre persone)

from flask import Flask, jsonify, request #importa la classe Flask dal modulo flask e le funzioni jsonify e request
from flask_sqlalchemy import SQLAlchemy #importa la classe SQLAlchemy dal modulo flask_sqlalchemy ORM (Object-Relational Mapping)

app = Flask(__name__) #crea un'istanza dell'applicazione Flask

#Creare il database
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///travel.db' #configura l'URI del database (in questo caso un database SQLite chiamato travel.db)

db = SQLAlchemy(app) #crea un'istanza di SQLAlchemy legata all'app Flask

#un modello rappresenta una riga nella tabella del database
class Destination(db.Model):
    id = db.Column(db.Integer, primary_key=True) 
    destination_name = db.Column(db.String(50), nullable=False)
    country = db.Column(db.String(50), nullable=False)
    rating = db.Column(db.Float, nullable=False)

    #ora voglio creare un metodo che mi permette di rappresentare i dati in un formato dizionario per poi convertirli in JSON
    def to_dict(self):
        
        return{
            'id': self.id,
            'destination_name': self.destination_name,
            'country': self.country,
            'rating': self.rating
        }

#Creo un context manager per creare il database
with app.app_context():
    db.create_all() #crea tutte le tabelle definite nei modelli (in questo caso la tabella Destination)

#Creare dei Routes, un esempio di route potrebbe essere 

#"http://localhost:5000/" HOMEPAGE
@app.route('/')
def home():
    return jsonify({'message': 'Welcome to the Travel API!'}) #jsonify converte il dizionario in un oggetto JSON

#"http://localhost:5000/destinations" GET tutte le destinazioni
@app.route('/destinations', methods=['GET'])
def get_destinations():
    destinations = Destination.query.all()

    return jsonify([destination.to_dict() for destination in destinations]) #ritorna una lista di dizionari

#"http://localhost:5000/destinations/id"
@app.route('/destinations/<int:id>', methods=['GET'])
def get_destination(id):
    
    destination = Destination.query.get_or_404(id)
    
    if destination:
        return jsonify(destination.to_dict())
    
    else:
        return jsonify({'error': 'Destination not found'}), 404

#POST per inviare un informazione al server
@app.route('/destinations', methods=['POST'])
def add_destination():
    data = request.get_json() #prende i dati JSON dalla richiesta

    new_destination = Destination(  destination_name=data["destination_name"],
                                  country=data["country"],
                                  rating=data["rating"])

    db.session.add(new_destination) #aggiunge la nuova destinazione alla sessione del database
    db.session.commit() #committa la sessione (salva le modifiche nel database)

    return jsonify(new_destination.to_dict()), 201 #ritorna la nuova destinazione in formato JSON e lo status code 201 (creato)

#PUT -> aggiornare una risorsa esistente
@app.route('/destinations/<int:id>', methods=['PUT'])
def update_destination(id):

    data = request.get_json()

    destination = Destination.query.get_or_404(id)
    
    if destination:

        destination.destination_name = data.get("destination_name", destination.destination_name)
        destination.country = data.get("country", destination.country)
        destination.rating = data.get("rating", destination.rating)

        db.session.commit()

        return jsonify(destination.to_dict())
    else:
        return jsonify({'error': 'Destination not found'}), 404

#DELETE -> eliminare una risorsa esistente
@app.route('/destinations/<int:id>', methods=['DELETE'])
def delete_destination(id):

    destination = Destination.query.get_or_404(id)

    if destination:
        db.session.delete(destination)
        db.session.commit()

        return jsonify({'message': 'Destination deleted successfully'})
    else:
        return jsonify({'error': 'Destination not found'}), 404


if __name__ == '__main__': #se il file viene eseguito direttamente (non importato come modulo)
    app.run(debug=True) #l'app lavora continuamente in modalità debug (utile per lo sviluppo)