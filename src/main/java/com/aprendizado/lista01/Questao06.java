/*
 * Questão 06: Crie um método que calcula recursivamente o fatorial de um número
 */

package com.aprendizado.lista01;

public class Questao06 {
    public static int fatorial(int num){
        if(num == 1){
            return num;
        }

        return fatorial(num-1)*num;
    }

    public static void main(String[] args) {
        int num = 5;
        
        System.out.println(fatorial(num));
    }
}
