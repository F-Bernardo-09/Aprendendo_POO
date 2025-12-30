package com.aprendizado.lista04.questao04;

abstract class Pagamento {
    protected double valor;
    protected int parcelas;

    public Pagamento(double valor){
        this.valor = valor;
    }

    abstract void processar();

    abstract void apresentarDados();
}