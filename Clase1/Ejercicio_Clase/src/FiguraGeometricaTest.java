import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraGeometricaTest {
    @Test
    @DisplayName("Calcular un area mayor a cero")
    void test1(){
        FiguraGeometrica figura1 = new FiguraGeometrica("circulo", 1);
        double valArea = figura1.calcularArea();

        String valorObtenido = figura1.imprimirDato();
        String valorEsperado = "El área del circulo es " + valArea + " unidades";

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    @DisplayName("Calcular un area igual a cero")
    void test2(){
        FiguraGeometrica figura1 = new FiguraGeometrica("circulo", 0);
        double valArea = figura1.calcularArea();

        String valorObtenido = figura1.imprimirDato();
        String valorEsperado = "El valor del radio o lado debe ser mayor que cero";

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    @DisplayName("Calcular un area menor a cero")
    void test3(){
        FiguraGeometrica figura1 = new FiguraGeometrica("circulo", -1);
        double valArea = figura1.calcularArea();

        String valorObtenido = figura1.imprimirDato();
        String valorEsperado = "El valor del radio o lado debe ser mayor que cero";

        assertEquals(valorEsperado, valorObtenido);
    }

}