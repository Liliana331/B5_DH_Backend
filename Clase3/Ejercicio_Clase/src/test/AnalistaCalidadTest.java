package test;

import model.Articulo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.CompruebaCalidad;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaCalidadTest {
    @Test
    @DisplayName("Validar lote incorrecto demas datos correctos")
    void test1(){
        Articulo articulo = new Articulo("Chocolate", 500, 1200, "sano");
        CompruebaCalidad prueba = new CompruebaCalidad();

        String respuestaEsperada = "Rechazado: El lote es incorrecto";
        String respuestObtenida = prueba.validarCalidad(articulo);

        assertEquals(respuestaEsperada, respuestObtenida);
    }

    @Test
    @DisplayName("Validar peso incorrecto demas datos correctos")
    void test2(){
        Articulo articulo = new Articulo("Chocolate", 1500, 200, "sano");
        CompruebaCalidad prueba = new CompruebaCalidad();

        String respuestaEsperada = "Rechazado: El peso es incorrecto";
        String respuestObtenida = prueba.validarCalidad(articulo);

        assertEquals(respuestaEsperada, respuestObtenida);
    }

    @Test
    @DisplayName("Validar envasado incorrecto demas datos correctos")
    void test3(){
        Articulo articulo = new Articulo("Chocolate", 1500, 1200, "malo");
        CompruebaCalidad prueba = new CompruebaCalidad();

        String respuestaEsperada = "Rechazado: El envasado es incorrecto";
        String respuestObtenida = prueba.validarCalidad(articulo);

        assertEquals(respuestaEsperada, respuestObtenida);
    }

    @Test
    @DisplayName("Validar todos los datos correctos")
    void test4(){
        Articulo articulo = new Articulo("Chocolate", 1500, 1200, "sano");
        CompruebaCalidad prueba = new CompruebaCalidad();

        String respuestaEsperada = "Articulo fue aceptado";
        String respuestObtenida = prueba.validarCalidad(articulo);

        assertEquals(respuestaEsperada, respuestObtenida);
    }

}