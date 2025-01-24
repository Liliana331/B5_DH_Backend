package service;

import model.Mail;

public class Spam extends CompruebaMail{
    @Override
    public String comprobarMail(Mail mail) {
        return "Marcado como SPAM";
    }
}
