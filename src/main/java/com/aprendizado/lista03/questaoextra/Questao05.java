package com.aprendizado.lista03.questaoextra;

import java.util.Scanner;

/**
 * EXERCÍCIO: Sistema de Gerenciamento de Produto
 * 
 * 1. Criar classe Produto com atributos privados:
 *    - codigo (int), nome (String), preco (float), quantidadeEstoque (int)
 * 
 * 2. Construtor: recebe codigo e nome, inicializa preco e estoque com 0
 * 
 * 3. Implementar Getters com todos os métodos
 *    - Criar getters para todos os atributos da classe
 * 
 * 4. Implementar Setters com validação:
 *    - setNome(): não pode ser vazio ou nulo
 *    - setPreco(): deve ser > 0
 *    - setEstoque(): não pode valores negativos
 * 
 * 5. Métodos de negócio:
 *    - adicionarEstoque(): adiciona quantidade
 *    - removerEstoque(): remove quantidade (não pode tirar mais que a quantidade total)
 *    - calcularValorTotal(): retorna preço × quantidade
 *    - exibirInformacoes(): exibe dados formatados
 */
public class Questao05 {
    public static void main(String[] args) {
        int codigo, opcao = 0, estoque = 0;
        float precoProduto = 0;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CADASTRO DE PRODUTO ===");
        System.out.printf("Digite o código do produto: ");
        codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do produto: ");
        nome = sc.nextLine();

        System.out.printf("Quantas unidades: ");
        estoque = sc.nextInt();

        Produto prod = new Produto(codigo, nome, precoProduto, estoque);

        while (opcao != 7) {
            System.out.println();
            System.out.printf("=== MENU ===\n"+
                                "1. Alterar nome\n"+
                                "2. Definir/alterar preço\n"+
                                "3. Adicionar estoque\n"+
                                "4. Remover estoque\n"+
                                "5. Consultar valor total em estoque\n"+
                                "6. Exibir informações do produto\n"+
                                "7. Sair\n");
            System.out.printf("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Digite o novo nome: ");
                    nome = sc.nextLine();
                    prod.setNome(nome);
                    break;

                case 2:
                    System.out.print("Digite o novo preço: ");
                    precoProduto = sc.nextFloat();
                    prod.setPreco(precoProduto);
                    break;

                case 3:
                    System.out.print("Digite a quantidade a adicionar: ");
                    estoque = sc.nextInt();
                    prod.adicionarEstoque(estoque);
                    break;

                case 4:
                    System.out.print("Digite a quantidade a remover: ");
                    estoque = sc.nextInt();
                    prod.diminuirEstoque(estoque);
                    break;

                case 5:
                    System.out.printf("\nValor total em estoque: R$ %.2f\n", prod.getValorTotal());
                    break;

                case 6:
                    prod.exibirInfo();
                    break;

                case 7:
                    System.out.println("\nPrograma encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        }
        sc.close();
    }
}
