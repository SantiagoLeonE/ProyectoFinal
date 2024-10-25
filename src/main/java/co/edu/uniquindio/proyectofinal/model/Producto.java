package co.edu.uniquindio.proyectofinal.model;

public class Producto {

    public String nombre;
    public String categoria;
    public double precio;
    public Publicacion publicacion;

    public Producto() {
    }

    /**
     * Constructor de la clase Producto
     * @param nombre {String} - El nombre del producto
     * @param categoria {String} - La categoría del producto
     * @param precio {double} - El precio del producto
     */
    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    /**
     * Método get para obtener el nombre de un producto
     * @return {String} - El nombre del producto a obtener
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre de un producto
     * @param nombre {String} - El nombre del producto a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para obtener la categoría de un producto
     * @return {String} - La categoría del producto a obtener
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método set para modificar la categoría de un producto
     * @param categoria {String} - La categoría del producto a modificar
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método get para obtener el precio de un producto
     * @return {double} - El precio del producto a obtener
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método set para modificar el precio de un producto
     * @param precio {double} - El precio del producto a modificar
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método get para obtener la publicación de un producto
     * @return {Publicacion} - La publicación asociada a un producto a obtener
     */
    public Publicacion getPublicacion() {
        return publicacion;
    }

    /**
     * Método set para modificar la publicación de un producto
     * @param publicacion {Publicacion} - La publicación asociada a un producto a modificar
     */
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
