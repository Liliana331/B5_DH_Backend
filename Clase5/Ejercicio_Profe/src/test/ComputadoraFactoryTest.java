package test;

import model.Computadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.ComputadoraFactory;

import static org.junit.jupiter.api.Assertions.*;

class ComputadoraFactoryTest {
    @Test
    @DisplayName("Agregar computadora Win")
    void test1(){
        Computadora computadora1 = new Computadora("windows",2, 128);

        Computadora respuesta1 = ComputadoraFactory.getComputadora("windows",2, 128);

        System.out.println("respuesta1 = " + respuesta1.descripcionComputadora());

        Computadora computadora2 = new Computadora("windows",2, 128);

        Computadora respuesta2 = ComputadoraFactory.getComputadora("windows",2, 128);

        System.out.println("respuesta2 = " + respuesta2.descripcionComputadora());

        Computadora computadora3 = new Computadora("mac16",16, 500);

        Computadora respuesta3 = ComputadoraFactory.getComputadora("mac16",16, 500);

        System.out.println("respuesta3 = " + respuesta3.descripcionComputadora());

        Computadora computadora4 = new Computadora("windows",2, 128);

        Computadora respuesta4 = ComputadoraFactory.getComputadora("windows",2, 128);

        System.out.println("respuesta4 = " + respuesta4.descripcionComputadora());


        System.out.println("Instancias creadas: " + Computadora.getContador());

    }
}