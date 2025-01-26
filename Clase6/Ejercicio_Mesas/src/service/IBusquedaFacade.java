package service;

import java.time.LocalDate;

public interface IBusquedaFacade {
    String busquedaReserva(String ciudad, LocalDate fechaIngreso, LocalDate fechaSalida, String origen);
}
