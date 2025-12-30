/*
 * Questão 04:
 * 1. Crie uma classe chamada ContaCorrente com os seguintes atributos privados:
 *    1.1 numero (int)
 *    1.2 titular (String)
 *    1.3 saldo (float)
 * 
 * 2. Implemente os seguintes métodos públicos:
 *    2.1 sacar(float valor): subtrai o valor do saldo, se houver saldo suficiente.
 *        Não permitindo sacar mais de 10.000 por operação.
 *    2.2 depositar(float valor): adiciona o valor ao saldo, apenas se o valor for positivo e se
 *        não for superior a 10000.
 *    2.3 consultarSaldo(): retorna o saldo atual.
 */

package com.aprendizado.lista03.questao04;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        int num = 0, opcao = 0;
        String nomeTitular;
        float saldo = 0, novoValor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nomeTitular = sc.nextLine();
        System.out.println("Digite seu número de cadastro: ");
        num = sc.nextInt();

        ContaCorrente contaCorrente = new ContaCorrente(nomeTitular, num, saldo);

        while (opcao != 4) {
            System.out.println();
            System.out.println("Olá\n"+
                                "[1] Sacar um valor\n" + 
                                "[2] Depositar um valor\n" + 
                                "[3] Consultar o saldo\n" + 
                                "[4] Sair do programa");
            opcao = sc.nextInt();
            
            if(opcao == 1){
                System.out.println("Digite o valor que deseja sacar: ");
                novoValor = sc.nextFloat();
                contaCorrente.sacar(novoValor);
            }

            if(opcao == 2){
                System.out.println("Digite o valor que deseja acrescentar: ");
                novoValor = sc.nextFloat();
                contaCorrente.depositar(novoValor);
            }

            if(opcao == 3){
                contaCorrente.consultarSaldo();
            }
        }

        System.out.println("Sistema fechado!");
        sc.close();
    }
}
