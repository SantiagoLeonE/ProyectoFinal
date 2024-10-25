package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public class UsuarioBuilder {
    protected String username;
    protected String password;

    public UsuarioBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UsuarioBuilder password(String password) {
        this.password = password;
        return this;
    }

    public Usuario build() {
        return new Usuario(username, password);
    }
}
