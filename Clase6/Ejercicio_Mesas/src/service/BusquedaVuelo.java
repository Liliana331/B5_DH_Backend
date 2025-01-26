package service;

import model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusquedaVuelo {

    ApiVuelo apiVuelo;

    public BusquedaVuelo(){
        apiVuelo = new ApiVuelo();
    }

    public Vuelo busqueda(Vuelo vuelo){
        List<Vuelo> vuelosLista;
        vuelosLista = apiVuelo.getVuelos();
        Vuelo vueloEncontrado = null;
        for(Vuelo vl: vuelosLista){
            if(vl.getOrigen().equals(vuelo.getOrigen()) && vl.getDestino().equals(vuelo.getDestino()) &&
            vl.getFechaSalida().isEqual(vuelo.getFechaSalida()) && vl.getFechaRegreso().isEqual(vuelo.getFechaRegreso())){
                System.out.println("Vuelo encontrado: " + vl);
                vueloEncontrado = vl;
                break;
            }
        }

        return vueloEncontrado;
    }


}
