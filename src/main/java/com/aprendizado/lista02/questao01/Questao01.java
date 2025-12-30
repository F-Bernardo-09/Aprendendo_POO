/*
 * Questão 01: Escreva um programa que leia o nome de um aluno e suas três notas, sendo a terceira nota com peso 2.
 * Calcule e exiba a média ponderada, com duas casas decimais.
 * Depois, exiba se o aluno está "Aprovado" (média ≥ 7) ou "Reprovado".
 */

package com.aprendizado.lista02.questao01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaEscolar sistema = new SistemaEscolar();

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();
    
        System.out.println("Quantas provas que registrar: ");
        int numProva = scanner.nextInt();

        double[] pesosNotas = new double[numProva];
        double[] boletim = new double[numProva];

        for(int i = 0; i < numProva; i++){
            System.out.printf("Diga qual sua %dº nota: ", i+1);
            boletim[i] = scanner.nextDouble();
            System.out.println("Qual o peso dessa nota: ");
            pesosNotas[i] = scanner.nextDouble();
            System.out.println();
        }

        SistemaEscolar.Estudante aluno = sistema.new Estudante(nome, boletim, pesosNotas);
        
        double media = sistema.MediaPonderada(boletim, numProva, pesosNotas);
        String resultado = sistema.ResulFinal(media);
        
        System.out.printf("Você, %s\n", aluno.getNome());
        System.out.printf("Média: %.2f\n", media);
        System.out.println(resultado);
        
        scanner.close();
    }
}
