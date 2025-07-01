package com.jdart.tarea22.modelos;

public class Limpieza extends Producto{
    String componentes;
    double litros;

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return "Producto de Limpieza: componentes:'" + componentes +
                ", litros:" + litros +", "+super.toString();
    }
}
