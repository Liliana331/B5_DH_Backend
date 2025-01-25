package service;

import model.Persona;

public class Vacunacion implements IVacunacion{
    @Override
    public String vacunar(Persona persona) {
        return "El paciente se ha vacunado correctamente";
    }
}
