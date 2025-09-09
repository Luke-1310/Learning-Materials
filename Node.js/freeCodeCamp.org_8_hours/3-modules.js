const names = require('./4-names') //importo il modulo names
const sayHi = require('./5-utils') //importo il modulo utils

console.log(names) //vedo l'oggetto con le due costanti

sayHi('Susan') //gli passo direttamente la stringa
sayHi(names.Luca) //gli passo la constante
sayHi(names.Marco) //gli passo la constante