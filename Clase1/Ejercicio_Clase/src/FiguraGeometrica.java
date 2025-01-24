public class FiguraGeometrica {
    private String tipoFigura;
    private double valor;

    public FiguraGeometrica(String tipoFigura, double valor) {
        this.tipoFigura = tipoFigura;
        this.valor = valor;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularArea(){
        double valorArea = 0;
        if(this.tipoFigura.equalsIgnoreCase("circulo")){
            valorArea = Math.PI*Math.pow(this.valor, 2);
        }else if(this.tipoFigura.equalsIgnoreCase("cuadrado")){
            valorArea = Math.pow(this.valor, 2);
        }else {
            valorArea = -1;
        }

        return  valorArea;
    }

    public String imprimirDato(){
        String mensaje = "";
        if(this.valor > 0){
            double area = calcularArea();
            mensaje = "El área del " +  this.tipoFigura + " es " + area + " unidades";
        }
        else{
            mensaje = "El valor del radio o lado debe ser mayor que cero";
        }
        return mensaje;
    }
}
