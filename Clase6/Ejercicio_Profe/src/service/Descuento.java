package service;

import model.Producto;
import model.Tarjeta;

public class Descuento implements IDescuento{

    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;
    private ApiCantidad apiCantidad;

    public Descuento(){
        apiTarjeta = new ApiTarjeta();
        apiProducto = new ApiProducto();
        apiCantidad = new ApiCantidad();
    }

    @Override
    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidadProducto) {

        int descTarjeta = apiTarjeta.descuento(tarjeta);
        int descProducto = apiProducto.descuento(producto);
        int descCantidad = apiCantidad.descuento(cantidadProducto);

        return descTarjeta + descProducto + descCantidad;
    }

}
