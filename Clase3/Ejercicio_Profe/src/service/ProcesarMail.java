package service;

import model.Mail;

public class ProcesarMail {

    public String CadenaResponsabilidadMail(Mail mail){
        CompruebaMail manejador1 = new DptoGerencia();
        CompruebaMail manejador2 = new DptoComercial();
        CompruebaMail manejador3 = new DptoTecnico();
        CompruebaMail manejador4 = new Spam();

        manejador1.setSigMail(manejador2);
        manejador2.setSigMail(manejador3);
        manejador3.setSigMail(manejador4);

        return manejador1.comprobarMail(mail);
    }
}
