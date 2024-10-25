package co.edu.uniquindio.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

    public List<Producto> listProductos = new ArrayList<>();
    public Muro muroAsociado;
    public Chat chatAsociado;
    public List<Vendedor> listVendedores = new ArrayList<>();

    public Vendedor(String nombre, String apellido, String cedula, String direccion, Usuario usuario) {
        super(nombre, apellido, cedula, direccion, usuario);

    }
}
