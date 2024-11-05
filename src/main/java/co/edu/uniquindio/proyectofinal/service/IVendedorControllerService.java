package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;

import java.util.List;

public interface IVendedorControllerService {
    List<VendedorDto> obtenerVendedoresDto();
    boolean agregarVendedor(VendedorDto vendedorDto);
    boolean actualizarVendedor(String cedula, VendedorDto vendedorDto);
    boolean eliminarVendedor(String cedula);
    boolean buscarVendedor(String cedula);
}
