package com.aprendizado.lista04.questao04;

class Pix extends Pagamento {
    private static final double TAXA = 0;
    private double valorFinal;
    private double convertTaxa;

    public Pix(double valor){
        super(valor);
    }

    @Override
    void processar() {
        valorFinal = valor - (valor*TAXA);
        convertTaxa = TAXA * 100;
    }

    @Override
    void apresentarDados(){
        System.out.println("=== PIX ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa de: %.2f%n", convertTaxa);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
    }   
}