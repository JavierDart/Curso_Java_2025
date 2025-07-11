package com.jdart.Tarea_26.modelos;

public class NoPerecible extends Producto {
    private int duracionMeses;
    private String tipoEnvase;

    public NoPerecible(String nombre, double precio, int duracionMeses, String tipoEnvase) {
        super(nombre, precio);
        this.duracionMeses = duracionMeses;
        this.tipoEnvase = tipoEnvase;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }
}

