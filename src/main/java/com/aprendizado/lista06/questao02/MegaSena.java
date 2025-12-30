package com.aprendizado.lista06.questao02;

import java.util.Arrays;

class MegaSena {
    private int[] numeros;
    private int contador;

    public MegaSena() {
        this.numeros = new int[6];
        this.contador = 0;
    }

    public boolean adicionarNumero(int numero) {
        if (numero < 1 || numero > 60) {
            System.out.println("Número fora do intervalo (1-60).");
            return false;
        }

        if (jaExiste(numero)) {
            System.out.println("Número duplicado.");
            return false;
        }

        if (contador < 6) {
            numeros[contador] = numero;
            contador++;
            return true;
        }

        return false;
    }

    private boolean jaExiste(int numero) {
        for (int i = 0; i < contador; i++) {
            if (numeros[i] == numero) return true;
        }
        return false;
    }

    public void ordenarExibir() {
        Arrays.sort(numeros);
        System.out.println("Jogo: " + Arrays.toString(numeros));
    }

    public boolean estaCompleto() {
        return contador == 6;
    }
}
