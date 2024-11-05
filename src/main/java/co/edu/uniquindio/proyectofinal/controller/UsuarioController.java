package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.service.IUsuarioControllerService;
import co.edu.uniquindio.proyectofinal.factory.ModelFactory;

import java.util.List;

public class UsuarioController implements IUsuarioControllerService {

    ModelFactory modelFactory;

    public UsuarioController() {
        modelFactory = ModelFactory.getInstance();
    }

    //Método conectar la clase UsuarioController con la clase model factory, mediante el llamado del método obtenerUsuariosDto
    @Override
    public List<UsuarioDto> obtenerUsuariosDto() {
        return modelFactory.obtenerUsuariosDto();
    }

    //Método para conectar la clase UsuarioController con la clase ModelFactory
    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        return modelFactory.agregarUsuario(usuarioDto);
    }

    //Método para conectar la clase UsuarioController con la clase ModelFactory
    @Override
    public boolean actualizarUsuario(String username, UsuarioDto usuarioDto) {
        return modelFactory.actualizarUsuario(username, usuarioDto);
    }

    //Método para conectar la clase UsuarioController con la clase ModelFactory
    @Override
    public boolean eliminarUsuario(String username) {
        return modelFactory.eliminarUsuario(username);
    }

    //Método que llama el método buscar usuario perteneciente a la clase model factory
    @Override
    public boolean buscarUsuario(String username) {
        return modelFactory.buscarUsuario(username);
    }

}
