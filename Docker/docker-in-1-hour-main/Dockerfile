#FROM: costruisce l'immagine a partire da node:19-alpine, una versione leggera di Node.js basata su Alpine Linux
FROM node:19-alpine 

#COPY: copia i file o directory da <src>  e li aggiunge al files
# Copia sia package.json che package-lock.json grazie al wildcard(metacarattere -> *); la barra finale in 'app/' è necessaria per creare la directory, altrimenti si genera un errore.
COPY package*.json /usr/app/

#Copia l'intera cartella src nella cartella /usr/app/ del container
COPY src /usr/app/

# WORKDIR: crea la directory dell'app e la imposta come directory di lavoro, così i comandi successivi verranno eseguiti in /usr/app (equivalente a fare cd /usr/app per eseguire npm install)
WORKDIR /usr/app

#RUN: esegue qualsiasi comando in una shell all'interno del container; in questo caso installa Node
RUN npm install

#CMD: avvia l'applicazione
CMD ["node", "server.js"]

# ---
# Mentre RUN viene eseguito nel conteiner, COPY viene eseguito sull'host
# Ci può essere un solo comando CMD per ogni Dockerfile. Se ce ne sono più di uno, viene eseguito solo l'ultimo.
# ---