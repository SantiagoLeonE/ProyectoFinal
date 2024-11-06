package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.mapping.mappers.MarketplaceMapping;
import co.edu.uniquindio.proyectofinal.model.*;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryService;

import java.time.LocalDateTime;
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
        // Creación de MarketPlace
        Marketplace marketplace = new Marketplace();

        // Creación de Administrador
        Administrador administrador = Administrador.builder()
                .nombre("Juan")
                .apellido("Lopez")
                .cedula("273802134")
                .direccion("Armenia, Quindío")
                .build();


        // Creación de Vendedores
        Vendedor vendedor1 = Vendedor.builder()
                .nombre("Paco")
                .apellido("Rodríguez")
                .cedula("1827345")
                .build();

        Vendedor vendedor2 = Vendedor.builder()
                .nombre("Pablo")
                .apellido("Gutierrez")
                .cedula("29374654")
                .build();

        Vendedor vendedor3 = Vendedor.builder()
                .nombre("Luis")
                .apellido("Hernández")
                .cedula("9273644")
                .build();


        // Creación de Usuarios
        Usuario usuarioAdmin = Usuario.builder()
                .username(administrador.getNombre())
                .password("5678")
                .build();

        Usuario usuario1 = Usuario.builder()
                .username(vendedor1.getNombre())
                .password("12345")
                .build();

        Usuario usuario2 = Usuario.builder()
                .username(vendedor2.getNombre())
                .password("pab9010")
                .build();

        Usuario usuario3 = Usuario.builder()
                .username(vendedor3.getNombre())
                .password("10938432L")
                .build();


        // Creación de Productos
        Producto producto1 = Producto.builder()
                .nombre("Gorra")
                .categoria("Accesorio")
                .precio(50000)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .build();

        Producto producto2 = Producto.builder()
                .nombre("En lo más profundo")
                .categoria("Libro")
                .precio(30000)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .build();

        Producto producto3 = Producto.builder()
                .nombre("Play 5")
                .categoria("Consola")
                .precio(5000000)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .build();

        Producto producto4 = Producto.builder()
                .nombre("Trompo")
                .categoria("Juego")
                .precio(10000)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .build();


        // Creación de Chats
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        Chat chat3 = new Chat();


        // Creación de Mensajes
        Mensaje mensaje1 = new Mensaje(LocalDateTime.of(2024, 11, 5, 19, 30));
        Mensaje mensaje2 = new Mensaje(LocalDateTime.of(2024, 8, 20, 5, 2));
        Mensaje mensaje3 = new Mensaje(LocalDateTime.of(2024, 3, 29, 8, 56));


        // Creación de Comentarios
        Comentario comentario1 = new Comentario(LocalDateTime.of(2024, 11, 6, 10, 36));
        Comentario comentario2 = new Comentario(LocalDateTime.of(2024, 8, 22, 13, 50));
        Comentario comentario3 = new Comentario(LocalDateTime.of(2024, 4, 2, 17, 4));
        Comentario comentario4 = new Comentario(LocalDateTime.of(2024, 5, 17, 5, 43));


        // Creación de Publicaciones
        Publicacion publicacion1 = new Publicacion(true);
        Publicacion publicacion2 = new Publicacion();
        Publicacion publicacion3 = new Publicacion();
        Publicacion publicacion4 = new Publicacion();


        // Creación de Muro
        Muro muro1 = new Muro();
        Muro muro2 = new Muro();
        Muro muro3 = new Muro();



        // Administrador en el Marketplace
        marketplace.setAdministrador(administrador);
        // Usuarios en el Markeplace
        marketplace.getListUsuarios().add(usuario1);
        marketplace.getListUsuarios().add(usuario2);
        marketplace.getListUsuarios().add(usuario3);
        // Vendedor en el Marketplace
        marketplace.getListVendedores().add(vendedor1);
        marketplace.getListVendedores().add(vendedor2);
        marketplace.getListVendedores().add(vendedor3);


        // Producto en el Vendedor
        vendedor1.getListProductos().add(producto1);
        vendedor1.getListProductos().add(producto2);
        vendedor2.getListProductos().add(producto3);
        vendedor3.getListProductos().add(producto4);
        // Vendedores Relacionados entre sí
        vendedor1.getListVendedores().add(vendedor2);
        vendedor2.getListVendedores().add(vendedor1);

        vendedor1.getListVendedores().add(vendedor3);
        vendedor3.getListVendedores().add(vendedor1);

        vendedor2.getListVendedores().add(vendedor3);
        vendedor3.getListVendedores().add(vendedor2);
        // Chats Asociados a Vendedores
        vendedor1.setChatAsociado(chat1);
        vendedor2.setChatAsociado(chat1);

        vendedor1.setChatAsociado(chat2);
        vendedor3.setChatAsociado(chat2);

        vendedor2.setChatAsociado(chat3);
        vendedor3.setChatAsociado(chat3);
        // Muros asociados a Vendedores
        vendedor1.setMuroAsociado(muro1);
        vendedor2.setMuroAsociado(muro2);
        vendedor3.setMuroAsociado(muro3);


        // Vendedores con Mensajes relacionados con Chat
        chat1.getListVendedores().add(vendedor1);
        chat1.getListVendedores().add(vendedor2);
        chat1.getListMensajes().add(mensaje1);

        chat2.getListVendedores().add(vendedor1);
        chat2.getListVendedores().add(vendedor3);
        chat2.getListMensajes().add(mensaje2);

        chat3.getListVendedores().add(vendedor2);
        chat3.getListVendedores().add(vendedor3);
        chat3.getListMensajes().add(mensaje3);


        // Comentarios de cada Publicación
        publicacion1.getListComentarios().add(comentario1);
        publicacion2.getListComentarios().add(comentario2);
        publicacion3.getListComentarios().add(comentario3);
        publicacion4.getListComentarios().add(comentario4);
        // Productos relacionadas a cada Publicacion
        publicacion1.setProducto(producto1);
        publicacion2.setProducto(producto2);
        publicacion3.setProducto(producto3);
        publicacion4.setProducto(producto4);


        // Publicaciones relacionadas a cada Producto
        producto1.setPublicacion(publicacion1);
        producto2.setPublicacion(publicacion2);
        producto3.setPublicacion(publicacion3);
        producto4.setPublicacion(publicacion4);


        // Chats relacionados al Muro
        muro1.getListChats().add(chat1);
        muro2.getListChats().add(chat2);
        muro3.getListChats().add(chat3);
        // Publicaciones relacionadas al Muro
        muro1.getListPublicaciones().add(publicacion1);
        muro1.getListPublicaciones().add(publicacion2);
        muro2.getListPublicaciones().add(publicacion3);
        muro3.getListPublicaciones().add(publicacion4);

        return marketplace;
    }
}