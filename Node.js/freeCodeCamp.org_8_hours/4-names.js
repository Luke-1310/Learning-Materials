//globali
const Luca = 'Luca'
const Marco = 'Marco'

//locale
const Secret = 'SUPER SECRET'

console.log(module) //Ogni file in node è un modulo, e ha una proprietà chiamata exports, che è un oggetto vuoto. 
                    //Quindi per esportare qualcosa da un modulo, lo si deve aggiungere a module.exports

module.exports = {Luca, Marco} //esporto un oggetto con le due costanti

