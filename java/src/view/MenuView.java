package view;

import java.util.Scanner;

public class MenuView {

    private Scanner entrada;

    public MenuView() {

        entrada = new Scanner(System.in);
    }

    public int mostrarMenu() {

        System.out.println("\n===== RPG MANAGER =====");
        System.out.println("1. Crear personaje");
        System.out.println("2. Listar personajes");
        System.out.println("3. Buscar personaje");
        System.out.println("4. Actualizar nivel");
        System.out.println("5. Eliminar personaje");
        System.out.println("6. Salir");

        System.out.print("Seleccione opcion: ");

        return entrada.nextInt();
    }

    public String pedirNombre() {

        entrada.nextLine();

        System.out.print("Ingrese nombre: ");

        return entrada.nextLine();
    }

    public int pedirNivel() {

        System.out.print("Ingrese nivel: ");

        return entrada.nextInt();
    }

    public int pedirId() {

        System.out.print("Ingrese ID: ");

        return entrada.nextInt();
    }

    public int pedirClase() {

        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");

        System.out.print("Seleccione clase: ");

        return entrada.nextInt();
    }

    public String pedirNombreBusqueda() {

        entrada.nextLine();

        System.out.print("Ingrese nombre a buscar: ");

        return entrada.nextLine();
    }

    public void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);
    }
}