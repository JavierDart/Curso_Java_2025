package com.jdart.tarea25.modelos.abstractos;

import com.jdart.tarea25.interfaces.IProducto;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
