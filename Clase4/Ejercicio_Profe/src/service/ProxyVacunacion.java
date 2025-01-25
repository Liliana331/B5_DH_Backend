package service;

import model.Persona;
import java.time.LocalDate;

public class ProxyVacunacion implements IVacunacion{

    private Vacunacion vacunacion;

    public ProxyVacunacion() {
        this.vacunacion = new Vacunacion();
    }

    @Override
    public String vacunar(Persona persona){
        LocalDate fechaActual = LocalDate.now();
        if(persona.getFechaVacuna().isAfter(fechaActual) || persona.getFechaVacuna().isEqual(fechaActual)){
            return this.vacunacion.vacunar(persona);
        }
        return "Aún no es fecha de la vacunación";
    }
}
