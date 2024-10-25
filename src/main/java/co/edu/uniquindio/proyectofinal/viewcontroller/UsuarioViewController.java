package co.edu.uniquindio.proyectofinal.viewcontroller;

import co.edu.uniquindio.proyectofinal.controller.UsuarioController;

public class UsuarioViewController {
    UsuarioController usuarioController;

    //Método para conectar la clase UsuarioViewController con la clase UsuarioController
    private void crearUsuario() {
        usuarioController.agregarUsuario();
    }
}


