package service;

import model.Articulo;

public class ControlLote extends AnalistaCalidad{

    @Override
    public String validarProducto(Articulo articulo) {
        if(articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            System.out.println("Pasó control de calidad: Lote");
            return getSiguiente().validarProducto(articulo);
        }
        return "Rechazado: El lote es incorrecto";
    }
}
