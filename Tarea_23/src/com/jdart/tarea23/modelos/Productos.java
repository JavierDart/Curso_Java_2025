package com.jdart.tarea23.modelos;

public class Productos {
    String nombre;
    int cantidad;

    public Productos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Nombre producto:'" + nombre +
                ", cantidad:" + cantidad +"\n";
    }
}
