Link al video -> https://www.youtube.com/watch?v=Oe421EPjeBE   18:56
Canale -> freeCodeCamp.org

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
---

Si è installato Node.js, ho aggiunto la variabile d'ambiente per poi provare il semplice programmino app.js e si è avviato senza problemi