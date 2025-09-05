I file contengono passo passo il codice scritto nel video.
56:20
### nome cartella

Link Tutorial -> https://www.youtube.com/watch?v=WXsD0ZgxjRw

### 1. Definizione di Interfaccia

La "I" nella sigla API (Application Programming Interface) sta per interfaccia e rappresenta il punto di contatto che permette all’utente o ad altri programmi di interagire con un oggetto (software o hardware) senza dover conoscere o gestire il suo funzionamento interno.
Le interfacce evolvono nel tempo, adattandosi alle esigenze richieste dagli utenti o dagli sviluppatori.

Un esempio semplice di interfaccia fisica è il bottone presente sugli AirPods: grazie a esso, l’utente può inviare un comando (ad esempio, riprodurre o mettere in pausa una canzone) senza preoccuparsi di come quel comando venga tradotto internamente dal dispositivo.
Dal punto di vista dello sviluppatore, invece, esistono interfacce software che consentono di collegare l’interazione dell’utente (il click del bottone) all’esecuzione di uno specifico blocco di codice.

È rilevante notare che quel codice, molto probabilmente, utilizza un’API interna del sistema operativo (ad esempio un media player API su Android o iOS). In pratica:

lo sviluppatore richiama un metodo di quell’API (es. playSong());

l’API si occupa di gestire tutta la complessità tecnica necessaria (decodifica, gestione file, riproduzione audio, ecc.);

eventualmente, quell’API stessa può interagire con una web API per recuperare la canzone da un servizio online.

### 2. Definizione di API

Un’API è una sorta di contratto: definisce le modalità con cui un servizio, una libreria o un sistema possono essere utilizzati e specifica cosa aspettarsi come risultato.
Si può immaginare come un insieme di strumenti messi a disposizione dello sviluppatore per semplificare l’accesso a funzioni, servizi o dati.

⚠️ ATTENZIONE: nel linguaggio comune il termine API viene spesso usato come sinonimo di web API, ma in realtà ne esistono di diversi tipi:

Librerie/API locali (es. API di sistema operativo per gestire file, memoria, processi, ecc.);

API hardware (per interagire con dispositivi come stampanti, GPU, microfoni, ecc.);

Web API (le più diffuse, per interagire con servizi remoti tramite Internet, solitamente con HTTP e JSON).

Un esempio pratico: nonostante esistano diversi browser (Firefox, Chrome, Edge…), lo sviluppatore può scrivere codice che funziona in tutti grazie alle Web API standardizzate (es. DOM API, Fetch API). Queste garantiscono compatibilità e semplificano lo sviluppo.

In altre parole: non serve capire nei dettagli come funziona internamente un’API, ma è fondamentale saperla usare e implementare correttamente secondo la documentazione.

### 3. Remote APIs

Le API remote hanno la caratteristica di poter essere “chiamate” a distanza, cioè su un server esterno rispetto al dispositivo che le utilizza.
Questo approccio è molto utile quando il dispositivo locale non ha abbastanza memoria, spazio di archiviazione o potenza di calcolo per gestire direttamente l’operazione richiesta.

Un esempio pratico è l’app Shazam: non contiene al suo interno tutte le canzoni del mondo, ma invia un estratto audio a un server remoto tramite un’API. Sarà il server ad analizzare l’audio e restituire come risultato il titolo della canzone.
In questo caso l’utente e lo sviluppatore non hanno bisogno di conoscere il funzionamento interno dell’algoritmo: è sufficiente usare l’interfaccia messa a disposizione. Il vantaggio è che gran parte della complessità e dell’elaborazione viene gestita da un server remoto, evitando di gravare sul dispositivo dell’utente.

Le Web API remote sono spesso implementate seguendo il modello REST (Representational State Transfer), che negli anni è diventato così diffuso da venire quasi automaticamente associato al termine API. REST semplifica molto l’uso delle API, rendendole standardizzate e facili da integrare, ma presenta anche alcune limitazioni:

* è basato su HTTP e quindi legato a operazioni tipiche (GET, POST, PUT, DELETE);
* non è sempre efficiente per applicazioni che richiedono comunicazioni in tempo reale (in questi casi si usano alternative come WebSocket o gRPC);
* la gestione di dati molto complessi può risultare macchinosa.

### 4 Come funziona il WEB?

