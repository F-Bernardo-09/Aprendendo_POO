/*
 * Questão 08: Leia 3 números inteiros positivos. Ao final:
 * 1. Exiba o maior e o menor número
 * 2. Calcule a média dos números pares
 * 3. Informe quantos múltiplos de 3 foram digitados
 */

package com.aprendizado.lista01;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantNum = 3, maior = 0, contadorPar = 0, multiploTres = 0;
        float somaPar = 0, mediaPar = 0;
        int[] numeros = new int[quantNum];

        for(int i = 0; i < quantNum; i++){
            System.out.printf("Digite o %dº número inteiro: ", i+1);
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < quantNum; i++){
            maior = numeros[0];

            if (maior < numeros[i]){
                maior = numeros[i];
            }

            if (numeros[i] % 2 == 0){
                contadorPar ++;
                somaPar += numeros[i];
            }

            if (numeros[i] % 3 == 0){
                multiploTres++;
            }
        }

        if(contadorPar > 0){
            mediaPar = somaPar/contadorPar;
        }

        System.out.printf("O maior número é: %d \n", maior);
        System.out.printf("A média entre números pares é: %.2f \n", mediaPar);
        System.out.printf("O número de múltiplos de três: %d \n", multiploTres);

        scanner.close();
    }
}
