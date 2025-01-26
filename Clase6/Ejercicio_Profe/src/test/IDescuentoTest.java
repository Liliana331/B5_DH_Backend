package test;

import model.Producto;
import model.Tarjeta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.Descuento;
import service.IDescuento;

import static org.junit.jupiter.api.Assertions.*;

class IDescuentoTest {
    @Test
    @DisplayName("Validar descuento por tipo banco y tipo de producto")
    void test1(){
        Tarjeta tarjeta = new Tarjeta("123", "star bank");
        Producto producto = new Producto("leche", "lata");

        IDescuento descuento = new Descuento();
        int valorEsperado = 30;
        int valorObtenido = descuento.calcularDescuento(tarjeta, producto, 10);

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    @DisplayName("Validar descuento por tipo de producto")
    void test2(){
        Tarjeta tarjeta = new Tarjeta("123", "star banco");
        Producto producto = new Producto("leche", "lata");

        IDescuento descuento = new Descuento();
        int valorEsperado = 10;
        int valorObtenido = descuento.calcularDescuento(tarjeta, producto, 10);

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    @DisplayName("Validar descuento por cantidad")
    void test3(){
        Tarjeta tarjeta = new Tarjeta("123", "star banco");
        Producto producto = new Producto("leche", "bolsa");

        IDescuento descuento = new Descuento();
        int valorEsperado = 15;
        int valorObtenido = descuento.calcularDescuento(tarjeta, producto, 13);

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    @DisplayName("Validar descuento con todos los datos")
    void test4(){
        Tarjeta tarjeta = new Tarjeta("123", "STAR BANK");
        Producto producto = new Producto("leche", "LATA");

        IDescuento descuento = new Descuento();
        int valorEsperado = 45;
        int valorObtenido = descuento.calcularDescuento(tarjeta, producto, 20);

        assertEquals(valorEsperado, valorObtenido);
    }
}