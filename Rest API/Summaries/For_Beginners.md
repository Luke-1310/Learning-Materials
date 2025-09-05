I file contengono passo passo il codice scritto nel video.

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

è basato su HTTP e quindi legato a operazioni tipiche (GET, POST, PUT, DELETE);

non è sempre efficiente per applicazioni che richiedono comunicazioni in tempo reale (in questi casi si usano alternative come WebSocket o gRPC);

la gestione di dati molto complessi può risultare macchinosa.