package com.aprendizado.lista04.questao05;

abstract class Personagens {
    protected String nome;
    protected int poder;

    public Personagens(String nome, int poder){
        this.nome = nome;
        this.poder = poder;
    }

    abstract void atacar();
}
