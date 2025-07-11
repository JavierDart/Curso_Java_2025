package com.jdart.Tarea_26.modelos;

public class Fruta extends Producto {
    private String tipo;
    private boolean esOrganica;

    public Fruta(String nombre, double precio, String tipo, boolean esOrganica) {
        super(nombre, precio);
        this.tipo = tipo;
        this.esOrganica = esOrganica;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isEsOrganica() {
        return esOrganica;
    }
}

