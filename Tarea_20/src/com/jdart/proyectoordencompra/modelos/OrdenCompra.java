package com.jdart.proyectoordencompra.modelos;

import java.util.Date;

public class OrdenCompra {

    Integer identificador;
    String descripcion;
    Date fecha;
    Cliente cliente;
    Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public static int granTotal(Producto[] productos){
        int precioP =0;
        for (int i=0; i< productos.length; i++){
            precioP += productos[i].precio;
        }
        return precioP;
    }
}
