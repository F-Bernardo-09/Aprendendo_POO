package com.aprendizado.lista03.questao04;

public class ContaCorrente {
    private int numero;
    private String nome;
    private float saldo;

    public ContaCorrente(String nome, int numero, float saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Get usado para ler o número
    public int getNumero(){
        return this.numero;
    }

    // Get usado para ler saldo
    public float getSaldo(){
        return this.saldo;
    }
    
    // Get usado para ler nome do usuario
    public String getNome(){
        return this.nome;
    }

    // Validando deposito
    public void depositar(float maisSaldo){
        if(maisSaldo > 0){
            this.saldo += maisSaldo; 
        }
        else{
            System.out.println("O valor não pode ser negativo");
        }
    }

    // Validando saque
    public void sacar(float novoSaque){
        if(novoSaque > 0 && novoSaque <= saldo && novoSaque < 10000){
            this.saldo -= novoSaque;
        }
        else{
            System.out.println("Os valor digitado não se enquadra nos padrões.\nTente Novamente!");
        }
    }

    public void consultarSaldo() {
        System.out.printf("%s, seu saldo atual é: %.2f\n", getNome(), getSaldo());
    }
}
