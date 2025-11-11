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
Author: Luca Privitera <129418202+Luke*-1310*@users.noreply.github.com>
Date:   Mon Nov 10 19:01:10 2025 +0100

    Sium
---

## GIT internal working e configs

Per prima cosa, in questa sezione, si vuole capire meglio come Git apprende quelle informazioni sull'autore etc...

Il comando **git config** serve per visualizzare o modificare le impostazioni di configurazione di Git. Tra le varie informazioni si ha:
- Nome ed indirizzo email usati nei commit
- Preferenza globali, ovvero l'editor di testo o i colori del terminale
- Altre impostazioni specifiche per una singola repository.

In generale ci sono due modalità con cui possiamo configurare il "configuratio file":

- **globlamente** con **git config --global** per impostare la configurazione per tutte i repo dell'utente sul computer. Ad esempio si potrebbe fare: 

-   `git config --global user.name "Luca Rossi"`
-   `git config --global user.email "luca@example.com"`

- **localmente** per impostare la configurazione solo nel repo corrente, ovvero la cartella in cui viene eseguito il comando. Ne segue:

-   `git config user.name "Luca Progetto1"`
-   `git config user.email "progetto1@example.com"`

È stato poi impostato come editor predefinito VS Code per tutte le repo, lanciando questo comando:

**git config --global core.editor "code --wait"**

E come verifica si è utilizzato il comando: **git config --global core.editor** che ha fornito come risultato proprio `code --wait`. Per rendere il sistema corrente di tale cambio, nella barra di ricerca di VS Code è stato digitato ">code" per poi aggiungerlo al PATH.

Un altro file importante è sicuramente **.gitignore**, il quale permette di ignorare dei file dalla tracking zone; in tal modo, è possibile fare una selezione dei file di cui si vuole fare la commit e quali no. Ad esempio informazioni sensibili come l'API key non dovrebbero essere caricate per ovvie motivazioni.

È possibile usare dei generatori di template per questa tipologia di file (.gitignore) basato sulla tipologia di progetto su cui si sta lavorando. 

Il comando **git log --oneline** mostra la cronologia dei commit in una forma breve e leggibile occupando una sola riga, il codice abbreviato del commit (hash) e il messaggio associato. Un esempio potrebbe essere:

`a1b2c3d (HEAD -> main) Aggiunge il file README.md`

---

## GIT merge e GIT conflitcs

In questo paragrafo si vuole cercare di capire meglio il significato di **branch master**; ci si sposta quindi in gittwo, lo si inizializza, si crea un file index.html e mettiamo come visibile la cartella ".git" mediante le impostazioni di VS Code.

Il comando **git branch** serve per gestire i rami (branch) di un repository Git. Un branch è una linea di sviluppo indipendente, cioè una versione parallela del progetto dove puoi lavorare senza toccare il codice principale (di solito nel branch **main** o **master**). Il risultato del comando è:

**git branch**

`* master`

ciò significa che in questo momento stiamo lavorando sul ramo denominato come "master". Graficamente si può rappresentare come segue:

![branch_example](img/branch_example.png)

Il ramo verde è quello principale (**master**) mentre ogni nodo corrisponde ad una commit a partire dalla quale è possibile fare un rollback se necessario.

È stata fatta una commit con il file index.html nel branch "master".

Per creare più rami (branches) bisogna innanzitutto avere il nome del nuovo ramo, ad esempio *nav-bar*; quindi si lancia il seguente comando: "git branch nav-bar".

Ora si hanno due rami seppur si sta ancora puntando a quello principale.

* master
  nav-bar

Per cambiare ramo basta digitare **git checkout `nome-ramo`** di cui si può vedere i risultati:

git branch
  master
* nav-bar

Ora bisogna fare un'ulteriore commit affinchè venga creato un nuovo ramo parallelo. A tale scopo viene creato un file *"nav-bar.html"* (**NEL NAV-BAR BRANCH**) per poi add e commit.

Successivamente passando al ramo "master" mediante il comando **git checkout master** il file *nav-bar.html* è sparito! Questo perchè abbiamo cambiato ramo, ovviamente!

Ora in questo ramo è stato creato un file **hero-section.html** e committato. Quindi passando da un ramo all'altro avremmo un secondo file differente in base al ramo scelto:

- hero-section.html nel ramo "master"
- nav-bar.html nel ramo "nav-bar"

Con **head** si intende il nodo in cui si trova il ramo il quale, solitamente, è sempre l'ultimo ma, chiaramente, è possibile puntare anche ad un nodo precedente ove necessario.

È possibile anche unire diversi rami, ciò prende il nome di **merge**. Un worflow semplice consiste nel lavorare in un ramo separato per poi unire quanto fatto nel ramo principale, di seguito uno schema rappresentativo:

![merge](img/merge.png)

Per unire i due rami, master e merge bisogna stare attenti anche ai conflitti che potrebbero insorgere unendoli; in questo caso sono file differenti, quindi non ci dovrebbero essere problemi.

Per fare questa unione, una volta situati nel ramo master, il comando è:

**git merge nav-bar**

così da unire i due rami! 

Per poter cancellare la branch "nav-bar", che ormai ha concluso il suo scopo, basta andare in una branch diversa (master) e digitare:

**git branch -d nav-bar**

Qualora si volesse passare ad una nuova branche in un solo comando si può fare_ **git checkout -b footer**, per riunirla col branch master nuovamente.

Ora, è chiaro che i due merge sono andati a buon fine perché i file erano tutti diversi non provocando nessun **conflitto**.

Un **conflitto** in Git si verifica quando due branch modificano **le stesse righe di codice** in un file, e Git **non sa quale versione tenere** durante un’operazione di *merge* o *rebase*.

In questi casi, Git interrompe il processo e ti chiede di risolvere il conflitto manualmente. Vediamo un esempio pratico:

Nel file mostrato, Git ha trovato un conflitto tra il branch corrente (`HEAD`) e il branch `footer`.

<<<<<<< HEAD
footer added
=======
footer was added successfully
>>>>>>> footer

Tutto ciò che si trova tra <<<<<<< HEAD e ======= rappresenta la versione corrente (cioè quella del branch in cui ti trovi).

Tutto ciò che si trova tra ======= e >>>>>>> footer rappresenta la versione in arrivo dal branch che stai cercando di unire (footer in questo caso).

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

