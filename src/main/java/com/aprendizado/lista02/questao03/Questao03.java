package com.aprendizado.lista02.questao03;

import java.util.Scanner;

/**
 * Peça ao usuario um número inteiro positivo N. Em seguida, 
 * imprima todos os números primos entre 2 e N
 */
public class Questao03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInicial = 2, N = 0;

        System.out.println("Digite um número inteiro");
        N = sc.nextInt();
        sc.close();
    
        NumPrimos ehPrimo = new NumPrimos(numInicial, N);

        ehPrimo.verificarPrimos();
    }   
}
