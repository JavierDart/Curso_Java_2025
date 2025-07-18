package com.jdart.tarea25.modelos;

import com.jdart.tarea25.modelos.abstractos.Electronico;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }

    public int getPulgada() {
        return pulgada;
    }
}
