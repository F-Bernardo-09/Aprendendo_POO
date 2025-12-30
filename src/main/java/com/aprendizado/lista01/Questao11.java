/*
 * Questão 11: Crie um programa que recebe uma senha do usuário e verifica se ela é igual à uma senha 
 * definida por você. Permita até três tentativas
 */

package com.aprendizado.lista01;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        int tentativas = 3;
        String senhaSistema = "123";
        String senhaUsuario;
        Scanner scanner = new Scanner(System.in);

        while(tentativas > 0){
            tentativas--;
            System.out.println("Digite a senha: ");
            senhaUsuario = scanner.nextLine();

            if (senhaUsuario.equals(senhaSistema)){
                System.out.println("Bem-vindo!");
                break;
            }

            else {
                System.out.println("Tente novamente!");
            }
        }
        
        scanner.close();
    }
}
