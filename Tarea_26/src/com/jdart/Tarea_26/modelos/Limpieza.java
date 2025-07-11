package com.jdart.Tarea_26.modelos;

public class Limpieza extends Producto {
    private String uso;
    private boolean esToxico;

    public Limpieza(String nombre, double precio, String uso, boolean esToxico) {
        super(nombre, precio);
        this.uso = uso;
        this.esToxico = esToxico;
    }

    public String getUso() {
        return uso;
    }

    public boolean isEsToxico() {
        return esToxico;
    }
}
