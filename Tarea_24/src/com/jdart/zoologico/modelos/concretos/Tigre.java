package com.jdart.zoologico.modelos.concretos;

import com.jdart.zoologico.modelos.abstractos.Felino;

public class Tigre extends Felino {
    String especie;

    public Tigre(String habitat, Double altura, Double largo, Double peso, String nomCientifico,
                 Double tamanyoGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nomCientifico, tamanyoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() {
        return "El Tigre " + especie + " caza solitario en los manglares y bosques monzónicos de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especie + " duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre " + especie + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge y agacha sus orejas";
    }
}
