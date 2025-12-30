package com.aprendizado.lista02.questao02;

import java.util.Scanner;

/**
 * Peça um número ao usuário. Verifique e imprima:
 * 1. "Múltiplo de 3", se for múltiplo de 3;
 * 2. "Múltiplo de 5", se for múltiplo de 5;
 * 3. "Múltiplo de ambos", se for múltiplo de 3 e 5;
 * 4. "Não é múltiplo de 3 nem de 5", caso contrário.
 */
public class Questao02 {
    public static void main(String[] args){
        int multiploUm = 3, multiploDois = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();
        sc.close();

        VerificarMultiplo verifica = new VerificarMultiplo(multiploUm, multiploDois, num);

        String resultado = verifica.verificar();
        System.out.println(resultado);        
    }
}
