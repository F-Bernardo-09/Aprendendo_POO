package com.aprendizado.lista06.questao01;

class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;
    private int quantProvas = 0; 

    public Aluno(String nome, int matricula, int quantProvas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[quantProvas]; 
    }

    public String getNome(){
        return nome;
    }

    public void adicionarNota(double nota) {
        if (quantProvas < notas.length) {
            notas[quantProvas] = nota;
            quantProvas++;
            System.out.println("Nota " + nota + " cadastrada com sucesso para " + nome);
        } else {
            System.out.println("Erro: Limite de notas atingido!");
        }
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < quantProvas; i++) {
            soma += notas[i]; 
        }

        return soma / quantProvas;
    }

    public boolean resultadoAprovacao() {
        return calcularMedia() >= 7.0;
    }
}
