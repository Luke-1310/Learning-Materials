Link al video -> https://www.youtube.com/watch?v=pg19Z8LL06w
Canale -> TechWorld with Nana

## What's Docker?

In parole semplici, **Docker** è una piattaforma di containerizzazione che rende più semplice sviluppare, distribuire ed eseguire applicazioni rispetto alle procedure precedenti alla sua introduzione. Lo fa “impacchettando” le applicazioni in **container**, ciascuno contenente tutto il necessario per funzionare: librerie, dipendenze, configurazioni di runtime e dell’ambiente.

---

## What problems Docker solves in development and deployment process

Prima della sua introduzione, per poter sviluppare un’applicazione lo sviluppatore doveva installare tutto il necessario (database, servizi vari, …) direttamente sulla propria macchina locale. Ad esempio, se sviluppavi un sito in *JavaScript* poteva servirti *PostgreSQL* o *Mosquitto* per la messaggistica, rendendo obbligatoria l’installazione locale di tutti questi componenti. Inoltre, per ogni sistema operativo esistevano procedure e versioni diverse, complicando ulteriormente lo sviluppo.

Con i **container** non è più necessario installare tutti i servizi direttamente sul sistema operativo, perché con **Docker** si ha tutto il necessario in un ambiente isolato. È anche possibile avere più versioni dello stesso servizio in esecuzione sulla propria macchina senza conflitti.

Prima di Docker, il processo di sviluppo di un’applicazione poteva essere riassunto così:

Il team di sviluppo produceva un artefatto (o pacchetto) che descriveva come installare l’applicazione sul server, ad esempio un file *jar* per una app Java, insieme alle istruzioni per installare servizi esterni come un DBMS. Queste informazioni venivano poi passate al team di operations, che si occupava dell’installazione e della configurazione.

Tra i **problemi** di questo approccio c’era la necessità di installare manualmente tutti i componenti sull’OS del server, con possibilità di errori; inoltre, la comunicazione tra i due team poteva causare ulteriori problemi, generando **errori umani**. Con i container questo processo è semplificato perché lo sviluppatore include nel container, oltre al codice sorgente, anche tutte le dipendenze necessarie; essendo tutto isolato, l’unica cosa da installare sul server è il Docker runtime.

L’unica cosa che deve fare il team operativo è eseguire un comando Docker per recuperare ed avviare l’artefatto.

![deployment_schema](img/deployment_with_docker.png)

---

## Virtual Machine vs Docker e Install Docker

All'inizio è stato detto che Docker è uno strumento di virtualizzazione come una macchina virtuale eppure ora analizziamo i vantaggi che hanno portato ad un così ampio utilizzo di Docker. `Se con Docker non c'è bisogno di installare i componenti sull'OS come fa ad utilizzarli?`

Per poter rispondere si parte dall'OS. Un sistema operativo è costituito da due livelli principali, il **Kernel** e l'**Applications Layer**. Il primo comunica con l'hardware della macchina ed è quindi dove va installato il sistema operativo mentre il secondo livello comprende tutte le applicazioni che poi vengono utilizzate; in tal modo, il livello del Kernel fa quindi da intermediario tra l'application layer e l'hardware. Sia Docker che la macchina virtuale, come detto, sono strumenti di virtualizzazione ma la differenza sta in **quale parte dell'OS virtualizzano**. 

**Docker virtualizza l'application layer** contenendo le applicazioni e altri servizi e app installati sopra quel livello e utilizza il Kernel dell'host mentre il **la macchina virtuale virtualizza entrambi i livelli** non utilizzando il kernel dell'host ma il proprio.

![Cosa virtualizzano](img/what_virtualize.png)

Tale differenza comporta che **i pacchetti o immagini di Docker siano molto più leggeri** perché devono implementare un solo livello del sistema operativo nell'ordine di alcuni *MB* contro alcuni *GB*; comportando anche una **maggiore velocità** nel primo caso rispetto al secondo.

Per quanto riguarda la **compatibilità** si ha un discorso diverso dato che le macchine virtuali sono compatibili con tutti gli OS mentre Docker è compatibile solo con distro Linux. Per funzionare su Windows utilizza WSL2 (*Windows Subsystem for Linux*) virtualizzando una leggera distro Linux su Windows.

![Differenze](img/differences.png)

**Docker Desktop** include:

- **Docker Engine**: il cuore di Docker, rende possibile la virtualizzazione gestendo istanze (immagini) e container;

- **Docker CLI - Client**: che è un interfaccia da linea di comando per eseguire i comandi Docker;

- **GUI Client**: ovvero una user frinedly UI

- ...

---

## Docker Images vs Containers

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

---


## Docker Registries

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

---

## Docker Image Versions

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

---



Link a una sezione nello stesso file

[Nome del link](#nome-della-sezione)

Devi mettere il titolo della sezione in minuscolo.

Gli spazi diventano trattini (-).

Caratteri speciali (accenti, punteggiatura, ecc.) vengono rimossi.