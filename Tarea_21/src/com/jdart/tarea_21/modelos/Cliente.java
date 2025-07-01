package com.jdart.tarea_21.modelos;

public class Cliente  extends  Persona{
    int clienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId=clienteId;
    }


    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "clienteId=" + clienteId + ", "+super.toString();
    }
}
