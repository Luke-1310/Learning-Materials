Link al video -> https://www.youtube.com/watch?v=Ha3ls0EAtW8
Canale -> Code with Josh

### Creare e gestire un ambiente virtuale Python con Flask

Quando si lavora a progetti Python, è buona pratica usare un **ambiente virtuale**. Questo permette di isolare le librerie del progetto dalle altre installazioni Python del sistema.

Per creare un ambiente virtuale, entrare nell'ambiente, installare le librerie e gestirlo, puoi seguire questi passaggi:

### 1. Creare un ambiente virtuale nella cartella 'python_api' chiamato 'api_env'
python -m venv api_env

### 2. Attivare l'ambiente virtuale
**Windows**: (PowerShell o Prompt dei comandi): api_env\Scripts\activate

**Linux/Mac**: source api_env/bin/activate

### 3. Installare le librerie necessarie
pip install Flask
pip install Flask-SQLAlchemy

### 4. Creare il file 'requirements.txt' con tutte le librerie installate
pip freeze > requirements.txt

Altri utenti potranno ricreare lo stesso ambiente con: pip install -r requirements.txt

### 5. Controllare la versione di Python attiva
python --version

### 6. Controllare le librerie installate
pip list

### 7. Aggiornare pip all’ultima versione
python -m pip install --upgrade pip

### 8. Disattivare l'ambiente virtuale quando hai finito
deactivate

### API REST con Flask e SQLAlchemy

In questo progetto abbiamo creato una semplice **API REST** per gestire destinazioni di viaggio, utilizzando **Flask** come framework web e **Flask-SQLAlchemy** come ORM (Object-Relational Mapping).  

### Librerie usate

- **Flask**  
  È un micro-framework Python che consente di creare applicazioni web e API in modo semplice e veloce.  
  Dal modulo `flask` importiamo:
  - `Flask`: la classe principale per creare l’applicazione
  - `jsonify`: per convertire dizionari Python in JSON (utile per le API)
  - `request`: per gestire le richieste HTTP (ad esempio leggere dati inviati in POST)

- **Flask-SQLAlchemy**  
  È un’estensione di Flask che integra **SQLAlchemy**, un ORM che permette di lavorare con database in modo più semplice usando classi Python invece di scrivere query SQL a mano.

### Creazione dell’app e configurazione database

```python
app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///travel.db'
db = SQLAlchemy(app)
```

Creiamo un’app Flask, configuriamo un database SQLite chiamato travel.db ereiamo un’istanza di SQLAlchemy collegata all’app

```python
class Destination(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    destination_name = db.Column(db.String(50), nullable=False)
    country = db.Column(db.String(50), nullable=False)
    rating = db.Column(db.Float, nullable=False)

    def to_dict(self):
        return {
            'id': self.id,
            'destination_name': self.destination_name,
            'country': self.country,
            'rating': self.rating
        }
```

Ci sono poi diverse rotte API come ad esempio questa che da come risultato tutte le destinazioni presenti nel DB

```python
@app.route('/destinations', methods=['GET'])
def get_destinations():
    destinations = Destination.query.all()
    return jsonify([destination.to_dict() for destination in destinations])
```

Infine in coda si ha:

```python
if __name__ == '__main__':
    app.run(debug=True)
```

L'app Flask, avviata in modalità debug si aggiorna automaticamente e se si modifica il codice e mostrando errori dettagliati

Si è infine fatto alcuni test sulla API creata con Postman, l’API è l’insieme delle rotte Flask che parlano col database e restituiscono dati in JSON. Postman, quando fai le richieste, sta chiamando quelle rotte