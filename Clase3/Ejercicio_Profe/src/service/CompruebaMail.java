package service;

import model.Mail;

public abstract class CompruebaMail {

    private CompruebaMail sigMail;

    public abstract String comprobarMail(Mail mail);

    public CompruebaMail getSigMail() {
        return this.sigMail;
    }

    public void setSigMail(CompruebaMail sigMail) {
        this.sigMail = sigMail;
    }
}
