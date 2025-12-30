package com.aprendizado.lista06.questao02;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MegaSena sorteioMegaSena = new MegaSena();

        System.out.println("--- Sorteio Mega-Sena ---");

        while (!sorteioMegaSena.estaCompleto()) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (sorteioMegaSena.adicionarNumero(num)) {
                System.out.println("Número aceito!");
            }
        }

        sorteioMegaSena.ordenarExibir();
        sc.close();
    }
}
