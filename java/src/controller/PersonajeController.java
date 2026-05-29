package controller;

import model.Guerrero;
import model.Mago;
import model.Arquero;
import model.Personaje;

import db.PersonajeDAO;

import java.util.ArrayList;

public class PersonajeController {

    // objeto DAO
    private PersonajeDAO dao;

    // Constructor
    public PersonajeController() {

        // inicializa conexión con BD
        dao = new PersonajeDAO();
    }

    // Crear personaje
    public void crearPersonaje(
            int id,
            String nombre,
            int nivel,
            int opcionClase
    ) {

        // variable tipo Personaje
        Personaje personaje;

        // Polimorfismo
        if(opcionClase == 1){

            personaje = new Guerrero(id, nombre, nivel);

        }else if(opcionClase == 2){

            personaje = new Mago(id, nombre, nivel);

        }else{

            personaje = new Arquero(id, nombre, nivel);
        }

        // guardar en BD
        dao.insertarPersonaje(personaje);

        System.out.println("Personaje creado");
    }

    // Mostrar personajes
    public void listarPersonajes() {

        // obtener datos desde DAO
        ArrayList<Personaje> lista =
                dao.listarPersonajes();

        // recorrer lista
        for(Personaje p : lista){

            System.out.println("----------------");
            System.out.println("ID: " + p.getId());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Nivel: " + p.getNivel());

            // método polimórfico
            p.habilidadEspecial();
        }
    }

    // Buscar personaje
    public void buscarPersonaje(String nombre) {

        Personaje personaje =
                dao.buscarPorNombre(nombre);

        if(personaje != null){

            System.out.println(
                    personaje.getNombre()
            );

        }else{

            System.out.println(
                    "Personaje no encontrado"
            );
        }
    }

    // Actualizar nivel
    public void actualizarNivel(
            int id,
            int nuevoNivel
    ) {

        dao.actualizarNivel(id, nuevoNivel);

        System.out.println(
                "Nivel actualizado"
        );
    }

    // Eliminar personaje
    public void eliminarPersonaje(int id) {

        dao.eliminarPersonaje(id);

        System.out.println(
                "Personaje eliminado"
        );
    }
}