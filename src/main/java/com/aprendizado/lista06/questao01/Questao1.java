package com.aprendizado.lista06.questao01;

public class Questao1 {
    public static void main(String[] args) {
        // Criando os alunos
        Aluno a1 = new Aluno("João", 2023001, 4);
        a1.adicionarNota(8.5); 
        a1.adicionarNota(7.0); 
        a1.adicionarNota(6.5); 
        a1.adicionarNota(9.0);

        Aluno a2 = new Aluno("Maria", 2023002, 4);
        a2.adicionarNota(5.0); 
        a2.adicionarNota(6.0); 
        a2.adicionarNota(4.5); 
        a2.adicionarNota(7.0);

        Aluno a3 = new Aluno("José", 2023003, 4);
        a3.adicionarNota(10.0); 
        a3.adicionarNota(9.5); 
        a3.adicionarNota(8.0); 
        a3.adicionarNota(9.0);

        // Criando a turma e adicionando os alunos
        Turma minhaTurma = new Turma(10); // Capacidade para 10 alunos
        minhaTurma.adicionarAluno(a1);
        minhaTurma.adicionarAluno(a2);
        minhaTurma.adicionarAluno(a3);

        // Executando as listagens
        minhaTurma.listarAprovados();
        minhaTurma.listarReprovados();
    }
}
