package com.aprendizado.lista02.questao04;

public class Asteristico {
    private int quantNum;
    private int[] lista;

    public Asteristico(int quantNum, int[] lista){
        this.quantNum = lista.length;
        this.lista = lista;
    }

    public void retornarAsteristico(){
        for(int i = 0; i < quantNum; i++){
            for(int k = 0; k < lista[i]; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    } 
}
