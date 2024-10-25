package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

public class VendedorBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;

    public VendedorBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public VendedorBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public VendedorBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public VendedorBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Vendedor build(String nombre, String apellido, String cedula, String direccion) {
        return new Vendedor(nombre, apellido, cedula, direccion);
    }

}
