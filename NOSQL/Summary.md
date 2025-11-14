Link al video -> https://www.youtube.com/watch?app=desktop&v=xh4gy1lbL2k
Canale -> freeCodeCamp.org


## What is NoSQL? Why use NoSQL? SQL vs NoSQL and Setting up

NoSQL è un modalità di approccio per gestire database in maniera super flessibile in quanto consente una grossa varità di tipi diversi di DB come **key value** (*database chiave-valore*), **document** (*database a documenti*), **tabular** (*database a colonne*) e **graph formats** (*database a grafi*). 

Un databse NoSQL è definito dalle seguenti caratteristiche:

- **Non relazionale**: indica che il database non utilizza tabelle relazionali con schemi rigidi come i database SQL.

- **Distribuito**: significa che i dati sono suddivisi e replicati su più nodi o server. 

- **Scalabile**: il sistema può crescere facilmente aggiungendo nuovi nodi senza grandi modifiche.

Inoltre, esso è anche **partition tolerant** (tollerante alle partizioni) ovvero è capace di funzionare anche quando alcuni nodi non riescono più a comunicare tra loro a causa di problemi di rete.

La differenza principale tra **SQL** e **NoSQL** è che il primo è un linguaggio con delle proprie regole per effettuare query mentre il secondo è un approccio per gestire un database; infatti si potrebbe dire che `NoSQL` stia per `Not only SQL`.

Ci sono due ragioni principali sul perché si dovrebbe usare un NoSQL databse:

1) **Application Development Productivity**: quando si sviluppa un'applicazione ci vuole molto tempo per gestire tutti i tipi di dati necessari e a tal proposito permette di semplificare tale onere.

2) **Large Scale Data**: grandi quantità di informazioni sono semplici da gestire con questa tipologia di approccio invece di utilizzare un databse relazionale.

Riassumendo, le differenze tra un SQL e NoSQL sono:

![NoSQL vs SQL](img/NoSQL_vs_SQL.png)

Per `scale up` si intende uno sviluppo verticale che serve nel rendere più performante un singolo database.

Per `scale out` si intende uno sviluppo orizzontale ovvero l'aggiunta di più nodi al sistema permettendo la distribuzione dei dati. 

Un database è composto da più livelli:

- **Interfaccia**: è il primo livello, quello con cui l’utente interagisce. Include linguaggi come SQL o API che permettono di interrogare, modificare e gestire i dati senza doversi preoccupare dei dettagli interni. Come interfaccia si utilizzerà *DataStax Astra DB* ovvero un `Database-as-a-Service (DBaaS)` completamente gestito, basato su *Apache Cassandra*. Siccome esso utilizza proprio *Apache Cassandra* si accennerà anche al **CQL (Cassandra Query Language)**. Esso offre un modello simile a SQL dove i dati vengono posti in tabelle contenenti righe e colonne.

- **Livello di esecuzione**: è il livello intermedio che interpreta le richieste dell’interfaccia. Comprende i meccanismi che traducono le query o le operazioni in istruzioni comprensibili dal motore del database (parser, ottimizzatore di query, piani di esecuzione).

- **Livello di Storage**: è il livello più basso e si occupa della gestione fisica dei dati. Include l’archiviazione su disco, gli indici, la gestione delle transazioni, la concorrenza e la struttura dei file che contengono i dati reali.

Dopo essermi loggato su Astra ho creato un db dal nome `fcc_tutorial` e con il seguente keyspace `tabular` che è la tipologia di database che tratterò per primo. Per keyspace si intende il primo livello di suddivisione logica dei dati all'interno di un cluster NoSQL; raggruppa quindi tabelle e definisce le reegola di replica e distribuzione per quel gruppo di tabelle.

---

## Tabular Type 

Conosciuto anche come database a colonne esse consiste in tabelle relazionali, ovvero con un certo schema alla base. Ho creato una tabella dal nome `Books` con i seguenti attributi:

- `Book ID`: *"UUID -> universal unique identifier"*
- `Author`: *text*
- `Title`: *text*
- `Year`: *int*
- `Categories`: *set of text*
- `Timestamp`: *timestamp*

Ho definito lo schema della tabella e il campo **“Book ID”** fungerà da chiave del record, ovvero l’elemento utilizzato per individuare rapidamente quel dato.
Nei database NoSQL questa chiave è chiamata **“chiave di partizione”** perché determina in quale nodo del cluster verranno memorizzati i dati. Le righe che condividono la stessa chiave di partizione vengono infatti salvate nello **stesso nodo**, e una query basata su quella key restituirà **tutte** le righe associate a quella partizione.

Quindi, ora, su Astra ho iniziato digitando il seguente comando nella CQL Console `describe keyspaces;` per visualizzare tutte le keyspaces presenti nel db in quel momento. Il seguente comando permette di usare una specifica keyspace `use tabular;` per poi digitare `CREATE TABLE IF NOT EXISTS books (...)` con tutti i campi come segue:

`CREATE TABLE IF NOT EXISTS books (`
        `... bookid uuid,`
        `... author text,`
        `... title text,`
        `... year int,`
        `... categories set <text>,`
        `... added timestamp,`
        `... PRIMARY KEY (bookid)`
        `... );`

per poi fare la seguente insert:  `INSERT INTO books(bookid, author, title, year, categories, added) VALUES (uuid(), 'Bobby Brown', 'Dealing With Tables', 1999, {'programming', 'computers' }, toTimeStamp(now()));`. Per poi vedere se funziona basta fare `SELECT * from books` e... 

![insert_img](img/first_insert.png)

funziona! 24:10

---

## Document Type 


---

## Key-Value Type


---

## Graph Type


---

## Multi-model Type explained


---

## Project 1


---

## Project 2


---

## Where to go next

---