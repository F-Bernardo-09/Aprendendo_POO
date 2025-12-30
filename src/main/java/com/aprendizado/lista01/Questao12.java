/*
 * Questão 12: Crie um algoritmo que receba um número de até três dígitos e informe a soma dos dígitos
 * Exemplo: 123 resultado: 6 (1+2+3)
 */

package com.aprendizado.lista01;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de três algarismos: ");
        int num = scanner.nextInt();

        int centena = num / 100;
        int dezena = (num / 10)% 10;
        int unidade = num % 10;
        
        int soma = centena + dezena + unidade;

        System.out.printf("Somando os algarismos do número %d (%d, %d, %d) é igual a: %d \n", num, centena, dezena, unidade, soma);

        scanner.close();
    }
}
