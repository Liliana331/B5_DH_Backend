package test;

import model.Persona;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.IVacunacion;
import service.ProxyVacunacion;
import service.Vacunacion;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IVacunacionTest {
    @Test
    @DisplayName("Probar con fecha anterior a la vacuna")
    void test1(){
        LocalDate fecha1 = LocalDate.of(2025,01,24);
        LocalDate fecha2 = LocalDate.of(2025,01,25);
        LocalDate fecha3 = LocalDate.of(2025,01,26);

        Persona paciente1 = new Persona("Martha", "Sanchez", 123, fecha1, "Previa");
        Persona paciente2 = new Persona("Carlos", "Perez", 123, fecha2, "Hoy");
        Persona paciente3 = new Persona("Pepe", "Flores", 123, fecha3, "Posterior");

        IVacunacion vacuna1 = new ProxyVacunacion();

        String resultadoEsperado = "Aún no es fecha de la vacunación";
        String resultadoObtenido = vacuna1.vacunar(paciente1);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    @DisplayName("Probar con fecha igual a la vacuna")
    void test2(){
        LocalDate fecha2 = LocalDate.of(2025,01,25);
        Persona paciente2 = new Persona("Carlos", "Perez", 123, fecha2, "Hoy");

        IVacunacion vacuna1 = new ProxyVacunacion();

        String resultadoEsperado = "El paciente se ha vacunado correctamente";
        String resultadoObtenido = vacuna1.vacunar(paciente2);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    @DisplayName("Probar con fecha posterior a la vacuna")
    void test3(){
        LocalDate fecha3 = LocalDate.of(2025,01,26);
        Persona paciente3 = new Persona("Pepe", "Flores", 123, fecha3, "Posterior");

        IVacunacion vacuna1 = new ProxyVacunacion();

        String resultadoEsperado = "El paciente se ha vacunado correctamente";
        String resultadoObtenido = vacuna1.vacunar(paciente3);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}