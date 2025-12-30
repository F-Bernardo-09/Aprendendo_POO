package com.aprendizado.lista07.questao06;

import java.util.Arrays;
import java.util.List;

public class FiltroString {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Pão", "Leite", "Peixe", "Arroz", "Pimenta");

        System.out.println("Palavras que começam com P:");
        palavras.stream()
                .filter(p -> p.startsWith("P"))
                .forEach(System.out::println); 
    }
}
