class Inventario:

    # constructor
    def __init__(self, id_item, nombre_item, cantidad):

        # atributos privados
        self.__id_item = id_item
        self.__nombre_item = nombre_item
        self.__cantidad = cantidad

    # getter id
    @property
    def id_item(self):
        return self.__id_item

    # setter id
    @id_item.setter
    def id_item(self, id_item):
        self.__id_item = id_item

    # getter nombre
    @property
    def nombre_item(self):
        return self.__nombre_item

    # setter nombre
    @nombre_item.setter
    def nombre_item(self, nombre_item):

        # validación
        if len(nombre_item) > 0:
            self.__nombre_item = nombre_item

    # getter cantidad
    @property
    def cantidad(self):
        return self.__cantidad

    # setter cantidad
    @cantidad.setter
    def cantidad(self, cantidad):

        # evita negativos
        if cantidad >= 0:
            self.__cantidad = cantidad