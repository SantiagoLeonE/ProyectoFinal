package co.edu.uniquindio.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    public boolean like;
    public List<Comentario> listComentarios = new ArrayList<>();
    public Producto producto;

    public Publicacion(boolean like) {
        this.like = like;
    }


}
