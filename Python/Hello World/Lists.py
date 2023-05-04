#Nelle liste possiamo inserire tipi diversi di dati senza problemi

#9 Lists

friends = ["Kevin", "Luke", "Maggie", 4, 24.5, False]

#Stampo tutta la lista
print(friends)

#Stampo un specifico elemento ad un indice z

print("L'elemento nella posizione 2 corrisponde a: ", friends[1])

#Possiamo anche partire dalla coda inserendo un numero negativo!

print("L'elemento in posizione -2 corrisponde a: ", friends[-2])

#Possiamo anche stampare tutti gli elementi successivi ad un altro, quest'ultimo compreso

print("Gli elementi dopo 'Luke' sono: ", friends[1:])

#Possiamo anche stampare gli elementi in un certo range ultimo valore escluso

print("Gli elementi tra la posizione 2 e 5 sono: ", friends[1:3])

#Possiamo anche modificare un elemento della lista ovviamente

friends[4] = "CR7 SIUM"

print("L'elemento in posizione 5 verrà sostituito con 'CR7 SIUM' \n\n", friends)

#10 List Functions

lucky_numbers = [4,8,15,23,42]
friends = ["Kevin", "Karen", "Jim", "Oscar", "Toby"]

#la funzione .extend aggiunge una lista ad un'altra
friends.extend(lucky_numbers)

print(friends)

#la funzione .append aggiunge un elemento ad una lista in coda
friends.append("Creed")

print(friends)

#la funzione .insert aggiunge un determinato elemento in un determinato indice
#spostando tutti gli elementi successivi di uno
friends.insert(1,"Mauro")

print(friends)

#la funzione .remove trova un elemento x e lo elimina spostando tutti gli elementi a sinistra di quello cancellato
#[0, 1, 2, 3] cancello due quindi [0,1,3]
friends.remove("Toby")

print(friends)

#la funzione .pop elimina l'elemento in coda alla lista
friends.pop()

print(friends)

#la funzione .index stampa l'indice di un elemento di un elemento specific
print(friends.index(8))

#la funzione .count scorre tutta la lista e restituisce il numero di volte che compare un elemento x
friends.insert(3,"Messi")
friends.insert(0,"Messi")

print(friends)

print(friends.count("Messi"))

#la funzione .sort ordina gli elementi in ordine decrescente, ma stringhe e numberi non possono essere mischiati
friends1 = ["Luke", "Kevin", "Maggie"]
print(friends1)
friends1.sort()
print(friends1)

#la funzione .copy copia l'intera lista in un altra
friends2 = friends1.copy()

print(friends2)

#la funzione .clear invece elimina l'intera lista
friends.clear()

print(friends)