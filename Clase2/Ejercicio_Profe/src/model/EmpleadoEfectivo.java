package model;

public class EmpleadoEfectivo extends Empleado{
    private double sueldoBasico;
    private double descuentos;
    private double premios;

    public EmpleadoEfectivo(String nombre, String apellido, String numeroCuenta, double sueldoBasico, double descuentos, double premios){
        super(nombre, apellido, numeroCuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuentos = descuentos;
        this.premios = premios;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getDescuentos() {
        return this.descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getPremios() {
        return this.premios;
    }

    public void setPremios(double premios) {
        this.premios = premios;
    }
}
