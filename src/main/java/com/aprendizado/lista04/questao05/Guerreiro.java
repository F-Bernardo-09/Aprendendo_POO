package com.aprendizado.lista04.questao05;

class Guerreiro extends Personagens {
    public Guerreiro(String nome) {
        super(nome, 30); 
    }

    @Override
    public void atacar() {
        System.out.println("[GUERREIRO] " + nome + " brande sua espada! Sinta o poder: " + (poder * 1.5));
    }
}
