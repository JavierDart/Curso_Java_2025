package com.jdart.zoologico.modelos.concretos;

import com.jdart.zoologico.modelos.abstractos.Canino;

public class Lobo extends Canino {
    int numCamada;
    String especieLobo;

    public Lobo(String habitat, Double altura, Double largo, Double peso, String nomCientifico,
                String color, Double tamanyoColmillos) {
        super(habitat, altura, largo, peso, nomCientifico, color, tamanyoColmillos);
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza junto a su grupo de " + numCamada + " individuos en los bosques de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cabernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " " + color + " aulla en luna llena";
    }
}
