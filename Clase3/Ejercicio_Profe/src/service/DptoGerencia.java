package service;

import model.Mail;

public class DptoGerencia extends CompruebaMail{

    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getDestino().contains("gerencia") || mail.getTema().contains("gerencia")){
            return  "Este email es para gerencia. Yo me encargo";
        }
        return getSigMail().comprobarMail(mail);
    }
}
