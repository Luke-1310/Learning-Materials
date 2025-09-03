# import os

# print(os.getcwd())  # Stampa la directory di lavoro corrente

#voglio leggere il contenuto di un file, le \\ servono per evitare i caratteri di escape
employees_file = open("D:\\Programmi\\Repository\\Learning-Materials\\Python\\freeCodeCamp_Tutorial\\Codice\\test.txt", "r") #r sta per read, w sta per write, a sta per append

#controllo se è leggibile
if employees_file.readable():
    #print(employees_file.read()) #restituisce True se il file è leggibile
    #print(employees_file.readline()) #legge una riga alla volta
    print(employees_file.readlines()) #legge tutte le righe e le mette in una lista

employees_file.close() #è di buon uso chiudere il file una volta utilizzato

employees_file = open("D:\\Programmi\\Repository\\Learning-Materials\\Python\\freeCodeCamp_Tutorial\\Codice\\test.txt", "a")

#per scrivere in un file
if employees_file.writable():
    employees_file.write("\nAggiungo una riga")
    employees_file.write("\nAggiungo un'altra riga")

employees_file.close() #è di buon uso chiudere il file una volta utilizzato