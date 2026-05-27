from model.personaje import Personaje

# Herencia
class Guerrero(Personaje):

    # Constructor
    def __init__(self, id, nombre, nivel):

        # llama constructor padre
        super().__init__(id, nombre, nivel)

    # sobrescritura
    def habilidad_especial(self):

        print("Ataque con espada")