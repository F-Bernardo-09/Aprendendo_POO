/*
 * Questão 04: Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
 * Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido,
 * seu programa deve exibir o mesmo número de asteriscos adjacentes.
 * Por exemplo, se seu programa lê o número 7, ele deve exibir ******* .
 * Exiba as barras dos asteriscos depois de ler os cinco números.
 */

package com.aprendizado.lista02.questao04;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantNum = 5;
        int[] lista = new int[quantNum];
        
        for(int i = 0; i < quantNum; i++){
            System.out.printf("Digite o %dº da lista: ", i+1);
            lista[i] = sc.nextInt();
        } 
        sc.close();

        Asteristico aster = new Asteristico(quantNum, lista);
        aster.retornarAsteristico();
    }
}
