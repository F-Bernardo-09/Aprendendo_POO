package com.aprendizado.lista02.questao02;

public class VerificarMultiplo {
    private int num1;
    private int num2;
    private int num3;

    public VerificarMultiplo(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String verificar() {
        if(num3 % num1 == 0 && num3 % num2 == 0) return String.format("Múltiplo de ambos: %d e %d.", num1, num2);
        if(num3 % num1 == 0) return String.format("Múltiplo de: %d", num1);
        if(num3 % num2 == 0) return String.format("Múltiplo de: %d", num2);
        return String.format("Não é múltiplo de: %d e %d.", num1, num2);
    }
}
