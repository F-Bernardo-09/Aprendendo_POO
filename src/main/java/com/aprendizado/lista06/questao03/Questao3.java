package com.aprendizado.lista06.questao03;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = sc.nextInt();

        Fibonacci fi = new Fibonacci(n);

        System.out.println("Série de Fibonacci:");
        fi.exibir();

        sc.close();
    }
}
