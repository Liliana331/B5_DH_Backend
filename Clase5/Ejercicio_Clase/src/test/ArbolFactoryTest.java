package test;

import model.Arbol;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.ArbolFactory;

import static org.junit.jupiter.api.Assertions.*;

class ArbolFactoryTest {
    @Test
    @DisplayName("Validar que solo se cree una instancia del arbol")
    void test1(){
        ArbolFactory prueba1 = new ArbolFactory();
        prueba1.getArbol("ornamental");
        prueba1.getArbol("ornamental");
        prueba1.getArbol("ornamental");
        prueba1.getArbol("ornamental");

        assertEquals(1, Arbol.getContadorInstancias());

    }

    @Test
    @DisplayName("Validar que solo se cree una instancia para cada tipo de arbol")
    void test2(){
        ArbolFactory prueba1 = new ArbolFactory();
        prueba1.getArbol("ornamental");
        prueba1.getArbol("frutal");
        prueba1.getArbol("ornamental");
        prueba1.getArbol("floral");
        prueba1.getArbol("ornamental");
        prueba1.getArbol("frutal");
        prueba1.getArbol("ornamental");
        prueba1.getArbol("floral");

        assertEquals(3, Arbol.getContadorInstancias());

    }

    @Test
    @DisplayName("Crear 100 arboles")
    void test3(){
        ArbolFactory prueba1 = new ArbolFactory();
        for(int i = 0; i < 100; i++){
            prueba1.getArbol("floral");
            prueba1.getArbol("ornamental");
        }

        assertEquals(2, Arbol.getContadorInstancias());

        //coment: falla pq al no existir no accede a la clase Arbol y nunca reinicia el contador
    }

    @Test
    @DisplayName("Validar que indique un error si no existe ese tipo de arbol")
    void test4(){
        ArbolFactory prueba1 = new ArbolFactory();
        prueba1.getArbol("baobabs");
        prueba1.getArbol("nogal");
        prueba1.getArbol("olivo");
        prueba1.getArbol("secuoya");
        prueba1.getArbol("sauce");

        assertEquals(0, Arbol.getContadorInstancias());

        //coment: falla pq al no existir no accede a la clase Arbol y nunca reinicia el contador
    }
}