package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.mapping.mappers.MarketplaceMapping;
import co.edu.uniquindio.proyectofinal.model.Marketplace;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryService;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    Marketplace marketplace;
    MarketplaceMapping mapper;

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        marketplace = inicializarDatos();
        mapper = new MarketplaceMapping();
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    //Método para conectar la clase ModelFactory con la clase modelo Marketplace
    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        if(marketplace.verificarUsuarioExistente(usuarioDto.username())) {

            Usuario newUsuario = mapper.usuarioDtoToUsuario(usuarioDto);

            getMarketplace().crearUsuario(newUsuario);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula) {
        return marketplace.eliminarUsuario(cedula);
    }

    @Override
    public boolean actualizarUsuario(String username, UsuarioDto usuarioDto) {
        if(!marketplace.verificarUsuarioExistente(username)) {

            Usuario usuarioEncontrado = mapper.usuarioDtoToUsuario(usuarioDto);

            marketplace.actualizarUsuario(username, usuarioEncontrado);
            return true;
        }
        return false;
    }

    @Override
    public List<UsuarioDto> obtenerUsuariosDto() {
        return mapper.getUsuariosDto(marketplace.getListUsuarios());
    }

    @Override
    public boolean buscarUsuario(String username) {
        if(marketplace.verificarUsuarioExistente(username)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        if(marketplace.verificarVendedorExistente(vendedorDto.cedula())) {

            Vendedor newVendedor = mapper.vendedorDtoToVendedor(vendedorDto);

            getMarketplace().crearVendedor(newVendedor);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        return marketplace.eliminarVendedor(cedula);
    }

    @Override
    public boolean actualizarVendedor(String cedula, VendedorDto vendedorDto) {
        if(!marketplace.verificarVendedorExistente(cedula)) {

            Vendedor vendedorEncontrado = mapper.vendedorDtoToVendedor(vendedorDto);

            marketplace.actualizarVendedor(cedula, vendedorEncontrado);
            return true;
        }
        return false;
    }

    @Override
    public List<VendedorDto> obtenerVendedoresDto() {
        return mapper.getVendedoresDto(marketplace.getListVendedores());
    }

    @Override
    public boolean buscarVendedor(String cedula) {
        if(marketplace.verificarVendedorExistente(cedula)) {
            return true;
        }
        return false;
    }

    public static Marketplace inicializarDatos() {
        Marketplace marketplace = new Marketplace();

        Usuario usuario = Usuario.builder()
                .username("beta123")
                .password("12345")
                .build();

        marketplace.getListUsuarios().add(usuario);

        return marketplace;
    }
}
