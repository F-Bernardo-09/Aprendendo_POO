package com.aprendizado.lista07.questao06;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

class PalavrasUnica {

    public List<Integer> filtrarPositivos(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<String> filtrarPorLetra(List<String> lista, String letra) {
        return lista.stream()
                .filter(s -> s.startsWith(letra))
                .collect(Collectors.toList());
    }

    public Set<String> extrairPalavrasUnicas(String paragrafo) {
        if (paragrafo == null || paragrafo.isEmpty()) {
            return Set.of();
        }

        return Arrays.stream(paragrafo.split(" "))
                .map(String::toLowerCase) 
                .collect(Collectors.toSet());
    }
}
