package service;

import model.Articulo;

public class CompruebaCalidad {
    public String validarCalidad(Articulo articulo){
        AnalistaCalidad controlLote = new ControlLote();
        AnalistaCalidad controlPeso = new ControlPeso();
        AnalistaCalidad controlEnvase = new ControlEnvase();

        controlLote.setSiguiente(controlPeso);
        controlPeso.setSiguiente(controlEnvase);

        return controlLote.validarProducto(articulo);
    }

}
