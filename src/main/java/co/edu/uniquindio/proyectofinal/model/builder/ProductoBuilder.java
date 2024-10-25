package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Producto;

public class ProductoBuilder {
    protected String nombre;
    protected String categoria;
    protected double precio;

    /**
     * Método builder para agregar el nombre al producto
     * @param nombre {String} - El nombre del producto a crear
     * @return {Object} - Un objeto con el nombre de un producto
     */
    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     * Método builder para agregar la categoría al producto
     * @param categoria {String} - La categoría del producto a crear
     * @return {Object} - Un objeto con la categoría de un producto
     */
    public ProductoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    /**
     * Método builder para agregar el precio al producto
     * @param precio {double} - El precio del producto a crear
     * @return {Object} - Un objeto con el precio de un producto
     */
    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    /**
     * Método build para crear el producto con diferentes estructuras
     * @return {Object} - Un objeto con los atributos determinados de un producto
     */
    public Producto build() {
        return new Producto(nombre, categoria, precio);
    }
}
