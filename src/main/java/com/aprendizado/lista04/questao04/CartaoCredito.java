package com.aprendizado.lista04.questao04;

class CartaoCredito extends Pagamento {
    private static final double TAXA = 0.1;
    private double convertTaxa;
    private double valorParcela;
    private double valorFinal;

    public CartaoCredito(double valor, int parcelas){
        super(valor);
        this.parcelas = parcelas;
    }
    
    @Override
    void processar(){
        valorFinal = valor + (valor*TAXA);
        valorParcela = valorFinal / parcelas;
        convertTaxa = TAXA * 100;  
    }

    @Override
    void apresentarDados() {
        System.out.println("=== CARTÃO DE CRÉDITO ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa (porcentagem): %.2f%n", convertTaxa);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        System.out.printf("Parcelado em %dx de R$ %.2f%n", parcelas, valorParcela);  
    }
}