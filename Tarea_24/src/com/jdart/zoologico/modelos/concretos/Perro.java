package com.jdart.zoologico.modelos.concretos;

import com.jdart.zoologico.modelos.abstractos.Canino;

public class Perro extends Canino {
    int fuerzaMordida;

    public Perro(String habitat, Double altura, Double largo, Double peso, String nomCientifico, String color, Double tamanyoColmillos) {
        super(habitat, altura, largo, peso, nomCientifico, color, tamanyoColmillos);
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mordida de " + fuerzaMordida + " PSI, posee fuertes mandíbulas y grandes orejas redondeadas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String correr() {
        return "El perro africano corre en las llanuras aledañas a la sabana!";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerías nocturnas";
    }
}
