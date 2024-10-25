package co.edu.uniquindio.proyectofinal.model;

public class Producto {

    public String nombre;
    public String categoria;
    public double precio;
    public Publicacion publicacion;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
}
