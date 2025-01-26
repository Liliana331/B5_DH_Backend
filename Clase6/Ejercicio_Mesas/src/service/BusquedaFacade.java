package service;

import model.Hotel;
import model.Vuelo;
import java.time.LocalDate;

public class BusquedaFacade implements IBusquedaFacade{

    private BusquedaHotel busquedaHotel;
    private BusquedaVuelo busquedaVuelo;

    public BusquedaFacade(){
        this.busquedaHotel = new BusquedaHotel();
        this.busquedaVuelo = new BusquedaVuelo();
    }

    @Override
    public String busquedaReserva(String ciudad, LocalDate fechaIngreso, LocalDate fechaSalida, String origen) {
        Vuelo vueloReserva = new Vuelo(origen, ciudad, fechaIngreso, fechaSalida);
        Hotel hotelReserva = new Hotel(ciudad, fechaIngreso, fechaSalida);

        Vuelo vueloActivo = busquedaVuelo.busqueda(vueloReserva);
        Hotel hotelActivo = busquedaHotel.busqueda(hotelReserva);

        if(vueloActivo != null && hotelActivo != null){

            System.out.println("Vuelo encontrado = " + vueloActivo);
            System.out.println("Hotel encontrado = " + hotelActivo);
            return "Se encontro una coincidencia";
        }

        return "No se encontro coincidencia";
    }

}
