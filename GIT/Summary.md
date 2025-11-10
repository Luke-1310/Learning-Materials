Link al video -> https://www.youtube.com/watch?v=zTjRZNkhiEU&t=18s

40:10

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

`Working Dir` -> **git add** -> `Staging Area` -> **git commit** -> `Repo` -> **git push** -> `Github`

Una volta creata la cartella in cui si effettuerà il lavoro si passa alla staging area dove si metteranno i file pronti per la commit creando quindi il cosiddetto checkpoint. Per caricare il codice su un cloud provider si utilizza infine il comando git push il quale caricherà il codice su, ad esempio, Github.

---

## GIT commits e logs

In queata sezione ci concentreremo in questa sezione dello schema:

`Working Dir` -> **git add** -> `Staging Area` -> **git commit** -> `Repo`

Il comando **pwd** ci fornisce il percorso della directory corrente. Dopo aver aperto la cartella **gitone** ho creato due file txt e lanciando il comando **git status** difatti ho il seguente risultato:

On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	testone.txt
	testtwo.txt

nothing added to commit but untracked files present (use "git add" to track)

Ovviamente le modifiche sono rilevate e bisognerebbe fare una commit, ma, prima di fare la commit bisogna aggiungere quei file nella "track zone" anche perché risultano non trackati da Git. Supponiamo che testone.txt sia pronto mentre testtwo.txt no, allora useremo il seguente comando:

**git add testone.txt**

Ora il messaggio di **git status** è il seguente:

On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   testone.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	testtwo.txt

Il primo file si trova quindi nella **staging area** che altro non è che una zona intermedia tra tra 

Invece, **git add .** aggiungerebbe tutti i file correnti nella track zone `git add` e `git commit`, per levare un file in questa zona o si fa la commit oppure si usa il seguente comando:

**git rm --cached <file>**

Per fare una commit è necessario aggiungere un messaggio, il quale serve di base per indicare un sunto delle modifiche effettuate e tale implicazione risulta essere obbligatoria:

**git commit -m "add file one"**

E ora dopo averlo lanciato si ha:

On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	testtwo.txt

nothing added to commit but untracked files present (use "git add" to track)

![summarize 1](img/sunto.png)

Ogni volta che viene eseguita un commit, Git salva:

- un identificatore univoco (hash),
- l’autore del commit,
- la data e l’ora,
- il messaggio di commit.

Con **git log** puoi quindi consultare tutta la “storia” del progetto, cioè l’elenco delle versioni salvate nel tempo. Nel mio caso si ha:

commit e715994387b3a5f4782d3455421b6fd536f04157 (HEAD -> master)
Author: Luca Privitera <129418202+Luke-1310@users.noreply.github.com>
Date:   Mon Nov 10 19:03:04 2025 +0100

    Sium2

commit 7c21a8be17d6caeaee8251105e9e1e52bd84aecc
Author: Luca Privitera <129418202+Luke-1310@users.noreply.github.com>
Date:   Mon Nov 10 19:01:10 2025 +0100

    Sium


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

