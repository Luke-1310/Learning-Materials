Link al video -> https://www.youtube.com/watch?v=hmkF77F9TLw
Timestamp -> 00:00:00
Canale -> freeCodeCamp.org
REPO VIDEO-> .

## Introduzione

Un'**architettura a microservizi** è un'applicazione sviluppata come un insieme di servizi indipendenti, che possono essere realizzati combinando diverse tecnologie all'interno di un'unica soluzione.

Le tecnologie che verranno utilizzate sono **Python**, **Docker**, **Kubernetes**, **MySQL**, **MongoDB** e **RabbitMQ**.

L'applicazione avrà lo scopo di **convertire file video in file MP3**, e verrà analizzata con un approccio *top-down*.

![top-down](img/top_down_view.png)

## Funzionamento dell'applicazione

Quando l’utente caricherà un video, esso passerà attraverso il **Gateway**.  
Il video verrà quindi salvato su **MongoDB** e, contemporaneamente, verrà inserito un messaggio nella **queue** di **RabbitMQ** per notificare ai *Downstream Services* che è disponibile un nuovo video da convertire.

Il **servizio di conversione** (da video a MP3) leggerà il messaggio dalla coda, estrarrà l’**ID del video**, recupererà il file corrispondente da MongoDB, lo convertirà in formato MP3 e invierà un nuovo messaggio al **sistema di notifiche**.  
Quest’ultimo avviserà il client che il file MP3 del video è pronto per il download.

Infine, l’utente potrà utilizzare l’**ID univoco** ricevuto nella notifica per inviare una richiesta all’**API Gateway** e scaricare il file MP3.



Lista
- **A:** a;
- **B:** b;
- c;
- d.

---
