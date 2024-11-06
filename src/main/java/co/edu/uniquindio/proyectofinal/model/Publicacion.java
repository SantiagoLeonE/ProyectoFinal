package co.edu.uniquindio.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    public boolean like;
    public List<Comentario> listComentarios = new ArrayList<>();
    public Producto producto;

    public Publicacion(){
    }

    public Publicacion(boolean like) {
        this.like = like;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public List<Comentario> getListComentarios() {
        return listComentarios;
    }

    public void setListComentarios(List<Comentario> listComentarios) {
        this.listComentarios = listComentarios;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
