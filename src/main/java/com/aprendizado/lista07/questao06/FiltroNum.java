package com.aprendizado.lista07.questao06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroNum {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, -5, 20, -1, 0, 50);

        List<Integer> positivos = numeros.stream()
                                         .filter(n -> n >= 0)
                                         .collect(Collectors.toList());

        System.out.println("Apenas positivos: " + positivos);
    }
}
