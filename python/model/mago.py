from model.personaje import Personaje

# Herencia
class Mago(Personaje):

    # Constructor
    def __init__(self, id, nombre, nivel):

        # constructor padre
        super().__init__(id, nombre, nivel)

    # sobrescritura
    def habilidad_especial(self):

        print("Lanzamiento de hechizo")