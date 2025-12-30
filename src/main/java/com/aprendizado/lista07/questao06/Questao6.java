package com.aprendizado.lista07.questao06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Questao6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(15, -3, 42, -10, 0, 8, -1);
        
        List<Integer> positivos = numeros.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        
        System.out.println("1. Números Positivos: " + positivos);


        List<String> frutas = Arrays.asList("Pera", "Maçã", "Pitaya", "Uva", "Pêssego");
        
        System.out.print("2. Frutas com P: ");
        frutas.stream()
                .filter(f -> f.startsWith("P"))
                .forEach(f -> System.out.print(f + " ")); 

        System.out.println(); 

        String texto = "estudar java é bom estudar faz bem java é vida";
        
        Set<String> palavrasUnicas = Arrays.stream(texto.split(" "))
                .collect(Collectors.toSet());

        System.out.println("3. Palavras únicas: " + palavrasUnicas);
    }
}
