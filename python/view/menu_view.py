class menuview:

    # Mostrar menú
    def mostrar_menu(self):

        print("===== RPG MANAGER =====")
        print("1. Crear personaje")
        print("2. Listar personajes")
        print("3. Actualizar nivel")
        print("4. Eliminar personaje")
        print("5. Salir")

        # retorna opción
        return int(input("Seleccione opcion: "))

    # Pedir ID
    def pedir_id(self):

        return int(input("Ingrese ID: "))

    # Pedir nombre
    def pedir_nombre(self):

        return input("Ingrese nombre: ")

    # Pedir nivel
    def pedir_nivel(self):

        return int(input("Ingrese nivel: "))

    # Pedir clase
    def pedir_clase(self):

        return int(
            input("Seleccione clase: ")
        )

    # Mostrar mensaje
    def mostrar_mensaje(self, mensaje):

        print(mensaje)