package service;

import model.Producto;
import model.Tarjeta;

public interface IDescuento {
    int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad);
}
