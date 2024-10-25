package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

    public List<Producto> listProductos = new ArrayList<>();
    public Muro muroAsociado;
    public Chat chatAsociado;
    public List<Vendedor> listVendedores = new ArrayList<>();

    public Vendedor(String nombre, String apellido, String cedula, String direccion) {
        super(nombre, apellido, cedula, direccion);
    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public Muro getMuroAsociado() {
        return muroAsociado;
    }

    public void setMuroAsociado(Muro muroAsociado) {
        this.muroAsociado = muroAsociado;
    }

    public Chat getChatAsociado() {
        return chatAsociado;
    }

    public void setChatAsociado(Chat chatAsociado) {
        this.chatAsociado = chatAsociado;
    }

    public List<Vendedor> getListVendedores() {
        return listVendedores;
    }

    public void setListVendedores(List<Vendedor> listVendedores) {
        this.listVendedores = listVendedores;
    }


}
