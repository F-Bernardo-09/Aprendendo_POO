package com.aprendizado.lista04.questao05;

class Mago extends Personagens {
    private int ataqueEspecial = 50;

    public Mago(String nome) {
        super(nome, 5);
    }

    @Override
    public void atacar() {
        System.out.println("[MAGO] " + nome + " lança uma Bola de Fogo! Dano: " + (poder + ataqueEspecial));
        ataqueEspecial -= 15; 
    }
}
