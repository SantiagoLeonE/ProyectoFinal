package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

public interface ICrudVendedor {
    boolean crearVendedor(Vendedor newVendedor);
    boolean eliminarVendedor(String cedula);
    boolean actualizarVendedor(String cedula, Vendedor vendedor);
    boolean verificarVendedorExistente(String cedula);
    Vendedor buscarVendedor(String cedula);
}
