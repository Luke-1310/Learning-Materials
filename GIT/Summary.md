Link al video -> https://www.youtube.com/watch?v=zTjRZNkhiEU&t=18s

Canale -> freeCodeCamp.org

## Introduzione a GIT series

Sviluppare un'applicazione software è tutto fuorchè semplice; collaborare e avere la possibilità di avere dei checkpoint a cui tornare nel caso in cui lo sviluppo del codice porti a problemi risulta quindi essenziale. 

Per **Version Control System** (Versioning System) è proprio ciò di cui si occupa quanto descritto nel paragrafo precedente; di tenere conto delle modifiche effettuate nel codice e di avere la possibilità di fare dei rollback ove necessario.

L'idea dietro questo riassunto non è tanto quella di imparare i numerosi comandi che GIT offre ma bensì come un software viene sviluppato e funziona; capire quindi il workflow di GIT per poi poter sviluppare un software.

Ovviamente **GIT** e **Github** sono due cose diverse dato che il secondo è un server provider mentre il primo è proprio il tool che vogliamo imparare.

## GIT init e cartelle nascoste

La prima cosa che si è fatto è creare tre cartelle dai nomi:

- **gitone**, **gittwo** e **gitthree**

In generale, con **Repository** o **Repo** si intende una cartella che viene trackata da Git tenenedo traccia di tutti i file e delle modifiche che vengono effettuate nel tempo in quella cartella.

Il primo comando che si va ad analizzare è **git -v** o **git --version** il quale semplicemente fornisce la versione installata di Git.

Bisogna sempre specificare quali cartella Git deve trackare, esso non tracka tutto in automatico. 

Quello che vogliamo fare adesso è trackare le cartelle **gitone**, **gittwo** ma non **gitthree**.

Un altro comando importante è sicuramente **git status** il quale fornisce lo stato attuale della repository Git nella cartella dove viene eseguito. Quindi esso riferisce:

- su quale **branch** ti trovi;
- quali file sono in attesa di **commit**,
- se ci sono **cambiamenti non salvati**.

Quando viene eseguito questo comando esso va a cercare la cartella nascosta **.git** dove c'è lo storico di tutte le operazioni effettuate. Quindi, spostandoci nel cartella **gitone** lanciamo il comando **git -init** il quale crea la sottocartella nascosta che ci serve per tenere traccia della cronologia.

Ovviamente, al contrario di **git status** il quale viene spesso utilizzato, il comando **git init** viene lanciato solamente quando viene inizializzata la repository. 

Il **commit** statement crea un checkpoint da cui poter fare rollback in un secondo momento.

È possibile immaginare il workflow con questo schema:

`Working Dir` -> **git add** -> `Staging Area` -> **git commit** -> `Repo` -> **git push** -> **Github**

Una volta creata la cartella in cui si effettuerà il lavoro si passa alla staging area dove si metteranno i file pronti per la commit creando quindi il cosiddetto checkpoint. Per caricare il codice su un cloud provider si utilizza infine il comando git push il quale caricherà il codice su, ad esempio, Github.

---

## GIT commits e logs

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

---

## GIT internal working e configs

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

---

## GIT merge e GIT conflitcs

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

---

## GIT diff e stashing

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

---

## GIT rebase is not that scary

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

---

## Insight of pushing code to GITHUB

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

---

## How to make pull request and open source contribution

Lorem Ipsum **Lorem Ipsum** (lato server, eseguito su Node.js) di una web application.

Lista
- **A:** a;
- **B:** b;
- c;
- d.

