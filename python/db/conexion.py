import mysql.connector

class Conexion:

    # método conectar
    def conectar(self):

        try:

            conexion = mysql.connector.connect(
                host="localhost",
                user="root",
                password="1234",
                database="rpg_manager"
            )

            print("Conexion exitosa")

            return conexion

        except Exception as e:

            print("Error conexion")

            print(e)