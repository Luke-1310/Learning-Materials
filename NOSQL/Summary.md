Link al video -> https://www.youtube.com/watch?app=desktop&v=xh4gy1lbL2k
Canale -> freeCodeCamp.org


## What is NoSQL? Why use NoSQL? SQL vs NoSQL and Setting up

NoSQL è un modalità di approccio per gestire un database super flessibile in quanto consente una grossa varità di tipi diversi di dato come **key value**, **document**, **tabular** e **graph formats**. 

Un databse NoSQL è definito dalle seguenti caratteristiche:

- **Non relazione**: indica che il database non utilizza tabelle relazionali con schemi rigidi come i database SQL.

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

Dopo essermi loggato su Astra ho creato un db dal nome `fcc_tutorial` e con il seguente keyspace `tabular` che è la tipologia di dato che tratterò per primo.

---

## Tabular Type 


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