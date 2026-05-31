package main;

import controller.PersonajeController;
import view.MenuView;
import model.Personaje;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MenuView vista =
                new MenuView();

        PersonajeController controller =
                new PersonajeController();

        int opcion = 0;

        while(opcion != 6){

            opcion =
                    vista.mostrarMenu();

            // CREAR
            if(opcion == 1){

                String nombre =
                        vista.pedirNombre();

                int nivel =
                        vista.pedirNivel();

                int clase =
                        vista.pedirClase();

                controller.crearPersonaje(
                        nombre,
                        nivel,
                        clase
                );

                vista.mostrarMensaje(
                        "Personaje creado"
                );
            }

            // LISTAR
            else if(opcion == 2){

                ArrayList<Personaje> lista =
                        controller.listarPersonajes();

                for(Personaje p : lista){

                    System.out.println(
                            "ID: "
                            + p.getId()
                    );

                    System.out.println(
                            "Nombre: "
                            + p.getNombre()
                    );

                    System.out.println(
                            "Nivel: "
                            + p.getNivel()
                    );

                    p.habilidadEspecial();

                    System.out.println(
                            "----------------"
                    );
                }
            }

            // BUSCAR
            else if(opcion == 3){

                String nombre =
                        vista.pedirNombreBusqueda();

                Personaje personaje =
                        controller.buscarPersonaje(
                                nombre
                        );

                if(personaje != null){

                    System.out.println(
                            personaje.getNombre()
                    );

                }else{

                    vista.mostrarMensaje(
                            "No encontrado"
                    );
                }
            }

            // ACTUALIZAR
            else if(opcion == 4){

                int id =
                        vista.pedirId();

                int nivel =
                        vista.pedirNivel();

                controller.actualizarNivel(
                        id,
                        nivel
                );

                vista.mostrarMensaje(
                        "Nivel actualizado"
                );
            }

            // ELIMINAR
            else if(opcion == 5){

                int id =
                        vista.pedirId();

                controller.eliminarPersonaje(
                        id
                );

                vista.mostrarMensaje(
                        "Personaje eliminado"
                );
            }

            // SALIR
            else if(opcion == 6){

                vista.mostrarMensaje(
                        "Saliendo..."
                );
            }

            else{

                vista.mostrarMensaje(
                        "Opcion invalida"
                );
            }
        }
    }
}