package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public interface ICrudUsuario {
    boolean crearUsuario(Usuario newUsuario);
    boolean eliminarUsuario(String username);
    boolean modificarUsuario(String username, Usuario newUsuario);
    boolean verificarUsuarioExistente(String username);
}
