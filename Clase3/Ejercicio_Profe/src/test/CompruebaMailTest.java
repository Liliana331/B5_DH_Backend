package test;

import model.Mail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.*;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {
    @Test
    @DisplayName("Se hace prueba de Mail para Gerencia")
    void testGerencia(){
        Mail mail = new Mail("email@email.com", "gerencia@colmena.com", "Asunto de Gerencia");
        ProcesarMail prueba = new ProcesarMail();

        String resultadoEsperado = "Este email es para gerencia. Yo me encargo";
        String resultadoObtenido = prueba.CadenaResponsabilidadMail(mail);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    @DisplayName("Se hace prueba de Mail para Comercial")
    void testComercial(){
        Mail mail = new Mail("email@email.com", "comercial@colmena.com", "Asunto");
        ProcesarMail prueba = new ProcesarMail();


        String resultadoEsperado = "Este email es para comercial. Yo me encargo";
        String resultadoObtenido = prueba.CadenaResponsabilidadMail(mail);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    @DisplayName("Se hace prueba de Mail para Tecnico")
    void testTecnico(){
        Mail mail = new Mail("email@email.com", "tecnico@colmena.com", "Asunto");
        ProcesarMail prueba = new ProcesarMail();

        String resultadoEsperado = "Este email es para tecnico. Yo me encargo";
        String resultadoObtenido = prueba.CadenaResponsabilidadMail(mail);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    @DisplayName("Se hace prueba de Mail para Otros")
    void testOtros(){
        Mail mail = new Mail("email@email.com", "otro@colmena.com", "Asunto");
        ProcesarMail prueba = new ProcesarMail();


        String resultadoEsperado = "Marcado como SPAM";
        String resultadoObtenido = prueba.CadenaResponsabilidadMail(mail);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

}