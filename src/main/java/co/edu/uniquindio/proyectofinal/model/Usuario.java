package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.UsuarioBuilder;

public class Usuario {
    public String username;
    public String password;

    public Persona persona;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static UsuarioBuilder builder() {
        return new UsuarioBuilder();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
