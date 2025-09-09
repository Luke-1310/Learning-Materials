Link al video -> https://www.youtube.com/watch?v=Oe421EPjeBE   00:45:38
Canale -> freeCodeCamp.org
REPO -> https://github.com/john-smilga/node-express-course

## Introduzione a Node.js
Node.js è un **ambiente di runtime** che permette di eseguire codice **JavaScript al di fuori del browser**.  
Grazie a questo, è possibile utilizzare lo stesso linguaggio sia per il **front-end** (lato client, eseguito nel browser) che per il **back-end** (lato server, eseguito su Node.js) di una web application.

Node.js è costruito sul **motore V8 di Google Chrome** (lo stesso che interpreta JavaScript nei browser), ma estende le funzionalità di base con **API aggiuntive** che permettono, ad esempio, di:
- leggere e scrivere file sul disco;
- gestire connessioni di rete;
- creare server web;
- utilizzare pacchetti tramite il **Node Package Manager (npm)**.

---

## Differenze tra Browser JavaScript e Node.js

### 1. DOM
- **Browser:** dispone del **DOM (Document Object Model)** che permette di manipolare gli elementi della pagina (HTML, CSS).
- **Node.js:** non ha il DOM perché non lavora con interfacce grafiche o pagine web, ma lato server.
---

### 2. Window
- **Browser:** ha l’oggetto **`window`**, che rappresenta la finestra del browser e contiene funzioni globali come `alert()`, `setTimeout()`, `localStorage`, ecc.
- **Node.js:** non esiste `window`. L’ambiente globale è chiamato **`global`** e fornisce strumenti diversi (es. `process`, `Buffer`).
---

### 3. Applicazioni
- **Browser:** usato per creare **applicazioni interattive lato client**, come siti web dinamici.
- **Node.js:** usato per creare **applicazioni lato server**, come API, sistemi di backend, automazioni.
---

### 4. File System
- **Browser:** non può accedere direttamente al **file system** per motivi di sicurezza (può solo leggere/salvare file tramite input/output controllati dall’utente).
- **Node.js:** include il modulo **`fs`** che permette di leggere, scrivere e gestire file e cartelle nel sistema operativo.
---

## 5. Compatibilità / Versioni
- **Browser:** esistono diversi browser (Chrome, Firefox, Safari, Edge), ciascuno con supporto differente alle nuove funzionalità JS → problema di **frammentazione**.
- **Node.js:** la compatibilità dipende dalla versione di Node.js e dal motore V8 incluso → si parla quindi di **versioni**, non di frammentazione tra vendor.
---

## 6. Moduli
- **Browser:** supporta i **moduli ES6** (`import` / `export`) nativamente, anche se il supporto completo è arrivato solo negli ultimi anni.
- **Node.js:** ha storicamente utilizzato i moduli **CommonJS** (`require` / `module.exports`).  
  Oggi supporta anche i **moduli ES6**, ma CommonJS è ancora molto diffuso.

Dopo aver installato Node.js, ho aggiunto il **path** alla variabile d’ambiente, per poi testare `1-intro.js` dal terminale di VS Code.

### 6.1 Modules Setup
In Node.js **ogni file è un modulo**. Un modulo contiene solo il codice che vogliamo condividere o riutilizzare; quando importiamo un nostro file/modulo (non uno di terze parti installato con npm), bisogna usare sempre il prefisso `./` per indicare che si trova nella stessa cartella.

#### Esempio pratico

**file1.js**
```js
const sayHi = (name) => {
    console.log(`Hello there ${name}`)
}

module.exports = sayHi
```

**file2.js**
```js

const Luca = 'Luca'
const Marco = 'Marco'

module.exports = { Luca, Marco }
```

**file3.js**
```js
const sayHi = require('./file1')
const names = require('./file2')

sayHi(names.Marco)

//Output: Hello there Marco
```

## Variabili globali

Come detto in precedenza, in Node.js non esiste l’oggetto `window` perché non ci troviamo in un **browser**.  
Esiste comunque il concetto di **variabili globali**: esse possono essere utilizzate ovunque nel programma. Alcune delle principali sono:

- **`__dirname`**: restituisce il percorso della cartella in cui si trova il file corrente.
- **`__filename`**: restituisce il percorso completo del file corrente.
- **`require`**: funzione che permette di importare moduli (sistema CommonJS).
- **`module`**: contiene informazioni sul modulo corrente (ossia il file in esecuzione).
- **`process`**: fornisce informazioni sull’ambiente in cui il programma è in esecuzione (ad esempio variabili d’ambiente, architettura, PID, ecc.); è spesso utilizzato per sapere su quale server o porta un’API viene eseguita.
