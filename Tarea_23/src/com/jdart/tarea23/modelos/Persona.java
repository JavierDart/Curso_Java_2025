package com.jdart.tarea23.modelos;

public class Persona {
    String nombre;
    String apellido;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Nombre completo:" + nombre + " " + apellido + "\n";
    }
}
