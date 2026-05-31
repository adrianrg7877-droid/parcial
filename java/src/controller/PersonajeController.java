package controller;

import model.Guerrero;
import model.Mago;
import model.Arquero;
import model.Personaje;

import db.PersonajeDAO;

import java.util.ArrayList;

public class PersonajeController {

    private PersonajeDAO dao;

    public PersonajeController() {

        dao = new PersonajeDAO();
    }

    // Crear personaje
    public void crearPersonaje(
            String nombre,
            int nivel,
            int opcionClase
    ) {

        Personaje personaje;

        if(opcionClase == 1){

            personaje = new Guerrero(
                    0,
                    nombre,
                    nivel
            );

        }else if(opcionClase == 2){

            personaje = new Mago(
                    0,
                    nombre,
                    nivel
            );

        }else if(opcionClase == 3){

            personaje = new Arquero(
                    0,
                    nombre,
                    nivel
            );

        }else{

            System.out.println(
                    "Clase invalida"
            );

            return;
        }

        dao.insertarPersonaje(personaje);
    }

    // Listar personajes
    public ArrayList<Personaje>
    listarPersonajes() {

        return dao.listarPersonajes();
    }

    // Buscar personaje
    public Personaje buscarPersonaje(
            String nombre
    ) {

        return dao.buscarPorNombre(
                nombre
        );
    }

    // Actualizar nivel
    public void actualizarNivel(
            int id,
            int nuevoNivel
    ) {

        dao.actualizarNivel(
                id,
                nuevoNivel
        );
    }

    // Eliminar personaje
    public void eliminarPersonaje(
            int id
    ) {

        dao.eliminarPersonaje(id);
    }
}