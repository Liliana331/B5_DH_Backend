package model;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaVacuna;
    private String vacuna;

    public Persona(String nombre, String apellido, int dni, LocalDate fechaVacuna, String vacuna) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaVacuna = fechaVacuna;
        this.vacuna = vacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(LocalDate fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }
}
