package com.aprendizado.lista05.questao05;

class RelatorioFinanceiro implements EnviavelPorEmail, Imprimivel {
    
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Relatorio...");
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando email para: " + email);
    }
}
