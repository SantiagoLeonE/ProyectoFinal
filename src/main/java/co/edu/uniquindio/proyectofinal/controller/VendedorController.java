package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.service.IVendedorControllerService;

import java.util.List;

public class VendedorController implements IVendedorControllerService {

    ModelFactory modelFactory;

    public VendedorController() {
        modelFactory = ModelFactory.getInstance();
    }

    //Métodos para conectar la clase VendedorController con la clase model factory
    @Override
    public List<VendedorDto> obtenerVendedoresDto() {
        return modelFactory.obtenerVendedoresDto();
    }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        return modelFactory.agregarVendedor(vendedorDto);
    }

    @Override
    public boolean actualizarVendedor(String cedula, VendedorDto vendedorDto) {
        return modelFactory.actualizarVendedor(cedula, vendedorDto);
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        return modelFactory.eliminarVendedor(cedula);
    }

    @Override
    public boolean buscarVendedor(String cedula) {
        return modelFactory.buscarVendedor(cedula);
    }
}
