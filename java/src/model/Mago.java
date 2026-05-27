package model;

// Hereda de Personaje
public class Mago extends Personaje {

    // Constructor
    public Mago(int id, String nombre, int nivel) {

        // llama constructor padre
        super(id, nombre, nivel);
    }

    // Sobrescritura
    @Override
    public void habilidadEspecial() {

        System.out.println("Lanzamiento de hechizo");
    }
}