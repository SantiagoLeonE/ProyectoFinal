package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public interface IModelFactoryService {
    List<UsuarioDto> getUsuariosDto();
    boolean agregarUsuario(UsuarioDto usuarioDto);
    boolean actualizarUsuario(String username, UsuarioDto usuarioDto);
    boolean eliminarUsuario(String username);
    boolean buscarUsuario(String username);

    List<VendedorDto> getVendedoresDto();
    boolean agregarVendedor(VendedorDto vendedorDto);
    boolean eliminarVendedor(String cedula);
    boolean actualizarVendedor(String cedula, VendedorDto vendedorDto);
    boolean buscarVendedor(String cedula);
}
