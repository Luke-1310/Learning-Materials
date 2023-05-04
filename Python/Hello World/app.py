#Link del video: https://www.youtube.com/watch?v=rfscVS0vtbw

from math import *

#1 Setup and Hello World

print("Hello World\n")

#2 Drawing a Shape

print("   /|")
print("  / |")
print(" /  |")
print("/___|")

#3 Variables and Data Types

character_name = "Mario"
character_age = "69"

print("\nHi! My name is " + character_name + " and...\n" 
"... I am " + character_age + " years old\n")

#4 Working With Strings

print("Stampo la stringa all'interno di phrase: ")
phrase = "CR7 says SIUM\n"
print(phrase)

#phrase.lower stampa phrase con tutti caratteri minuscoli
print("Metto tutti i caratteri in minuscolo: " + phrase.lower())

#phrase.upper stampa phrase con tutti caratteri Maiuscoli
print("Metto tutti i caratteri in maiuscolo: " + phrase.upper())

#phrase.isupper controlla se la stringa in phrase sono tutti caratteri maiuscoli e restituisce true o false
print("I caratteri di phrase sono tutti maiuscoli: ", phrase.isupper())

#è possibile anche combinare tali funzioni
print("\nMetto tutti i caratteri in maiuscolo e controllo: ", phrase.upper().isupper() )

#len(phrase) restituisce il numero di caratteri della stringa in phrase, spazi inclusi
nr_char = len(phrase)
print("\nIl numero di phrase caratteri è: ", nr_char)

#le stringhe sono indicizzate, se metto phrase[0] allora si sta parlando del primo carattere.
#Se si prende un carattere out of ranfe allora darà errore
print("\nIl quinto carattere di phrase è: " + phrase[5])

#phrase.index restituisce la posizione di un carattere
#se in input ci sono più caratteri restituisce la posizione del primo
print("\nLa C si trova nella posizione: ", phrase.index("C"), " la parola SIUM inizia al carattere: ", phrase.index("SIUM"))

#5 Working With Numbers

#può stampare numeri interi, decimali, negativi ed calcoli vari solamente con un print()

num_1 = 10
num_2 = 3

print("Il resto lo si indica cosi: x % y con x = ", num_1, " e con y = ", num_2,)
print("Quindi si avrà che il resto in questo caso vale:", num_1 % num_2)

#la funzione abs sta per absolute value ed ovviamente restituisce il valore assoluto di un numero
num_1 = -10

num_1 = abs(num_1)

print("\n",-10, "abs() --->", abs(num_1))

#la funzione pow, la quale effettua una determinata elevazione a potenza necessita del valore da elevare e dell'esponente

exp = 3

print("\n", num_1, " pow(num_1, exp) --->", pow(num_1,exp))

#la funzione max restituisce il massimo tra due numeri

print("\n", num_1, " & ", num_2, "max(num1, num2) --->", max(num_1,num_2))

#la funzione round arrotonda un numero decimale

num_3 = 3.5

print("\n", num_3, "round(num_3) --->", round(num_3))

#alcune funzioni fanno ovviamente parte di una determinata libreria, come le seguenti

#la funzione floor elimina la parte decimale di un numero decimale approssimandolo sempre al minore

print("\n", num_3, "floor(num_3) --->", floor(num_3))

#la funzione ceil elimina la parte decimale di un numero decimale approssimandolo sempre al maggiore

print("\n", num_3, "floor(num_3) --->", ceil(num_3))

#la funzione sqrt invece restituisce la radice quadrata di un determinato numero

num_4 = 36

print("\n", num_4, "sqrt(num_4) --->", sqrt(num_4))

#6 Getting input from users

user_name = input("Enter your name: ")

print("Hi!", user_name, "that's a beatiful name!")

#7 Building a simple calculator /////