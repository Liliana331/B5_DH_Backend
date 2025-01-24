package service;

import model.Mail;

public class DptoTecnico extends CompruebaMail{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getDestino().contains("tecnico") || mail.getTema().contains("tecnico")){
            return  "Este email es para tecnico. Yo me encargo";
        }
        return getSigMail().comprobarMail(mail);
    }
}
