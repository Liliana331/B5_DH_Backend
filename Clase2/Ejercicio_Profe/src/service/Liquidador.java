package service;

import model.Empleado;

public abstract class Liquidador {
    public String liquidarSueldo(Empleado empleado){
        double sueldo = calcularSueldo(empleado);
        if(sueldo == 0){
         return "La liquidación no pudo ser calculada";
        }else{
            String mensajeImpresion = imprimir(empleado);
            depositar(empleado);
            return "La liquidación generada es un " + mensajeImpresion + ". Saldo a liquidar: " + sueldo;
        }

    }

    public abstract double calcularSueldo(Empleado empleado);

    public abstract String imprimir(Empleado empleado);

    public void depositar(Empleado empleado){
        System.out.println("Se está depositando en la cuenta: " + empleado.getNumeroCuenta());
    }

}
