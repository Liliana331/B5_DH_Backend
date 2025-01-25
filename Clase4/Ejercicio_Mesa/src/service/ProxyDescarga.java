package service;

import model.TipoUsuario;
import model.Usuario;

public class ProxyDescarga implements IServicioDescarga{

    ServicioDescarga servicioDescarga;

    public ProxyDescarga() {
        this.servicioDescarga = new ServicioDescarga();
    }

    @Override
    public String descargar(Usuario usuario) {
        if(usuario.getTipoUsuario().equals(TipoUsuario.PREMIUM)){
            return  servicioDescarga.descargar(usuario);
        }
        return "El usuario no es Premium";
    }
}
