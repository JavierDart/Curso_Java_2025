package com.jdart.Tarea_26.modelos;

public class Lacteo extends Producto {
    private int diasCaducidad;
    private boolean refrigerado;

    public Lacteo(String nombre, double precio, int diasCaducidad, boolean refrigerado) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
        this.refrigerado = refrigerado;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }
}

