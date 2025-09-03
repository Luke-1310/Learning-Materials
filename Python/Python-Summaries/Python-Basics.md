I file contengono passo passo il codice scritto nel video.

### freeCodeCamp_Tutorial_Beginners

Link Tutorial -> https://www.youtube.com/watch?v=rfscVS0vtbw&t=4766s

### 1. Setup e Hello World

Il classico primo programma in ogni linguaggio consiste nello stampare a schermo un messaggio, in questo caso *Hello World*. Serve a verificare che l’ambiente di lavoro funzioni correttamente e introduce il comando `print()`, che in Python è utilizzato per mostrare testo o valori in output.

---

### 2. Disegnare una forma con print()

Con più istruzioni `print()` consecutive si possono creare semplici disegni testuali. Ogni `print()` stampa una riga, e i caratteri speciali (come `\n`) permettono di andare a capo. Questo mostra come l’output possa essere controllato e formattato.

---

### 3. Variabili e Tipi di Dato

Le **variabili** sono contenitori che memorizzano informazioni. In Python non è necessario dichiararne il tipo: il linguaggio capisce da solo se si tratta di una stringa, un numero intero, un numero decimale o un valore booleano.
Concatenando stringhe e variabili con `+` o separandole con la virgola in `print()`, possiamo combinare testo e valori. È un concetto fondamentale perché permette di adattare l’output in base ai dati contenuti nelle variabili.

---

### 4. Lavorare con le Stringhe

Le **stringhe** sono sequenze di caratteri. In Python esistono diverse funzioni e metodi per manipolarle:

* trasformare tutto in minuscolo o maiuscolo;
* verificare se una stringa è interamente in maiuscolo;
* calcolare la lunghezza (conteggio dei caratteri, spazi inclusi);
* accedere a un carattere specifico tramite indice (la posizione parte da zero);
* trovare la posizione di un carattere o di una sottostringa.

Le stringhe sono quindi strutture indicizzate e manipolabili, molto utilizzate in ogni programma.

---

### 5. Lavorare con i Numeri

Python gestisce numeri interi e decimali e mette a disposizione numerose operazioni:

* operatori matematici di base (somma, sottrazione, moltiplicazione, divisione e resto con `%`);
* funzioni predefinite come `abs()` per il valore assoluto, `pow()` per le potenze, `max()` per il massimo e `round()` per arrotondare;
* funzioni più avanzate tramite la libreria `math`, come `floor()` e `ceil()` per approssimare verso il basso o verso l’alto e `sqrt()` per la radice quadrata.

Questi strumenti permettono di gestire facilmente calcoli numerici di base e complessi.

---

### 6. Input da parte dell’utente

Il comando `input()` consente di richiedere dati all’utente durante l’esecuzione del programma. Ciò permette di rendere i programmi interattivi, adattando il comportamento in base ai valori inseriti. L’input viene sempre trattato come stringa, ma può essere convertito in altri tipi di dato se necessario (ad esempio in intero o float).

---

### 7. Liste

Le **liste** sono strutture dati fondamentali in Python che permettono di memorizzare più valori in un’unica variabile. Sono indicizzate partendo da 0, quindi gli elementi hanno una posizione precisa, e sono modificabili, permettendo di aggiungere, togliere o cambiare valori.
All’interno di una lista possono convivere tipi diversi di dati (stringhe, numeri, booleani).

Le operazioni principali includono:

* accedere a un elemento tramite il suo indice (parte da zero);
* usare indici negativi per contare dalla fine della lista;
* selezionare sottoinsiemi della lista tramite slicing;
* modificare un elemento assegnandogli un nuovo valore.

---

### 8. Funzioni per le liste

Python mette a disposizione numerosi metodi per lavorare con le liste:

* `extend()` → unisce due liste;
* `append()` → aggiunge un elemento in coda;
* `insert()` → inserisce un elemento in un indice specifico;
* `remove()` → elimina la prima occorrenza di un elemento;
* `pop()` → rimuove l’ultimo elemento;
* `index()` → restituisce la posizione di un elemento;
* `count()` → conta quante volte compare un elemento;
* `sort()` → ordina gli elementi (alfabetico o numerico);
* `copy()` → copia la lista in una nuova;
* `clear()` → svuota la lista.

Questi metodi rendono le liste molto flessibili e adatte a gestire insiemi di dati di qualsiasi tipo.

---

### 9. Tuple

Le tuple sono simili alle liste ma immutabili. Una volta create, non possono essere modificate. Sono utili per rappresentare dati costanti, come coordinate.
Come le liste, sono indicizzate a partire da zero.

---

### 10. Funzioni

Le funzioni permettono di incapsulare un blocco di codice riutilizzabile rendendo il codice più leggibile
Si definiscono con def, possono avere parametri e ritornare valori, anche multipli o di tipo diverso.

---

### 11. If statement

Gli if servono a prendere decisioni basate su condizioni logiche, permettendo al programma di comportarsi in modo diverso in situazioni differenti.
Si possono usare operatori and, or, not ed è possibile impostare più condizioni possono essere concatenate con elif, e un blocco finale con else.

---

### 12. Dizionari

I dizionari sono collezioni di coppie chiave → valore, si accede ai valori usando la chiave, non un indice, le quali sono univoche.
Con get() è possibile specificare un valore di default se la chiave non esiste.
Ideali per associare un identificativo a un’informazione.

---

### 13. While loop

Il ciclo while esegue istruzioni finché una condizione è vera è utile quando non si conosce in anticipo il numero di iterazioni.
È importante gestire correttamente le condizioni di uscita per evitare cicli infiniti.
Può essere interrotto manualmente con break.

---

### 14. For loop

Il ciclo for serve per iterare su sequenze (stringhe, liste, range, ecc.), al contrario del while si usa quando il numero di iterazioni è generalmente definito.
Permette di scorrere elementi direttamente o tramite indici `(range(len(lista)))`.
Utile per processare sequenze o creare griglie di dati.

---

### 15. Liste di liste (griglie)

Una lista può contenere altre liste, creando strutture simili a tabelle o matrici.
Si accede con doppia indicizzazione [riga][colonna] e risultano perfette per rappresentare dati strutturati come matrici o griglie di gioco.

---

### 16. Gestione degli errori (try / except)

Il blocco try / except serve a gestire errori senza far crashare il programma, se nel try si verifica un errore, viene eseguito il blocco except.
È possibile gestire errori generici o specifici (es. ZeroDivisionError, ValueError) rendendo i programmi più robusti e user-friendly.

---

### 17. Moduli

Un modulo è un file .py che contiene funzioni, classi o variabili riutilizzabili.
Si importa con import e gli elementi sono definiti con nome_modulo.elemento.
Aiuta a organizzare il codice e a non riscrivere tutto da zero.

---

### 18. Classi e oggetti

Le classi e gli oggetti sono alla base della programmazione orientata agli oggetti (OOP).
Una classe è un modello che definisce proprietà e comportamenti mentre un oggetto è un’istanza concreta della classe.
Gli attributi sono informazioni contenute in un oggetto (student1.name).
I metodi sono funzioni legate all’oggetto (student1.on_honor_roll()).

---

### 19. Ereditarietà

L’ereditarietà permette a una classe di ereditare attributi e metodi da un’altra, favorisce il riuso del codice e rende più chiara la gerarchia tra classi.
La nuova classe può aggiungere funzionalità o sovrascrivere (override) metodi esistenti.

---