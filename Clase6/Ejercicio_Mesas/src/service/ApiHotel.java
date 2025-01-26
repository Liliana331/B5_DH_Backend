package service;

import model.Hotel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiHotel {

    private List<Hotel> hoteles;

    Hotel hotel1 =
            new Hotel("Cali", LocalDate.of(2024,5,20), LocalDate.of(2024,5,25));
    Hotel hotel2 =
            new Hotel("Cartagena", LocalDate.of(2024,3,1), LocalDate.of(2024,3,15));

    Hotel hotel3 =
            new Hotel("Bogota", LocalDate.of(2024,10,20), LocalDate.of(2024,10,25));

    public ApiHotel() {
        hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(Hotel hotel) {
        this.hoteles.add(hotel);
    }
}
