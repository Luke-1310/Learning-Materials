#i moduli sono dei file .py che contengono delle funzioni che possiamo riutilizzare in altri file .py
import useful_tools

#posso quindi usare le funzioni definite in useful_tools.py
print(useful_tools.roll_dice(10))

#classi e oggetti
#non tutto può essere rappresentato dai tipi primitivi (stringhe, numeri e booleani), si usano quindi altri elementi come le classi
#la classe è il contenitore mentre l'oggetto contiene le effettive informazioni
print("CLASSI E OGGETTI \n")

#per usare una classe definita in un altro file, la importo (1° Student è il nome del file, 2° è la classe)
from Student import Student

student1 = Student("John Doe", "Computer Science", 3.5, False)

#se voglio il nome dello studente 1
print(student1.name)

#funzioni oggetto, ovvero essere sono situate nella classe dell'oggetto
print(student1.on_honor_roll())

#eriditarietà
from Chef import Chef
from ChineseChef import ChineseChef

myChef = Chef()#creo un oggetto di tipo chef
myChef.make_special_dish()

myChineseChef = ChineseChef() #creo un oggetto di tipo ChineseChef
myChineseChef.make_special_dish() #fa l'override della funzione make_special_dish

