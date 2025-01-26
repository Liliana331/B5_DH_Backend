package model;

public class Computadora {
    private String sistemaOperativo;
    private int ram;
    private int discoDuro;
    public static int contador = 0;

    /*public Computadora(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        Computadora.contador +=1;
    }*/

    public Computadora(String sistemaOperativo, int ram, int discoDuro) {
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.discoDuro = discoDuro;
        Computadora.contador++;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public static int getContador() {
        return contador;
    }

    public String descripcionComputadora(){
        return "Computadora: " + getSistemaOperativo() + "= RAM: " + getRam() + ", DD: " + getDiscoDuro();
    }

}
