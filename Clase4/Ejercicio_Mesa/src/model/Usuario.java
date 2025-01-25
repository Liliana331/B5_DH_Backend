package model;

public class Usuario {
    private String dni;
    private TipoUsuario tipoUsuario;

    public Usuario(String dni, TipoUsuario tipoUsuario) {
        this.dni = dni;
        this.tipoUsuario = tipoUsuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
