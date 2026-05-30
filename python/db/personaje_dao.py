from db.conexion import Conexion

from model.guerrero import Guerrero

class PersonajeDAO:

    # constructor
    def __init__(self):

        self.conexion = Conexion()

    # INSERT
    def insertar_personaje(
            self,
            personaje
    ):

        try:

            con =
            self.conexion.conectar()

            cursor = con.cursor()

            sql = """
            INSERT INTO personaje(
            nombre,
            nivel
            )
            VALUES(%s,%s)
            """

            valores = (
                personaje.nombre,
                personaje.nivel
            )

            cursor.execute(sql, valores)

            con.commit()

        except Exception as e:

            print(e)

    # SELECT
    def listar_personajes(self):

        lista = []

        try:

            con =
            self.conexion.conectar()

            cursor = con.cursor()

            sql = "SELECT * FROM personaje"

            cursor.execute(sql)

            resultados =
            cursor.fetchall()

            for fila in resultados:

                personaje = Guerrero(
                    fila[0],
                    fila[1],
                    fila[2]
                )

                lista.append(personaje)

        except Exception as e:

            print(e)

        return lista

    # Buscar por nombre
    def buscar_por_nombre(
            self,
            nombre
    ):

        personaje = None

        try:

            con =
            self.conexion.conectar()

            cursor = con.cursor()

            sql = """
            SELECT * FROM personaje
            WHERE nombre=%s
            """

            cursor.execute(sql, (nombre,))

            fila = cursor.fetchone()

            if fila:

                personaje = Guerrero(
                    fila[0],
                    fila[1],
                    fila[2]
                )

        except Exception as e:

            print(e)

        return personaje

    # UPDATE
    def actualizar_nivel(
            self,
            id,
            nivel
    ):

        try:

            con =
            self.conexion.conectar()

            cursor = con.cursor()

            sql = """
            UPDATE personaje
            SET nivel=%s
            WHERE id=%s
            """

            cursor.execute(
                sql,
                (nivel, id)
            )

            con.commit()

        except Exception as e:

            print(e)

    # DELETE
    def eliminar_personaje(
            self,
            id
    ):

        try:

            con =
            self.conexion.conectar()

            cursor = con.cursor()

            sql = """
            DELETE FROM personaje
            WHERE id=%s
            """

            cursor.execute(
                sql,
                (id,)
            )

            con.commit()

        except Exception as e:

            print(e)