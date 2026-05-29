from model.guerrero import Guerrero
from model.mago import Mago
from model.arquero import Arquero

from db.personaje_dao import PersonajeDAO

class PersonajeController:

    # Constructor
    def __init__(self):

        # objeto DAO
        self.dao = PersonajeDAO()

    # Crear personaje
    def crear_personaje(
            self,
            id,
            nombre,
            nivel,
            opcion_clase
    ):

        # Polimorfismo
        if opcion_clase == 1:

            personaje = Guerrero(
                id,
                nombre,
                nivel
            )

        elif opcion_clase == 2:

            personaje = Mago(
                id,
                nombre,
                nivel
            )

        else:

            personaje = Arquero(
                id,
                nombre,
                nivel
            )

        # guardar en BD
        self.dao.insertar_personaje(
            personaje
        )

        print("Personaje creado")

    # Mostrar personajes
    def listar_personajes(self):

        # obtener lista
        lista = self.dao.listar_personajes()

        # recorrer lista
        for p in lista:

            print("----------------")
            print("ID:", p.id)
            print("Nombre:", p.nombre)
            print("Nivel:", p.nivel)

            # método polimórfico
            p.habilidad_especial()

    # Buscar personaje
    def buscar_personaje(self, nombre):

        personaje = self.dao.buscar_por_nombre(
            nombre
        )

        if personaje:

            print(
                personaje.nombre
            )

        else:

            print(
                "Personaje no encontrado"
            )

    # Actualizar nivel
    def actualizar_nivel(
            self,
            id,
            nuevo_nivel
    ):

        self.dao.actualizar_nivel(
            id,
            nuevo_nivel
        )

        print("Nivel actualizado")

    # Eliminar personaje
    def eliminar_personaje(self, id):

        self.dao.eliminar_personaje(id)

        print("Personaje eliminado")