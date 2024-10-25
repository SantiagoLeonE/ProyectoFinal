package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.service.ICrudUsuario;

public class Marketplace implements ICrudUsuario {

    //Método booleano para indicar si se creó un usuario o ya existe
    @Override
    public boolean crearUsuario() {
        return false;
    }
}
