package com.jdart.zoologico.modelos.concretos;

import com.jdart.zoologico.modelos.abstractos.Felino;

public class Leon extends Felino {
    int numManada;
    Double potenciaRugido;

    public Leon(String habitat, Double altura, Double largo, Double peso, String nomCientifico, Double tamanyoGarras,
                int velocidad, int numManada, Double potenciaRugido) {
        super(habitat, altura, largo, peso, nomCientifico, tamanyoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El león duerme en las cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El león corre a "+velocidad +" km/h";
    }

    @Override
    public String comunicarse() {
        return "El león ruge con una potencia de "+potenciaRugido+" mb";
    }

    public int getNumManada() {
        return numManada;
    }

    public Double getPotenciaRugido() {
        return potenciaRugido;
    }
}
