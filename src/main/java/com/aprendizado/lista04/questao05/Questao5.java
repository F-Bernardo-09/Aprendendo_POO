package com.aprendizado.lista04.questao05;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {
    public static void main(String[] args) {
        
        // Criando o grupo (Party) usando Polimorfismo
        List<Personagens> grupo = new ArrayList<>();
        
        grupo.add(new Guerreiro("Aragorn"));
        grupo.add(new Mago("Gandalf"));
        grupo.add(new Arqueiro("Legolas"));

        System.out.println("--- INÍCIO DO TURNO DE COMBATE ---");

        // O loop trata todo mundo apenas como "Personagem"
        for (Personagens p : grupo) {
            p.atacar();
        }

        System.out.println("--- FIM DO TURNO ---");
    }
}
