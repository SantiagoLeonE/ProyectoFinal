package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.service.ICrudUsuario;

import java.util.ArrayList;
import java.util.List;

public class Marketplace implements ICrudUsuario {

    public String nombre;
    public List<Vendedor> listVendedores = new ArrayList<>();
    public List<Usuario> listUsuarios = new ArrayList<>();
    public Administrador administrador;

    public Marketplace() {
    }

    public Marketplace(String nombre) {
        this.nombre = nombre;
    }


    //Método booleano para indicar si se creó un usuario o ya existe
    @Override
    public boolean crearUsuario() {
        return false;
    }
}
