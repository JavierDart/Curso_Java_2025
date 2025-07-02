package com.jdart.tarea23.modelos;

public class ArtLimpieza extends Productos{
    String uso;
    double precio;

    public ArtLimpieza(String nombre, int cantidad, String uso, double precio) {
        super(nombre, cantidad);
        this.uso = uso;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUso() {
        return uso;
    }

    @Override
    public String toString() {
        return "Articulos limpieza: \n Uso:" + uso +
                ", precio:" + precio +"\n"+super.toString();
    }

}
