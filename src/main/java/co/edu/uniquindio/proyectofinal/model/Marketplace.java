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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vendedor> getListVendedores() {
        return listVendedores;
    }

    public void setListVendedores(List<Vendedor> listVendedores) {
        this.listVendedores = listVendedores;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }


    //------------------------------- CRUD USUARIO ----------------------------------------

    /**
     * Método booleano para verificar si se creó un Usuario
     * @param newUsuario {Object} - Un objeto de tipo Usuario
     * @return {boolean} - Verificación de creación
     */
    @Override
    public boolean crearUsuario(Usuario newUsuario) {
        if (newUsuario != null) {
            getListUsuarios().add(newUsuario);
            return true;
        }
        return false;
    }

    /**
     * Método booleano para verificar si eliminó un Usuario
     * @param username {String} - EL username del Usuario a eliminar
     * @return {boolean} - Verificación de eliminación
     */
    @Override
    public boolean eliminarUsuario(String username) {
        for (Usuario usuario : getListUsuarios()) {
            if (usuario.getUsername().equals(username)) {
                getListUsuarios().remove(usuario);
                return true;
            }
        }
        return false;
    }

    /**
     * Método booleano para verificar si se actualizó un Usuario
     * @param username {String} - El Username del Usuario a modificar
     * @param usuario {Object} - El objeto con los atributos de un Usuario a modificar
     * @return {boolean} - Verificación de actualización
     */
    @Override
    public boolean actualizarUsuario(String username, Usuario usuario) {

        Usuario usuarioExistente = buscarUsuario(username);

        if (usuarioExistente != null) {
            usuarioExistente.setUsername(usuario.getUsername());
            usuarioExistente.setPassword(usuario.getPassword());

            return true;
        }
        return false;
    }

    /**
     * Método booleano para buscar un Usuario
     * @param username {String} - El Username del Usuario a encontrar
     * @return {Usuario} - El Usuario encontrado por su Username
     */
    @Override
    public Usuario buscarUsuario(String username) {
        for (Usuario usuario : getListUsuarios()) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Método booleano para verificar si un Usuario ya existe
     * @param username {String} - El username del usuario ingresado
     * @return {boolean} - Verificación de existencia
     */
    @Override
    public boolean verificarUsuarioExistente(String username) {
        Usuario usuarioExistente = null;
        for (Usuario usuario : listUsuarios) {
            if (usuario.getUsername().equals(username)) {
                usuarioExistente = usuario;
                break;
            }
        }

        if (usuarioExistente != null) {
            return true;
        }
        return false;
    }
}
