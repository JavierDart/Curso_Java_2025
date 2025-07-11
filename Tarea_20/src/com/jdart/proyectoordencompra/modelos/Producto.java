package com.jdart.proyectoordencompra.modelos;

public class Producto {
    String fabricante;
    String nombre;
    int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void addProducto(Producto producto){
        this.fabricante = producto.getFabricante();
        this.nombre = producto.getNombre();
        this.precio = producto.getPrecio();
    }
}
