package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.model.Marketplace;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryService;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    Marketplace marketplace;

    //Método para conectar la clase ModelFactory con la clase modelo Marketplace
    @Override
    public boolean agregarUsuario() {
        return marketplace.crearUsuario();
    }

}
