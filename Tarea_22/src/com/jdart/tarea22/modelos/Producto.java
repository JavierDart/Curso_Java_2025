package com.jdart.tarea22.modelos;

public class Producto {
    String nombre;
    Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre de producto:'" + nombre + ", precio:" + precio +"€";
    }
}
