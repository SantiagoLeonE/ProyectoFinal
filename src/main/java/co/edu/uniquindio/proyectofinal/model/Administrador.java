package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.AdministradorBuilder;

public class Administrador extends Persona {

    public Administrador(String nombre, String apellido, String cedula, String direccion) {
        super(nombre, apellido, cedula, direccion);
    }

    public static AdministradorBuilder builder() {
        return new AdministradorBuilder();
    }


}
