package test;

import model.Empleado;
import model.EmpleadoContratado;
import model.EmpleadoEfectivo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.Liquidador;
import service.LiquidadorContratado;
import service.LiquidadorEfectivo;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    @DisplayName("Prueba de un empleado efectivo")
    void test1(){
        //Un empleado efectivo, Martín Martini, con un sueldo básico de 400, un valor fijo de descuentos de 40 y un total de 60 en premios
        Empleado empleadoEfectivo = new EmpleadoEfectivo("Martín", "Martini", "EE123", 400, 40, 60);
        Liquidador liquidadorEfectivo = new LiquidadorEfectivo();

        String valorEsperado = "La liquidación generada es un documento impreso. Saldo a liquidar: 420.0";
        String valorObtenido = liquidadorEfectivo.liquidarSueldo(empleadoEfectivo);

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    @DisplayName("Prueba de un empleado contratado")
    void test2(){
        //Una empleada contratada, Pompilia Pompini, con 120 horas trabajadas y una tarifa de 7 por hora
        Empleado empleadoContratado = new EmpleadoContratado("Pompilia", "Pompini", "EC456", 120, 7);
        Liquidador liquidadorContratado = new LiquidadorContratado();

        String valorEsperado = "La liquidación generada es un documento digital. Saldo a liquidar: 840";
        String valorObtenido = liquidadorContratado.imprimir(empleadoContratado);
    }

    @Test
    @DisplayName("Cuando no es posible calcular la liquidacion")
    void test3(){
        Empleado empleadoContratado = new EmpleadoContratado("Pompilia", "Pompini", "EC456", 120, 7);
        Liquidador liquidadorEfectivo = new LiquidadorEfectivo();

        String valorEsperado = "La liquidación no pudo ser calculada";
        String valorObtenido = liquidadorEfectivo.liquidarSueldo(empleadoContratado);

        assertEquals(valorEsperado, valorObtenido);
    }

}