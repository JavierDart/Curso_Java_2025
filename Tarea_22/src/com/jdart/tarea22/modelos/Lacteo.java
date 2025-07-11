package com.jdart.tarea22.modelos;

public class Lacteo extends  Producto{
    int cantidad;
    int proteinas;

    public Lacteo(String nombre, Double precio,int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad=cantidad;
        this.proteinas=proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return "Producto Lacteo: Cantidad:" + cantidad +
                ", proteinas:" + proteinas +", "+super.toString();
    }
}
