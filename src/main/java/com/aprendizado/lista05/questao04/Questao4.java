package com.aprendizado.lista05.questao04;

public class Questao4 {
    public static void main(String[] args) {
        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0){
                System.out.println("Error");
                return 0;
            }
            return a / b;
        };

        double valorUm = 10;
        double valorDois = 5;

        System.out.println("Resultados:");
        System.out.println("Soma: " + soma.executar(valorUm, valorDois));
        System.out.println("Subtração: " + subtracao.executar(valorUm, valorDois));
        System.out.println("Multiplicação: " + multiplicacao.executar(valorUm, valorDois));
        System.out.println("Divisão: " + divisao.executar(valorUm, valorDois));
    }
}
