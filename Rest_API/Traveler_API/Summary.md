

### Creare e gestire un ambiente virtuale Python con Flask

Quando si lavora a progetti Python, è buona pratica usare un **ambiente virtuale**. Questo permette di isolare le librerie del progetto dalle altre installazioni Python del sistema.

Per creare un ambiente virtuale, entrare nell'ambiente, installare le librerie e gestirlo, puoi seguire questi passaggi:

# 1. Creare un ambiente virtuale nella cartella 'python_api' chiamato 'api_env'
python -m venv api_env

# 2. Attivare l'ambiente virtuale
**Windows**: (PowerShell o Prompt dei comandi): api_env\Scripts\activate

**Linux/Mac**: source api_env/bin/activate

# 3. Installare le librerie necessarie
pip install Flask
pip install Flask-SQLAlchemy

# 4. Creare il file 'requirements.txt' con tutte le librerie installate
pip freeze > requirements.txt

# Altri utenti potranno ricreare lo stesso ambiente con:
pip install -r requirements.txt

# 5. Controllare la versione di Python attiva
python --version

# 6. Controllare le librerie installate
pip list

# 7. Aggiornare pip all’ultima versione
python -m pip install --upgrade pip

# 8. Disattivare l'ambiente virtuale quando hai finito
deactivate

### Cosa c'è nel file main.py?