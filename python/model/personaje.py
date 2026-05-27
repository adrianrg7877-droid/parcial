class Personaje:

    # Constructor
    def __init__(self, id, nombre, nivel):

        # atributos privados
        self.__id = id
        self.__nombre = nombre
        self.__nivel = nivel

    # Getter id
    @property
    def id(self):
        return self.__id

    # Setter id
    @id.setter
    def id(self, id):
        self.__id = id

    # Getter nombre
    @property
    def nombre(self):
        return self.__nombre

    # Setter nombre
    @nombre.setter
    def nombre(self, nombre):

        # validación
        if len(nombre) > 0:
            self.__nombre = nombre

    # Getter nivel
    @property
    def nivel(self):
        return self.__nivel

    # Setter nivel
    @nivel.setter
    def nivel(self, nivel):

        if nivel > 0:
            self.__nivel = nivel

    # Método polimórfico
    def habilidad_especial(self):

        print("Habilidad básica")