package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.model.Usuario;

import java.util.List;

public interface IUsuarioControllerService {
    boolean agregarUsuario(UsuarioDto usuarioDto);
    boolean actualizarUsuario(String username, UsuarioDto usuarioDto);
    boolean eliminarUsuario(String username);
    boolean buscarUsuario(String username);
}
