package model;

// Herencia
public class Guerrero extends Personaje {

    // Constructor
    public Guerrero(int id, String nombre, int nivel) {

        // super llama al constructor padre
        super(id, nombre, nivel);
    }

    // Sobrescritura
    @Override
    public void habilidadEspecial() {

        System.out.println("Ataque con espada");
    }
}