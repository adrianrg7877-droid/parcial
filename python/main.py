from view.menu_view import menuview
from controller.personaje_controller import PersonajeController

# objetos principales
vista = menuview()

controller = PersonajeController()

opcion = 0

# ciclo principal
while opcion != 5:

    # mostrar menú
    opcion = vista.mostrar_menu()

    # CREAR
    if opcion == 1:

        id = vista.pedir_id()

        nombre = vista.pedir_nombre()

        nivel = vista.pedir_nivel()

        print("1. Guerrero")
        print("2. Mago")
        print("3. Arquero")

        clase = vista.pedir_id()

        controller.crear_personaje(
            id,
            nombre,
            nivel,
            clase
        )

    # LISTAR
    elif opcion == 2:

        controller.listar_personajes()

    # ACTUALIZAR
    elif opcion == 3:

        id = vista.pedir_id()

        nivel = vista.pedir_nivel()

        controller.actualizar_nivel(
            id,
            nivel
        )

    # ELIMINAR
    elif opcion == 4:

        id = vista.pedir_id()

        controller.eliminar_personaje(id)

    # SALIR
    elif opcion == 5:

        vista.mostrar_mensaje(
            "Saliendo..."
        )

    # ERROR
    else:

        vista.mostrar_mensaje(
            "Opcion invalida"
        )