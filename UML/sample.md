## La fase di analisi

### Ciclo di vita del software (modello a spirale)
*(Nel documento è presente un’immagine del modello a spirale: viene rappresentato il ciclo iterativo dello sviluppo software, in cui ogni fase si ripete ciclicamente con incrementi successivi.)*

L’analisi è la fase del ciclo di sviluppo del software caratterizzata da:

- **INPUT:** raccolta dei requisiti  
- **OUTPUT:** schema concettuale (modello di analisi) dell’applicazione  
- **OBIETTIVO:** costruire un modello dell’applicazione che sia:  
  - completo, preciso e rigoroso  
  - leggibile e indipendente dai linguaggi di programmazione  
  - traducibile in un programma  
  - focalizzato su *cosa* fare, non *come* farlo  

### Lo schema concettuale è costituito da:
- **Diagramma delle classi e degli oggetti** → descrive classi, proprietà e oggetti significativi.  
- **Diagramma delle attività** → descrive le funzionalità fondamentali del sistema.  
- **Diagramma degli stati e delle transizioni** → mostra il ciclo di vita delle istanze delle classi.  
- **Documenti di specifica** → condizioni che i programmi devono rispettare (uno per classe e uno per ogni use case).

> Nota: i vecchi metodi orientati alle funzioni (diagrammi funzionali) sono superati. Oggi si usano metodi orientati agli oggetti come UML.

---

## Introduzione a UML

**UML = Unified Modeling Language (1994).**

### Tipi di diagrammi UML

- **Diagrammi strutturali:**
  - Classi e oggetti

- **Diagrammi comportamentali:**
  - Attività  
  - Stati e transizioni  
  - Use case  
  - Interaction
  
- **Diagrammi architetturali:**
  - Component diagram  
  - Deployment diagram  

### Nel corso verranno usati solo:
- **Diagramma delle classi e oggetti**  
- **Diagramma delle attività**  
- **Diagramma degli stati e transizioni**  

---

## Diagramma delle classi e degli oggetti per l’analisi

### Oggetti in UML
- Modellano elementi del dominio con vita propria.  
- Ogni oggetto ha un **identificatore univoco** e appartiene a una **classe più specifica**.  

*Esempio (nell’immagine originale):*  
Oggetto `DivComm` (identificatore), istanza della classe `Libro` (sottolineata).  

### Classi in UML
- Modelli di insiemi di oggetti omogenei.  
- Hanno proprietà statiche (attributi) e dinamiche (operazioni).  
- Ogni classe ha un **nome** e un insieme di proprietà comuni agli oggetti.  

---

## Rapporto tra classi e istanze
- Relazione **instance-of**: collega un oggetto alla sua classe.  

---

## Proprietà di classi: Attributi
- Gli attributi sono proprietà locali, definite con **nome** e **tipo**.  
- Sono **astrazioni di valore** (tipi primitivi, collezioni), non di entità.  

*Esempio (immagine originale):*  
- `Titolo: Titolo` → NO  
- `Autore: Persona` → NO  
- `Autore: stringa` → SÌ  

(*Perché sarebbe contro l’information hiding riferirsi a un’altra classe per un attributo.*)

---

## Attributi degli oggetti
- Gli oggetti hanno gli attributi definiti nella classe.  
- Ogni attributo deve avere un valore valido per tipo.  
- **Regole importanti:**
  - Nessun attributo può esistere senza definizione nella classe.  
  - Oggetti diversi hanno sempre identificatori diversi, anche se gli attributi coincidono.  

---

## Proprietà di classi: Associazioni
- Relazioni tra istanze di due (o più) classi.  
- Formalmente, un’associazione è un sottoinsieme del prodotto cartesiano delle istanze.  
- **Istanza di associazione = link** (coppia o ennupla di oggetti).  

*Nota: i link non hanno identificatori, ma sono determinati dagli oggetti coinvolti.*

---

## Nomi, ruoli e attributi nelle associazioni
- I nomi possono avere un verso logico (ma non significano direzione univoca).  
- I ruoli specificano il “ruolo” di una classe nella relazione.  

*Esempio (immagine originale):*  
- `Persona --lavora-in--> Azienda`  
  - Ruolo: “dipendente” (per la Persona).  

- Nei casi come **genitore-figlio**, i ruoli sono obbligatori per evitare ambiguità.  

- Le associazioni possono avere attributi.  

---

## Molteplicità
Le molteplicità specificano il numero di istanze coinvolte.  
Notazioni tipiche:
- `0 .. *` (nessun vincolo)  
- `0 .. 1`  
- `1 .. *`  
- `1 .. 1`  
- `0 .. y`  
- `x .. y`  

Anche gli attributi possono avere molteplicità (es. telefono con più numeri).  

---

## Associazioni n-arie
- Coinvolgono ≥3 classi.  
- Un link n-ario è una ennupla di oggetti.  

---

## Associazioni ordinate
- `{ordered}` indica che i link sono ordinati.  

*Esempio (immagine originale):*  
`Graduatoria {ordered}` → i membri della graduatoria hanno un ordine definito.  

---

## Generalizzazione e ereditarietà
- Relazione **is-a** tra superclassi e sottoclassi.  
- Ogni sottoclasse eredita tutte le proprietà della superclasse.  
- Le generalizzazioni possono essere **disgiunte** o meno.  
- Le sottoclassi possono aggiungere proprietà o specializzare quelle ereditate.  

---

## Operazioni
- Le classi hanno anche proprietà dinamiche (metodi).  
- Definite tramite **segnatura** (nome, parametri, tipo di ritorno).  
- Esempio: `p.Età(oggi)` → invocazione su oggetto della classe Persona.  

---

## Tipi complessi
Si possono usare tipi come record, liste, insiemi.  

*Esempio:*  
- `Indirizzo` con campi `strada: stringa`, `numero civico: int`.  
- `Data` con campi `giorno: 1..31`, `mese: 1..12`, `anno: int`.  

---

## Metodo per costruire il diagramma delle classi
1. Individua classi e oggetti.  
2. Individua attributi.  
3. Individua associazioni.  
4. Attributi delle associazioni.  
5. Molteplicità.  
6. Generalizzazioni.  
7. Specializzazioni.  
8. Operazioni.  

---

## Controllo di qualità
- Scelte corrette tra classi, attributi e associazioni?  
- Generalizzazioni senza cicli?  
- Specializzazioni coerenti?  

---

## Scelta tra attributi, classi e associazioni
- **Classe**: se le istanze hanno vita propria e proprietà indipendenti.  
- **Attributo**: se non hanno vita propria.  
- **Associazione**: se rappresentano n-ple di istanze.  

---

## Verifiche finali
- Generalizzazioni → niente cicli.  
- Specializzazioni → corretta restrizione di attributi e associazioni.  
- Eventuale introduzione di nuove generalizzazioni/classi se necessario.  

mantenendo questo formato (devi quindi mettere le ## per esempio), renendendolo discorsivo e aggiungendo informazioni ove necessario