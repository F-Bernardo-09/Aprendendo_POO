package com.aprendizado.lista06.questao01;

class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } 
        
        else {
            System.out.println("Erro: Turma lotada!");
        }
    }

    public void listarAprovados() {
        System.out.println("\n--- Alunos Aprovados ---");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].resultadoAprovacao()) {
                System.out.println(alunos[i].getNome() + " - Média: " + alunos[i].calcularMedia());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("\n--- Alunos Reprovados ---");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (!alunos[i].resultadoAprovacao()) {
                System.out.println(alunos[i].getNome() + " - Média: " + alunos[i].calcularMedia());
            }
        }
    }
}
