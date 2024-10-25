package co.edu.uniquindio.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class Muro {
    public List<Chat> listChats = new ArrayList<>();
    public List<Publicacion> listPublicaciones = new ArrayList<>();

    public Muro() {
    }

    public List<Chat> getListChats() {
        return listChats;
    }

    public void setListChats(List<Chat> listChats) {
        this.listChats = listChats;
    }

    public List<Publicacion> getListPublicaciones() {
        return listPublicaciones;
    }

    public void setListPublicaciones(List<Publicacion> listPublicaciones) {
        this.listPublicaciones = listPublicaciones;
    }
}
