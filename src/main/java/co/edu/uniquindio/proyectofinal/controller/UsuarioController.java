package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.service.IUsuarioControllerService;
import co.edu.uniquindio.proyectofinal.factory.ModelFactory;
import javafx.scene.control.Label;

public class UsuarioController implements IUsuarioControllerService {
    public Label welcomeText;
    ModelFactory modelFactory;

    //Método para conectar la clase UsuarioController con la clase ModelFactory
    @Override
    public boolean agregarUsuario() {
        return modelFactory.agregarUsuario();
    }

}
