package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

public interface ICrudVendedor {
    boolean crearVendedor(Vendedor newVendedor);
    boolean eliminarVendedor(String cedula);
    boolean modificarVendedor(String cedula, Vendedor vendedor);
    boolean verificarVendedorExistente(String cedula);
}
