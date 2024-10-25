package co.edu.uniquindio.proyectofinal.model;

public class Usuario {
    public String username;
    public String password;

    public Persona persona;

    public Usuario(String username, String password, Persona persona) {
        this.username = username;
        this.password = password;
        this.persona = persona;
    }
}
