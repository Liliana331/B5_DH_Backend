import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> personas;

    public Grupo(){
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona){

        if(persona.mayor18Anios() && persona.nombreMayor5Letras() && persona.nombreContieneSoloAZ()){
            this.personas.add(persona);
        }
    }

    public List<Persona> retornarPersonas(){
        return personas;
    }

    public void imprimirLista(List<Persona> personas){
        for(Persona persona: personas){
            System.out.println(persona);
        }
    }

}
