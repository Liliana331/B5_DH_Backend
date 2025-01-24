import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    @DisplayName("Testo que los nombres sean mayores a 5 letras")
    void test1(){
        Persona persona1 = new Persona("Jhon", 20);
        Persona persona2 = new Persona("Pedro", 20);
        Persona persona3 = new Persona("Ana", 20);
        Persona persona4 = new Persona("Luz", 20);
        Persona persona5 = new Persona("Julian", 20);

        Grupo grupo1 = new Grupo();
        grupo1.agregarPersona(persona1);
        grupo1.agregarPersona(persona2);
        grupo1.agregarPersona(persona3);
        grupo1.agregarPersona(persona4);
        grupo1.agregarPersona(persona5);

        //grupo1.imprimirLista(grupo1.retornarPersonas());

        assertEquals(2, grupo1.retornarPersonas().size());
    }

    @Test
    @DisplayName("Testo que la edad sea mayor a 18")
    void Test2(){
        Persona persona1 = new Persona("Pedro", 18);
        Persona persona2 = new Persona("Pedro", 17);
        Persona persona3 = new Persona("Pedro", 22);
        Persona persona4 = new Persona("Pedro", 14);
        Persona persona5 = new Persona("Pedro", 32);

        Grupo grupo2 = new Grupo();
        grupo2.agregarPersona(persona1);
        grupo2.agregarPersona(persona2);
        grupo2.agregarPersona(persona3);
        grupo2.agregarPersona(persona4);
        grupo2.agregarPersona(persona5);

        int valorEsperado = 3;
        int valorObtenido = grupo2.retornarPersonas().size();

        assertEquals(valorEsperado, valorObtenido);
    }
}