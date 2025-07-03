package com.jdart.zoologico.modelos.abstractos;

abstract public class Felino extends  Mamifero{
    protected Double tamanyoGarras;
    protected int velocidad;

    public Felino(String habitat, Double altura, Double largo, Double peso, String nomCientifico, Double tamanyoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nomCientifico);
        this.tamanyoGarras = tamanyoGarras;
        this.velocidad = velocidad;
    }

    public Double getTamanyoGarras() {
        return tamanyoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
