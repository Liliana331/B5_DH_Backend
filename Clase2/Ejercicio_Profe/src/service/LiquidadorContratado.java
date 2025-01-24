package service;

import model.Empleado;
import model.EmpleadoContratado;

public class LiquidadorContratado extends Liquidador{

    EmpleadoContratado empleadoContratado;
    @Override
    public double calcularSueldo(Empleado empleado) {
        //se debe castear para que no arroje excepción de null pointer
        if(empleado instanceof EmpleadoContratado empleadoContratado){
            //empleadoContratado = (EmpleadoContratado)empleado; //el instanceof permite inicializar una vble en la misma línea, evitando esta
            double sueldo = 0;
            double cantHoras = empleadoContratado.getCantidadHoras();
            double valorHora = empleadoContratado.getTarifaPorHora();
            return sueldo = cantHoras * valorHora;
        }

        return 0;
    }

    @Override
    public String imprimir(Empleado empleado) {
        return "documento digital";
    }

}
