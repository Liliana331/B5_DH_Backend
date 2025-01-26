package service;

import model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class BusquedaHotel {

    private ApiHotel apiHotel;

    public BusquedaHotel(){
        apiHotel = new ApiHotel();
    }

    public Hotel busqueda(Hotel hotel){
        List<Hotel> hotelesLista;
        hotelesLista = apiHotel.getHoteles();
        Hotel hotelEncontrado = null;
        for(Hotel ht: hotelesLista){
            //System.out.println("Hotel obtenido de Api: " + ht);
            if(ht.getCiudad().equals(hotel.getCiudad()) && ht.getFechaEntrada().isEqual(hotel.getFechaEntrada())
                    && ht.getFechaSalida().isEqual(hotel.getFechaSalida())){
                System.out.println("Hotel encontrado: " + ht);
                hotelEncontrado = ht;
                break;
            }
        }
        return hotelEncontrado;
    }
}
