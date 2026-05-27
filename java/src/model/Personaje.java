package model;

// Clase padre
public class Personaje {

    // Encapsulamiento:
    // los atributos son private
    private int id;
    private String nombre;
    private int nivel;

    // Constructor
    public Personaje(int id, String nombre, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Getter del id
    public int getId() {
        return id;
    }

    // Setter del id
    public void setId(int id) {
        this.id = id;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {

        // Validación básica
        if(nombre.length() > 0){
            this.nombre = nombre;
        }
    }

    // Getter del nivel
    public int getNivel() {
        return nivel;
    }

    // Setter del nivel
    public void setNivel(int nivel) {

        // Evita niveles negativos
        if(nivel > 0){
            this.nivel = nivel;
        }
    }

    // Método polimórfico
    // las clases hijas lo sobrescriben
    public void habilidadEspecial(){
        System.out.println("Habilidad básica");
    }
}