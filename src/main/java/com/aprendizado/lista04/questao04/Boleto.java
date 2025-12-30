package com.aprendizado.lista04.questao04;

class Boleto extends Pagamento {
    private static final double TAXA = 0.2;
    private double valorFinal;
    private double convertTaxa;

    public Boleto(double valor, int parcelas){
        super(valor);
    }

    @Override
    void processar(){
        valorFinal = valor - (valor*TAXA);
        convertTaxa = TAXA * 100;
    }

    @Override
    void apresentarDados(){
        System.out.println("=== BOLETO ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa (porcentagem): %.2f%n", convertTaxa);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
    }
}