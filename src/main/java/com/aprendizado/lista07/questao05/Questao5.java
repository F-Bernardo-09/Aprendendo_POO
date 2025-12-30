package com.aprendizado.lista07.questao05;

public class Questao5 {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.navegarPara("google.com");
        navegador.navegarPara("github.com/perfil");
        navegador.navegarPara("github.com/projeto-poo");

        navegador.exibirPaginaAtual();

        System.out.println("\n--- Clicando em VOLTAR ---");
        navegador.voltar();

        System.out.println("\n--- Clicando em VOLTAR ---");
        navegador.voltar();
    }
}
