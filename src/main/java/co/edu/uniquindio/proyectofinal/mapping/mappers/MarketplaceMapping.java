package co.edu.uniquindio.proyectofinal.mapping.mappers;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.service.IMarketplaceMapping;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceMapping implements IMarketplaceMapping {
    /**
     * Método de la interface IMarketplaceMapping para obtener la lista de VendedoresDto
     * @param listVendedores {list} - La lista de Vendedores
     * @return {list} - La lista de Vendedores Dto a obtener
     */
    @Override
    public List<VendedorDto> getVendedoresDto(List<Vendedor> listVendedores) {
       if(listVendedores == null) {
           return null;
       }

       List<VendedorDto> listVendedoresDto = new ArrayList<VendedorDto>(listVendedores.size());
       for (Vendedor vendedor : listVendedores) {
           listVendedoresDto.add(vendedorToVendedorDto(vendedor));
       }
       return listVendedoresDto;
    }

    /**
     * Método de la interface IMarketplaceMapping para convertir una clase Vendedor a VendedorDto
     * @param vendedor {Vendedor} - El vendedor a convertir
     * @return {VendedorDto} - El vendedor pero ya de tipo Dto
     */
    @Override
    public VendedorDto vendedorToVendedorDto(Vendedor vendedor) {
        return new VendedorDto(
                vendedor.getNombre(),
                vendedor.getApellido(),
                vendedor.getCedula(),
                vendedor.getDireccion());
    }

    /**
     * Método de la interface IMarketplaceMapping para convertir una clase VendedorDto a Vendedor
     * @param vendedorDto {VendedorDto} - El vendedorDto a convertir
     * @return {Vendedor} - El VendedorDto pero ya de tipo Vendedor
     */
    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto) {
        return Vendedor.builder()
                .nombre(vendedorDto.nombre())
                .apellido(vendedorDto.apellido())
                .cedula(vendedorDto.cedula())
                .direccion(vendedorDto.direccion())
                .build();
    }

    /**
     * Método de la interface IMarketplaceMapping para obtener la lista de UsuariosDto
     * @param listUsuarios {list} - La lista de Usuarios
     * @return {list} - La lista lista de UsuariosDto a obtener
     */
    @Override
    public List<UsuarioDto> getUsuariosDto(List<Usuario> listUsuarios) {
        if(listUsuarios == null) {
            return null;
        }

        List<UsuarioDto> listUsuariosDto = new ArrayList<UsuarioDto>(listUsuarios.size());
        for (Usuario usuario : listUsuarios) {
            listUsuariosDto.add(usuarioToUsuarioDto(usuario));
        }
        return listUsuariosDto;
    }

    /**
     * Método de la interface IMarketplaceMapping para convertir una clase Usuario a UsuarioDto
     * @param usuario {Usuario} - El usuario a convertir
     * @return {UsuarioDto} - El usuario pero ya de tipo Dto
     */
    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
        return new UsuarioDto(
                usuario.getUsername(),
                usuario.getPassword());
    }

    /**
     * Método de la interface IMarketplaceMapping para convertir una clase UsuarioDto a Usuario
     * @param usuarioDto {UsuarioDto} - El usuarioDto a convertir
     * @return {Usuario} - El UsuarioDto pero ya de tipo Usuario
     */
    @Override
    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
        return Usuario.builder()
                .username(usuarioDto.username())
                .password(usuarioDto.password())
                .build();
    }
}
