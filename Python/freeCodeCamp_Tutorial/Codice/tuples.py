#le tuple sono un tipo di strutture dati nella quale possiamo memorizzare diversi tipi di dati, è molto simile ad una lista
#una tupla è immutabile, quindi non possiamo modificare i suoi valori dopo la creazione, indicizzate partendo da zero

#un classico utilizzo di un tupla è per gestire delle coordinate
coordinates = (4, 5) #0, #1

#voglio stamapre 5
print(coordinates[1])

#lista di tuple
coordinates_list = [(4, 5), (6, 7), (80, 34)]

#funzioni

#definizione
def stampa_coordinate(coordinates):  #parametro
    
    for coord in coordinates:
        print(f"X: {coord[0]}, Y: {coord[1]}")

#chiamata alla funzione
stampa_coordinate(coordinates_list)

#chiaramente le funzioni posso anche ritornare delle informazioni

#inserisci da tastiera
num = int(input("Inserisci un numero: "))
nome = str(input("Inserisci il tuo nome: "))

def eleva_a_potenza(num):
    return num ** 2, nome + " è giovane" #ritorna elementi di tipo diverso

print(eleva_a_potenza(num))

#if statement
is_male = True
is_tall = False
height = 180

if is_male and is_tall or height >= 180:
    print("Sei un uomo alto.")

elif is_male and not is_tall and height < 180:
    print("Sei un uomo basso.")

elif not is_male and is_tall:
    print("Sei una donna alta.")

else:
    print("Sei una donna bassa.")

#I dizionari permettono di salvare delle informazioni con una certa chiave associata
#la chiave, il primo valore, deve essere univoca per evitare conflitti
monthConversions = {
    "Gen": "Gennaio",
    "Feb": "Febbraio",
    "Mar": "Marzo",
    "Apr": "Aprile",
    "Mag": "Maggio",
    "Giu": "Giugno",
    "Lug": "Luglio",
    "Ago": "Agosto",
    "Set": "Settembre",
    "Ott": "Ottobre",
    "Nov": "Novembre",
    "Dic": "Dicembre"
}

#per stampare un mese mi basta utilizzare la chiave
print(monthConversions["Gen"])
print(monthConversions.get("Lug")) #metodo alternativo per accedere ad un valore
print(monthConversions.get("Lun", "Non è un mese valido")) #in questo c'è un valore di default

#while loop 
dieci = 0
while True:

    print(dieci)
    dieci += 1
    
    if dieci >= 10:
        break

#for loop, la differenza con un while loop è che il numero di iterazioni è definito, non è necessario un contatore e il valore della variabile nel for cambia automaticamente
for i in "Mi chiamo Mario":
    print(i)

#voglio stampare tutte le stringhe in una lista
lista_stringhe = ["Giallo", "Rosso", "Verde", "Anzio"]

for i in range(len(lista_stringhe)):
    print(lista_stringhe[i])

#voglio ora creare una lista di liste, stiamo creando una griglia
number_grid = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
    [0]
]
print(number_grid[1][2]) #stampa 6 -> [riga][colonna]

#ora voglio vedere il try /except
try:
    number = int(input("Inserisci un numero: ")) #carino, combinazione di print + input + conversione in intero
except: #esso gestisce tutte le tipologie di errore, tipo 10/0 darebbe input non valido anche se non ho inserito nulla
    print("Input non valido")

try:
    value = 10/0
    number = int(input("Inserisci un numero: ")) #carino, combinazione di print + input + conversione in intero
except ZeroDivisionError: 
    print("Non si può dividere per zero.")
except ValueError:
    print("Input non valido")