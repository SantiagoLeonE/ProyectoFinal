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
        Usuario newUsuario = mapper.usuarioDtoToUsuario(usuarioDto);

        getMarketplace().crearUsuario(newUsuario);
        return true;
    }

    @Override
    public boolean eliminarUsuario(String cedula) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String cedula, UsuarioDto usuarioDto) {
        return false;
    }

    @Override
    public List<UsuarioDto> getUsuariosDto() {
        return null;
    }

    @Override
    public boolean buscarUsuario(String username) {
        if(getMarketplace().verificarUsuarioExistente(username)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        Vendedor newVendedor = mapper.vendedorDtoToVendedor(vendedorDto);

        getMarketplace().crearVendedor(newVendedor);
        return true;
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        return false;
    }

    @Override
    public boolean actualizarVendedor(String cedula, VendedorDto vendedorDto) {
        return false;
    }

    @Override
    public List<VendedorDto> getVendedoresDto() {
        return null;
    }

    @Override
    public boolean buscarVendedor(String cedula) {
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
