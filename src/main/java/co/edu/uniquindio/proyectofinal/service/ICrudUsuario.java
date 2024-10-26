package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public interface ICrudUsuario {
    boolean crearUsuario(Usuario newUsuario);
    boolean eliminarUsuario(String username);
    boolean actualizarUsuario(String username, Usuario newUsuario);
    Usuario buscarUsuario(String username);
    boolean verificarUsuarioExistente(String username);
}
