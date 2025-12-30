package com.aprendizado.lista06.questao03;

import java.util.Arrays;

class Fibonacci {
    private int[] sequenciaNum;

    public Fibonacci(int n) {
        if (n <= 0) {
            this.sequenciaNum = new int[0];
        } 
        else {
            this.sequenciaNum = new int[n];
            gerar(n);
        }
    }

    public void gerar(int n) {
        if (n >= 1) sequenciaNum[0] = 0;
        if (n >= 2) sequenciaNum[1] = 1;

        for (int i = 2; i < n; i++) {
            sequenciaNum[i] = sequenciaNum[i - 1] + sequenciaNum[i - 2];
        }
    }

    public void exibir() {
        System.out.println(Arrays.toString(sequenciaNum));
    }
}
