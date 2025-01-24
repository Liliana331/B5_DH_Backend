package service;

import model.Articulo;

public class ControlEnvase extends AnalistaCalidad{
    @Override
    public String validarProducto(Articulo articulo) {
        if(articulo.getEnvasado().contains("sano")){
            System.out.println("Pasó control de calidad: Envasado");
            return "Articulo fue aceptado";
        }
        return "Rechazado: El envasado es incorrecto";
    }
}
