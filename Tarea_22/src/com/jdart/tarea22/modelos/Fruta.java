package com.jdart.tarea22.modelos;

public class Fruta extends Producto{
    double peso;
    String color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Producto fruta: Peso:" + peso +
                ", color:'" + color + ", "+super.toString();
    }
}
