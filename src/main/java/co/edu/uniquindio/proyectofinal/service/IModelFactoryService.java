package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;

import java.util.List;

public interface IModelFactoryService {
    List<UsuarioDto> getUsuariosDto();
    boolean agregarUsuario(UsuarioDto usuario);
    boolean eliminarUsuario(String cedula);
    boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto);
}
