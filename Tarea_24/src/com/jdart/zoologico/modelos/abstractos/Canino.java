package com.jdart.zoologico.modelos.abstractos;

abstract public class Canino extends  Mamifero{
    protected String color;
    protected Double tamanyoColmillos;

    public Canino(String habitat, Double altura, Double largo, Double peso, String nomCientifico, String color, Double tamanyoColmillos) {
        super(habitat, altura, largo, peso, nomCientifico);
        this.color = color;
        this.tamanyoColmillos = tamanyoColmillos;
    }

    public String getColor() {
        return color;
    }

    public Double getTamanyoColmillos() {
        return tamanyoColmillos;
    }
}
