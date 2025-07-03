package com.jdart.tarea25.modelos;

import com.jdart.tarea25.modelos.abstractos.Electronico;

public class Iphone extends Electronico {
    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }
}
