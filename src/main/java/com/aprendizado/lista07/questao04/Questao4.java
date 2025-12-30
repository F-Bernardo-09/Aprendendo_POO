package com.aprendizado.lista07.questao04;

public class Questao4 {
    public static void main(String[] args) {
        SistemaUsuarios sistema = new SistemaUsuarios();

        sistema.inserir(new Usuario("Ana", "ana@gmail.com", "senha123"));
        sistema.inserir(new Usuario("Carlos", "carlos@gmail.com", "abc123"));

        sistema.inserir(new Usuario("Ana Silva", "ana@gmail.com", "123456"));

        sistema.listar();

        sistema.remover("carlos@gmail.com");
        sistema.listar();
    }
}
