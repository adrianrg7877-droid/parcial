package view;

import java.util.Scanner;

public class MenuView {

    // Scanner para leer datos
    private Scanner entrada;

    // Constructor
    public MenuView() {

        entrada = new Scanner(System.in);
    }

    // Mostrar menú
    public int mostrarMenu() {

        System.out.println("===== RPG MANAGER =====");
        System.out.println("1. Crear personaje");
        System.out.println("2. Listar personajes");
        System.out.println("3. Actualizar nivel");
        System.out.println("4. Eliminar personaje");
        System.out.println("5. Salir");

        System.out.print("Seleccione opcion: ");

        // retorna opción elegida
        return entrada.nextInt();
    }

    // Pedir ID
    public int pedirId() {

        System.out.print("Ingrese ID: ");

        return entrada.nextInt();
    }

    // Pedir nombre
    public String pedirNombre() {

        entrada.nextLine();

        System.out.print("Ingrese nombre: ");

        return entrada.nextLine();
    }

    // Pedir nivel
    public int pedirNivel() {

        System.out.print("Ingrese nivel: ");

        return entrada.nextInt();
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);
    }
}