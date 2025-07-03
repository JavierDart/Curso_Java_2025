package com.jdart.zoologico.modelos.abstractos;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

abstract public class Mamifero {
    protected String habitat;
    protected Double altura;
    protected Double largo;
    protected Double peso;
    protected String nomCientifico;

    public Mamifero(String habitat, Double altura, Double largo, Double peso, String nomCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nomCientifico = nomCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getLargo() {
        return largo;
    }

    public Double getPeso() {
        return peso;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
