package co.edu.uniquindio.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    public List<Mensaje> listMensajes = new ArrayList<>();
    public List<Vendedor> listVendedores = new ArrayList<>();

    public Chat() {
    }

    public List<Mensaje> getListMensajes() {
        return listMensajes;
    }

    public void setListMensajes(List<Mensaje> listMensajes) {
        this.listMensajes = listMensajes;
    }

    public List<Vendedor> getListVendedores() {
        return listVendedores;
    }

    public void setListVendedores(List<Vendedor> listVendedores) {
        this.listVendedores = listVendedores;
    }
}
