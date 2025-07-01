package com.jdart.tarea22.modelos;

public class NoPerecible extends Producto{
    int contenido;
    int calorias;

    public NoPerecible(String nombre, Double precio, int calorias, int contenido) {
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "Producto no perecible: contenido:" + contenido +
                ", calorias=" + calorias +", "+super.toString();
    }
}
