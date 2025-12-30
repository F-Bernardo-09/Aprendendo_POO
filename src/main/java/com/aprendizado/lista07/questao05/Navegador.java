package com.aprendizado.lista07.questao05;

import java.util.Stack;

public class Navegador {
    private Stack<String> historico = new Stack<>();

    public void navegarPara(String tituloPagina) {
        historico.push(tituloPagina);
        System.out.println("Acessando: " + tituloPagina);
    }

    public void voltar() {
        if (historico.size() > 1) {
            String paginaSaindo = historico.pop();
            System.out.println("Saindo de: " + paginaSaindo);
            System.out.println("Retornou para: " + historico.peek()); 
        } 
        
        else if (historico.size() == 1) {
            System.out.println("Você está na página inicial (" + historico.peek() + "). Não tem como voltar.");
        } 
        
        else {
            System.out.println("Vazio.");
        }
    }

    public void exibirPaginaAtual() {
        if (!historico.isEmpty()) {
            System.out.println("Página atual: " + historico.peek());
        }
    }
}
