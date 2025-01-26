package test;

import service.ArbolFactory;

public class Main {
    public static void main(String[] args) {
        ArbolFactory prueba1 = new ArbolFactory();
        for(int i = 0; i < 1000000; i++){
            prueba1.getArbol("floral");
            prueba1.getArbol("ornamental");
        }

        /*Runtime runtime = Runtime.getRuntime();
        long memoriaLibre = runtime.freeMemory();
        long memoriaTotal = runtime.totalMemory();
        long memoriaUsada = memoriaTotal - memoriaLibre;

        System.out.println("memoriaUsada = " + memoriaUsada);*/

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) /(1024*1024));

    }
}
