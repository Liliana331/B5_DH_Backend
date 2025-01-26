package service;

import model.Computadora;

import java.util.HashMap;

public class ComputadoraFactory {
    private static final HashMap<String, Computadora> computadoraMap = new HashMap();

    public static Computadora getComputadora(String sistemaOperativo, int ram, int discoDuro){
        Computadora computadora = (Computadora) computadoraMap.get(sistemaOperativo);
        if(computadora == null){
            computadora = new Computadora(sistemaOperativo, ram, discoDuro);
            computadoraMap.put(sistemaOperativo, computadora);
            System.out.println("Creando la computadora de tipo: " + sistemaOperativo);
        }
        return computadora;
    }
}
