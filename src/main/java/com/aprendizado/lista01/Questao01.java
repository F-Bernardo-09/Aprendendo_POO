/*
 * Questão 01: Crie um programa que imprime todos os números múltiplos de 7 entre 0 e 1000
 */

package com.aprendizado.lista01;

public class Questao01 {
    public static void main(String[] args) {
        int i;
        int divisor = 7;
        int limite = 1000;

        for(i = 1; i <= limite; i++){
            if(i % divisor == 0){
                System.out.println(i);
            }
        }
    }
}
