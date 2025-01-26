package service;

import model.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiVuelo {
    private  List<Vuelo> vuelos;

    Vuelo vuelo1 =
            new Vuelo("Medellin", "Cali", LocalDate.of(2024,5,20), LocalDate.of(2024,5,25));
    Vuelo vuelo2 =
            new Vuelo("Bogota", "Bucaramanga", LocalDate.of(2024,5,20), LocalDate.of(2024,5,25));
    Vuelo vuelo3 =
            new Vuelo("Bogota", "Manizales", LocalDate.of(2024,12,4), LocalDate.of(2024,12,20));


    public  ApiVuelo() {
        vuelos = new ArrayList<>();

        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        vuelos.add(vuelo3);
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }
}
