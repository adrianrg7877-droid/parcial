package model;

public class Inventario {

    // atributos privados
    private int idItem;
    private String nombreItem;
    private int cantidad;

    // constructor
    public Inventario(int idItem, String nombreItem, int cantidad) {

        this.idItem = idItem;
        this.nombreItem = nombreItem;
        this.cantidad = cantidad;
    }

    // getter id
    public int getIdItem() {
        return idItem;
    }

    // setter id
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    // getter nombre
    public String getNombreItem() {
        return nombreItem;
    }

    // setter nombre
    public void setNombreItem(String nombreItem) {

        // validación
        if(nombreItem.length() > 0){
            this.nombreItem = nombreItem;
        }
    }

    // getter cantidad
    public int getCantidad() {
        return cantidad;
    }

    // setter cantidad
    public void setCantidad(int cantidad) {

        // evita negativos
        if(cantidad >= 0){
            this.cantidad = cantidad;
        }
    }
}