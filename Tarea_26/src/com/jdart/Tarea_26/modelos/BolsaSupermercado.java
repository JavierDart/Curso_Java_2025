package com.jdart.Tarea_26.modelos;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> productos;

    public BolsaSupermercado() {
        productos = new ArrayList<>();
    }

    public void addProducto(T producto) {
        if (productos.size() < 5) {
            productos.add(producto);
        } else {
            System.out.println("La bolsa ya está llena (máximo 5 productos).");
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}

