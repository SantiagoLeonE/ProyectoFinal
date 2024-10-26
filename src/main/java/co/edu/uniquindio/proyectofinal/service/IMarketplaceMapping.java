package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public interface IMarketplaceMapping {
    List<VendedorDto> getVendedoresDto(List<Vendedor> listVendedores);
    VendedorDto vendedorToVendedorDto(Vendedor vendedor);
    Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto);

    List<UsuarioDto> getUsuariosDto(List<Usuario> listUsuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);
}
