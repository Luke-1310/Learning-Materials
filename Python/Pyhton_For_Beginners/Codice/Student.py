class Student:

    #funzione costruttrice, il dato Studente avrà certe carattistiche che noi gli passiamo
    def __init__(self, name, major, gpa, is_on_probation):
        self.name = name
        self.major = major
        self.gpa = gpa
        self.is_on_probation = is_on_probation

    def get_info(self):
        return f"Name: {self.name}, Major: {self.major}, Gpa: {self.gpa}, On Probation: {self.is_on_probation}  " 
    
    def on_honor_roll(self):
        if(self.gpa >= 3.5):
            return True
        else:
            return False
            