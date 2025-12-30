/*
 * Questão 02: Crie um programa que calcula as raízes de uma equação de segundo grau
 */

package com.aprendizado.lista01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        double a, b, c, delta, x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o termo A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o termo B: ");
        b = scanner.nextDouble();

        System.out.print("Digite o termo C: ");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4*a*c;

        if (delta < 0){
            System.out.println("Não tem raiz quadrada");
        }
        
        if (delta == 0){
            System.out.println("Apenas uma raíze quadrada");
            x = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println(x);
        }
        
        if (delta > 0){
            System.out.println("São duas raízes quadradas");

            x = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println(x);

            x = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println(x);
        }

        scanner.close();
    }
}
