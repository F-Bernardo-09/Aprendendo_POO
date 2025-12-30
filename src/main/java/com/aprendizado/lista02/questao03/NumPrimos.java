package com.aprendizado.lista02.questao03;

public class NumPrimos {
    private int num1;
    private int num2;

    public NumPrimos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void verificarPrimos(){
        for (int k = num1; k<= num2; k++){
            int contador = 0;
            for (int i = num1; i <= k; i++){
                if(k % i == 0){
                    contador++;
                }
            }
            if(contador == 1){
                System.out.println(k);           
            }
        }    
    }
}
