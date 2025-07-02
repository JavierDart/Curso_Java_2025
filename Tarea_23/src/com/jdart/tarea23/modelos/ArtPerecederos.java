package com.jdart.tarea23.modelos;

import java.util.Date;

public class ArtPerecederos extends Productos{
    Date caducidad;
    double precio;

    public ArtPerecederos(String nombre, int cantidad, Date caducidad, double precio) {
        super(nombre, cantidad);
        this.caducidad = caducidad;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    @Override
    public String toString() {
        return "Articulos Perecederos: \n Caducidad:" + caducidad +
                ", precio=" + precio +"\n"+super.toString();
    }
}
