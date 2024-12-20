package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;
import co.edu.uniquindio.proyectofinal.model.composite.ComponenteProducto;
import co.edu.uniquindio.proyectofinal.service.IPrototype;
import co.edu.uniquindio.proyectofinal.service.Observer;
import co.edu.uniquindio.proyectofinal.service.Subject;

import java.util.ArrayList;
import java.util.List;

public class Producto extends ComponenteProducto implements IPrototype, Subject {

    private List<Observer> observers = new ArrayList<>();
    private String news;

    public String nombre;
    public String categoria;
    public double precio;
    public EstadoProducto estadoProducto;
    public Publicacion publicacion;

    public Producto() {
    }

    /**
     * Constructor de la clase Producto
     * @param nombre {String} - El nombre del producto
     * @param categoria {String} - La categoría del producto
     * @param precio {double} - El precio del producto
     */
    public Producto(String nombre, String categoria, double precio, EstadoProducto estadoProducto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.estadoProducto = estadoProducto;
    }

    /**
     * Método Prototype para clonar un producto ya existente
     * @return {Producto} - El mismo producto pero en diferente instancia
     */
    @Override
    public IPrototype clone() {
        Producto producto = null;

        try {
            producto = (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return producto;
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

    public static ProductoBuilder builder(){
        return new ProductoBuilder();
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Categoria: " + categoria + ", Precio: " + precio + ", Estado: " + estadoProducto);
    }

    @Override
    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notificarObservers();
    }
}
