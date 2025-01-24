package service;

import model.Mail;

public class DptoComercial extends CompruebaMail{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getDestino().contains("comercial") || mail.getTema().contains("comercial")){
            return  "Este email es para comercial. Yo me encargo";
        }
        return getSigMail().comprobarMail(mail);
    }
}
