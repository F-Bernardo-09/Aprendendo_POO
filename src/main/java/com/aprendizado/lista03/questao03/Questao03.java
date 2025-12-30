/*
 * Questão 03: Implemente uma classe Produto com os seguintes atributos privados:
 * codigo (int), nome (String), preco (double), estoque (int)
 * 
 * Inclua:
 * 1. Um construtor que receba os quatro parâmetros
 * 2. Getters para todos os atributos
 * 3. Um setter apenas para o preço, que não deve aceitar valores negativos
 * 4. Um método exibirInfo() que imprime todas as informações do produto
 */

package com.aprendizado.lista03.questao03;

public class Questao03 {
    public static void main(String[] args) {
        int codProd = 123456;
        String nomeProd = "Arroz";
        double precoProd = 70.00;
        int quantEstoque = 10;

        Produto produto = new Produto(codProd, nomeProd, precoProd, quantEstoque);
        produto.exibirInfo();

        double novoPreco = 90;
        produto.setPreco(novoPreco);

        produto.exibirInfo();
    }
}
