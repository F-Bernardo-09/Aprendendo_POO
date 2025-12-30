/*
 * Questão 04: Crie uma classe abstrata Pagamento com o método processar(double valor).
 * Implemente CartaoCredito, Boleto e Pix com regras diferentes (ex: taxa, desconto).
 * No main, use polimorfismo para processar pagamentos com diferentes formas.
 */

package com.aprendizado.lista04.questao04;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        double valor = 1000;
        int parcelas = 10;
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        Pagamento pg = null;

        System.out.println(
            "Olá, usuario!\n"+
            "Formas de Pagamento:\n" +
            "\n[1] Cartão de Crédito\n" +
            "[2] Boleto\n" +
            "[3] Pix");

        System.out.println("Como você quer pagar por esse produto: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                pg = new CartaoCredito(valor, parcelas);
                break;

            case 2:
                pg = new Boleto(valor, parcelas);
                break;

            case 3:
                pg = new Pix(valor);
                break;
        
            default:
                break;
        }

        pg.processar();
        pg.apresentarDados();
        sc.close();
    }
}