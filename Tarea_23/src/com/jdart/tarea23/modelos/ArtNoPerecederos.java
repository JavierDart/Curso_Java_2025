package com.jdart.tarea23.modelos;

public class ArtNoPerecederos extends Productos{
    double precio;

    public ArtNoPerecederos(String nombre, int cantidad, double precio) {
        super(nombre, cantidad);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return "Articulos NO Perecederos: \n Precio=" + precio +"\n"+super.toString();
    }
}
