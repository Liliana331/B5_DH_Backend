package service;

import model.Articulo;

public abstract class AnalistaCalidad {
    private AnalistaCalidad siguiente;

    public AnalistaCalidad getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(AnalistaCalidad siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String validarProducto(Articulo articulo);
}