Si supponga di avere un computer con al suo interno un web browser: in questo caso, esso viene considerato un client.
Quando il client è collegato a Internet, può accedere a una certa risorsa sul Web utilizzando un URL (Uniform Resource Locator), che rappresenta un tipo di URI (Uniform Resource Identifier).

Un esempio di URL è: http://spacejam.com

Si può notare la parte iniziale http, che sta per HyperText Transfer Protocol.
Un protocollo è un insieme di regole che definisce chiaramente come due dispositivi devono comunicare.

### 4.1 Richiesta e risposta HTTP

* Una richiesta HTTP è composta da un metodo (ad esempio GET, POST, PUT, DELETE…), che indica l’azione che il client vuole compiere. 

* La risposta HTTP contiene vari elementi, tra cui:
* il BODY, che rappresenta la parte più importante. Ad esempio, per una pagina web, il body contiene il codice HTML che verrà interpretato dal browser. Il BODY è tipicamente rappresentato in un file JSON (JavaScript Object Notation) il quale è una buona soluzione per salvare i dati.
* gli headers: coppie chiave-valore che accompagnano sia le richieste sia le risposte. Essi forniscono informazioni aggiuntive, come il tipo di contenuto (Content-Type), il linguaggio (Accept-Language), la lunghezza dei dati (Content-Length), ecc.

### 4.2 Caratteristiche del protocollo HTTP

* HTTP è un protocollo stateless: una volta risolta la richiesta, non mantiene informazioni sullo stato della comunicazione. Per ovviare a questa limitazione, sono stati introdotti strumenti come i cookie e le sessioni, che permettono di ricordare dati tra una richiesta e l’altra.

* Esiste una tecnica importante chiamata caching, che consente di memorizzare copie locali delle risorse. In questo modo, se una pagina è già presente nella cache, non è necessario richiederla di nuovo al server, riducendo i tempi di caricamento.

### 4.3 Status code

Ogni risposta HTTP contiene anche uno status code, che indica l’esito della richiesta. Alcuni esempi:

* 200 OK → la richiesta è andata a buon fine;
* 301 Moved Permanently → la risorsa è stata spostata in un altro indirizzo;
* 404 Not Found → la risorsa non è stata trovata;
* 500 Internal Server Error → errore generico lato server.

### 5 REST

REST sta per *"Representational State Transfer"*. Le API che rispettano i vincoli dello stile architetturale REST vengono dette RESTful API.

I vincoli architetturali fondamentali sono i seguenti:
* Architettura Client-Server: separazione chiara tra client e server.
* Statelessness: ogni richiesta deve contenere tutte le informazioni necessarie, senza dipendere da uno stato mantenuto dal server.
* Cacheability: le risposte devono specificare se sono memorizzabili in cache per migliorare le prestazioni.
* Layered System: l’architettura può essere organizzata in livelli (proxy, gateway, load balancer…), e il client non deve preoccuparsi di quali intermediari stia attraversando.
* Code on Demand (opzionale): il server può fornire codice eseguibile al client (ad esempio JavaScript) per estenderne le funzionalità.
* Uniform Interface: le risorse devono essere identificate in modo uniforme e accessibili con un set standard di operazioni (GET, POST, PUT, DELETE…).

### 6 Usare un'API da linea di comando

cURL è uno strumento open source utilizzato per inviare e ricevere dati da un server, supportando numerosi protocolli (HTTP, HTTPS, FTP, SMTP, ecc.).
Può essere eseguito localmente dal proprio computer tramite riga di comando, ed è molto utile per testare API, scaricare file o automatizzare richieste di rete.

Ad esempio, per effettuare una semplice richiesta GET a una pagina web: *"curl https://icanhazdadjoke.com"*

Per inviare una richiesta POST con dei dati in formato JSON: 

curl -X POST http://example.com/api \
     -H "Content-Type: application/json" \
     -d '{"username":"Luca","password":"1234"}'

Questo permette di simulare facilmente il comportamento di un client (come un browser o un’applicazione) senza dover scrivere codice.

📖 Documentazione ufficiale: https://curl.se/

Twilio è una piattaforma cloud che fornisce API di comunicazione per inviare SMS, effettuare chiamate, usare WhatsApp, email e altro ancora.
Le API di Twilio sono RESTful, quindi si possono utilizzare tramite semplici richieste HTTP.

Per testarle o inviare comandi velocemente dal terminale si può usare cURL, uno strumento che consente di eseguire richieste HTTP senza dover scrivere codice.

📖 Documentazione: https://www.twilio.com/docs