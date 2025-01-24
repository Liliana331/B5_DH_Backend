package model;

public class EmpleadoContratado extends Empleado{
    private double cantidadHoras;
    private double tarifaPorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroCuenta, double cantidadHoras, double tarifaPorHora) {
        super(nombre, apellido, numeroCuenta);
        this.cantidadHoras = cantidadHoras;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
