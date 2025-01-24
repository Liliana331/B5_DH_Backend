package service;

import model.Empleado;
import model.EmpleadoEfectivo;

public class LiquidadorEfectivo extends Liquidador{

    EmpleadoEfectivo empleadoEfectivo;

    @Override
    public double calcularSueldo(Empleado empleado) {
        double sueldo = 0;
        if(empleado instanceof EmpleadoEfectivo){
            //se debe castear para que no arroje excepción de null pointer
            empleadoEfectivo = (EmpleadoEfectivo) empleado;
            double sueldoBase = empleadoEfectivo.getSueldoBasico();
            double premios = empleadoEfectivo.getPremios();
            double descuentos = empleadoEfectivo.getDescuentos();
            sueldo = sueldoBase + premios - descuentos;
        }else{
            return 0;
        }
        return sueldo;
    }

    public String imprimir(Empleado empleado){
        return "documento impreso";
    }
}
