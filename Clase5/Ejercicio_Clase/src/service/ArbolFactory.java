package service;

import model.Arbol;

import java.util.HashMap;

public class ArbolFactory {
    private static final HashMap<String, Arbol> poolArboles = new HashMap<String, Arbol>();

    public Arbol getArbol(String tipo){
        Arbol arbol = poolArboles.get(tipo);
        if(arbol == null){
            switch (tipo){
                case "ornamental":
                    arbol = new Arbol(tipo, 200, 400, "verde");
                    break;
                case "frutal":
                    arbol = new Arbol(tipo, 500, 300, "rojo");
                    break;
                case "floral":
                    arbol = new Arbol(tipo, 100, 200, "celeste");
                    break;
                default:
                    System.out.println("El tipo de arbol indicado no existe");
            }
            poolArboles.put(tipo, arbol);
            System.out.println("Se ha creado el arbol: " + tipo);
        }
        //System.out.println(arbol);
        return arbol;
    }
}
