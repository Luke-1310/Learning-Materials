from Chef import Chef

class ChineseChef:

    #voglio che lui possa fare tutto quello di uno Chef base, per questo l'ho importato 
    
    #faccio overriding del piatto speciale
    def make_special_dish(self):
        print("The chef makes orange chicken")

    def make_fried_rice(self):
        print("The chef makes fried rice")
