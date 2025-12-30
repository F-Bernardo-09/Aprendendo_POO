package com.aprendizado.lista04.questao05;

class Arqueiro extends Personagens {
    public Arqueiro(String nome) {
        super(nome, 10);
    }

    @Override
    public void atacar() {
        System.out.println("[ARQUEIRO] " + nome + " disparou uma flecha! Dano: " + (poder * 2.0));
    }
}
