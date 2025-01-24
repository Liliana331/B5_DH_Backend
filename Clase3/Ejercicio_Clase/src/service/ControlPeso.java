package service;

import model.Articulo;

public class ControlPeso extends AnalistaCalidad{
    @Override
    public String validarProducto(Articulo articulo) {
        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            System.out.println("Pasó control de calidad: Peso");
            return getSiguiente().validarProducto(articulo);
        }
        return "Rechazado: El peso es incorrecto";
    }
}
