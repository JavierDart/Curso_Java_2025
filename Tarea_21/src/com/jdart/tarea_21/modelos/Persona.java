package com.jdart.tarea_21.modelos;

public class Persona {
    String nombre;
    String apellido;
    String numeroFiscal;
    String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Nombre completo:" + nombre + " " + apellido + "\n" +
                "Nº Fiscal:" + numeroFiscal + "\n" +
                "Dirección:" + direccion;
    }
}
