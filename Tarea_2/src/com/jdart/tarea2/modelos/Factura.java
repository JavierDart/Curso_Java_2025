package com.jdart.tarea2.modelos;

public class Factura {
    String nombre;
    String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String calculaTotal(double p1,double p2){
        Double total = p1 + p2;
        Double impuesto = 0.19;
        double totalConImpuesto = total * impuesto;

        return "La factura "+this.getNombre()+"  tiene un total bruto de "+total+", " +
                "con un impuesto de "+totalConImpuesto+" y el monto después de impuesto es de "+ total+totalConImpuesto;
    }

}
