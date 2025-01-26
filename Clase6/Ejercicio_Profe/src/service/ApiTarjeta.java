package service;

import model.Tarjeta;

public class ApiTarjeta {
    public int descuento(Tarjeta tarjeta){
        if(tarjeta.getBanco().equalsIgnoreCase("Star Bank"))
            return 20;
        return 0;
    }
}
