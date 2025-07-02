package com.jdart.tarea23.modelos;

public class Cliente extends Persona{
    int idCliente;

    public Cliente(String apellido, String nombre, int idCliente) {
        super(apellido, nombre);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "Cliente id:" + idCliente +" "+super.toString();
    }
}
