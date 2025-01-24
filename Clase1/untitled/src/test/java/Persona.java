public class Persona {
    private String nombre;
    private int edad;

    Persona(){

    }

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return "Nombre: " + this.nombre +
                ", edad: " + this.edad;
    }

    public boolean mayor18Anios(){
        return this.edad >= 18;
    }

    public boolean nombreMayor5Letras(){
        return this.nombre.length() >= 5;
    }

    public boolean nombreContieneSoloAZ(){
        return this.nombre.matches("[a-zA-Z]+");//expresion regular
    }
}
