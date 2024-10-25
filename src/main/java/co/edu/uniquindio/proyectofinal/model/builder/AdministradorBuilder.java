package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Administrador;

public class AdministradorBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;

    public AdministradorBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AdministradorBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public AdministradorBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public AdministradorBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    public Administrador build(String nombre, String apellido, String cedula, String direccion) {
        return new Administrador(nombre, apellido, cedula, direccion);
    }
}
