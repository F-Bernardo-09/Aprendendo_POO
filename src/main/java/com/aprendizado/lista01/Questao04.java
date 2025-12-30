/*
 * Questão 04: Crie um método que recebe um número inteiro e verifica se ele é um número perfeito
 */

package com.aprendizado.lista01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        int num, somatoria = 0; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é perfeito:");
        num = scanner.nextInt();

        for(int i = 1; i < num; i++){
            if (num%i == 0){
                somatoria += i;
            }
        }

        if(num == somatoria){
            System.out.println("O número é perfeito");
        }
        else{
            System.out.println("O número não é perfeito");
        }

        scanner.close();
    }
}
