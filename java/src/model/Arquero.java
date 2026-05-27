package model;

// Herencia
public class Arquero extends Personaje {

    // Constructor
    public Arquero(int id, String nombre, int nivel) {

        // constructor padre
        super(id, nombre, nivel);
    }

    // Sobrescritura
    @Override
    public void habilidadEspecial() {

        System.out.println("Disparo de flecha");
    }
}