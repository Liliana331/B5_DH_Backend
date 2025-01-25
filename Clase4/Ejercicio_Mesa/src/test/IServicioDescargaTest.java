package test;

import model.TipoUsuario;
import model.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.IServicioDescarga;
import service.ProxyDescarga;

import static org.junit.jupiter.api.Assertions.*;

class IServicioDescargaTest {

    @Test
    @DisplayName("Prueba usuario Premium")
    void Test1(){
        Usuario usuario = new Usuario("123", TipoUsuario.PREMIUM);
        IServicioDescarga descarga = new ProxyDescarga();

        String respuestaEsperada = "Descarga realizada con éxito";
        String respuestaObtenida = descarga.descargar(usuario);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    @DisplayName("Prueba usuario Free")
    void Test2(){
        Usuario usuario = new Usuario("123", TipoUsuario.FREE);
        IServicioDescarga descarga = new ProxyDescarga();

        String respuestaEsperada = "El usuario no es Premium";
        String respuestaObtenida = descarga.descargar(usuario);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }
}