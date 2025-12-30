package com.aprendizado.lista03.questaoextra;

public class Produto {
    private int codProd;
    private String nomeProd;
    private float precoProd;
    private int estoqueProd;

    public Produto(int codProd, String nomeProd, float precoProd, int estoqueProd){
        this.codProd = codProd;
        this.setNome(nomeProd);
        this.setPreco(precoProd);
        this.estoqueProd = estoqueProd;
    }

    // GETTERS
    public int getCod(){
        return this.codProd;
    }

    public String getNome(){
        return this.nomeProd;
    }

    public double getPreco(){
        return this.precoProd;
    }

    public int getEstoque(){
        return this.estoqueProd;
    }

    public double getValorTotal(){
        return estoqueProd * precoProd;
    }

    // SETTERS
    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome invalido aos padrões.\nTente novamente!");    
            return;
        }
        this.nomeProd = nome;
    }

    public void setPreco(float novoPreco){
        if(novoPreco < 0){
            System.out.println("Preço inválido.\nTente novamente!");
            return;
        }
        this.precoProd = novoPreco;
    }

    public void adicionarEstoque(int addEstoque){
        if(addEstoque <= 0){
            System.out.println("Valor incoerente ou nulo.\nTente novamente!");
            return;
        }
        this.estoqueProd += addEstoque;
        System.out.println("Estoque adicionado com sucesso!\n");
        return;
    }

    public void diminuirEstoque(int subEstoque){
        if(subEstoque > estoqueProd || subEstoque < 0){
            System.out.println("Valor ultrapassa o estoque ou inferior a ele.\nTente novamente!");
            return;
        }
        System.out.println("Valor retirado do estoque!");
        this.estoqueProd -= subEstoque;
    }

    public void exibirInfo(){
        System.out.printf(
                        "\n=== INFORMAÇÕES DO PRODUTO ==="+
                        "\nCódigo: "+ getCod() +
                        "\nNome: "+ getNome() +
                        "\nPreço: R$ "+ getPreco() +
                        "\nQuantidade em Estoque: "+ getEstoque() +
                        "\nValor Total em Estoque: R$ "+ getValorTotal());
    }
}
