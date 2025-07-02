package com.jdart.tarea23.modelos;

public class Vendedor extends Persona{
    int idVendedor;
    String seccion;


    public Vendedor(String apellido, String nombre, int idVendedor, String seccion) {
        super(apellido, nombre);
        this.idVendedor = idVendedor;
        this.seccion = seccion;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getSeccion() {
        return seccion;
    }

    @Override
    public String toString() {
        return "IdVendedor:" + idVendedor +
                ", Sección:" + seccion + "\n "+ super.toString();
    }
}
