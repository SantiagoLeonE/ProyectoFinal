package co.edu.uniquindio.proyectofinal.model.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PaqueteProductos extends ComponenteProducto {
    public List<ComponenteProducto> listProductosSimples = new ArrayList<>();

    public void agregarProductoSimple(ComponenteProducto productoSimple) {
        listProductosSimples.add(productoSimple);
    }

    @Override
    public void mostrar() {
        System.out.println("Paquete de productos: ");
        for (ComponenteProducto productoSimple : listProductosSimples) {
            productoSimple.mostrar();
        }
    }

}
