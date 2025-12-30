package com.aprendizado.lista05.questao03;

class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void ligar() {
        System.out.println("[TELEFONE] - Ligando ...");
    }

    @Override
    public void atender() {
        System.out.println("[TELEFONE] - Chamada atendida.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("[INTERNET] - Carregando ...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("[INTERNET] - Nova aba adicionada.");
    }

    @Override
    public void tocar() {
        System.out.println("[MÚSICA] - Reproduzindo ...");
    }

    @Override
    public void pausar() {
        System.out.println("[MÚSICA] - Música pausada.");
    }
}
