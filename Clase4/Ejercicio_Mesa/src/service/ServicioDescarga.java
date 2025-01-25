package service;

import model.Usuario;

public class ServicioDescarga implements IServicioDescarga{
    @Override
    public String descargar(Usuario usuario) {
        return "Descarga realizada con éxito";
    }
}
