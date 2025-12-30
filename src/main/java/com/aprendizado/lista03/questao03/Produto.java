package com.aprendizado.lista03.questao03;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    // Construtor
    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Get é usado para puxar informações de forma segura
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    // Set é usado para modificar informações de forma segura
    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Preço não pode ser negativo.\nTente Novamente!");
            return;
        }
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("O código do produto: " + getCodigo());
        System.out.println("Nome do produto: " + getNome());
        System.out.printf("Preço do produto: R$ %.2f\n", getPreco());
        System.out.println("Quantidade disponível em estoque: " + getEstoque());        
    }
}
