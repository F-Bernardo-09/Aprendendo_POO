package com.aprendizado.lista02.questao01;

public class SistemaEscolar {
    
    public class Estudante {
        private String nome;
        private double[] boletim;
        private double[] pesos;
        
        public Estudante(String nome, double[] boletim, double[] pesos) {
            this.nome = nome;
            this.boletim = boletim;
            this.pesos = pesos;
        }
        
        public String getNome() {
            return nome;
        }
        
        public double[] getBoletim() {
            return boletim;
        }
        
        public double[] getPesos() {
            return pesos;
        }
    }
    
    public double MediaPonderada(double[] notas, int quantProvas, double[] pesos) {
        double somaNotas = 0;
        double somaPesos = 0;
        
        for(int i = 0; i < quantProvas; i++) {
            somaNotas += (notas[i] * pesos[i]);
            somaPesos += pesos[i];
        }
        
        return somaNotas / somaPesos;
    }
    
    public String ResulFinal(double nota) {
        if(nota >= 7) return "Aprovado!";
        return "Reprovado!";
    }
}
