package com.jdart.tarea25.modelos.abstractos;

import com.jdart.tarea25.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

}
