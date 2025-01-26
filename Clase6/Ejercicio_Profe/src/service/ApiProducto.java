package service;

import model.Producto;

public class ApiProducto {

    public int descuento(Producto producto){
        if(producto.getTipo().equalsIgnoreCase("lata"))
            return 10;
        return 0;
    }
}
