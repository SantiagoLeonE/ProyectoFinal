package co.edu.uniquindio.proyectofinal.model;

public abstract class Persona {
    public String nombre;
    public String apellido;
    public String cedula;
    public String direccion;

    public Usuario usuario;

    public Persona(String nombre, String apellido, String cedula, String direccion,Usuario usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
    }

}
