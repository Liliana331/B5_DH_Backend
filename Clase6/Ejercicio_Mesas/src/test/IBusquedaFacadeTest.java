package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.BusquedaFacade;
import service.IBusquedaFacade;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IBusquedaFacadeTest {
    @Test
    @DisplayName("Se hace búsqueda con coincidencia en Hotel y Vuelo")
    void test1(){

        IBusquedaFacade busquedaFacade = new BusquedaFacade();

        String respuestaObtenida = busquedaFacade.busquedaReserva("Cali", LocalDate.of(2024,5,20),
                LocalDate.of(2024,5,25), "Medellin");

        String respuestaEsperada = "Se encontro una coincidencia";

        assertEquals(respuestaObtenida, respuestaEsperada);
    }

    @Test
    @DisplayName("Se hace búsqueda con coincidencia en Hotel")
    void test2(){

        IBusquedaFacade busquedaFacade = new BusquedaFacade();

        String respuestaObtenida = busquedaFacade.busquedaReserva("Cartagena", LocalDate.of(2024,3,1),
                LocalDate.of(2024,3,15), "Medellin");

        String respuestaEsperada = "No se encontro coincidencia";

        assertEquals(respuestaObtenida, respuestaEsperada);
    }

    @Test
    @DisplayName("Se hace búsqueda con coincidencia en Vuelo")
    void test3(){

        IBusquedaFacade busquedaFacade = new BusquedaFacade();

        String respuestaObtenida = busquedaFacade.busquedaReserva("Manizales", LocalDate.of(2024,12,4),
                LocalDate.of(2024,12,20), "Bogota");

        String respuestaEsperada = "No se encontro coincidencia";

        assertEquals(respuestaObtenida, respuestaEsperada);
    }
}