package com.aprendizado.lista07.questao04;

import java.util.HashMap;
import java.util.Map;

public class SistemaUsuarios {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void inserir(Usuario u) {
        if (usuarios.containsKey(u.getEmail())) {
            System.out.println("Erro: O e-mail " + u.getEmail() + " já está cadastrado.");
        } 
        
        else {
            usuarios.put(u.getEmail(), u);
            System.out.println("Usuário " + u.getNome() + " inserido com sucesso!");
        }
    }

    public void listar() {
        if (usuarios.isEmpty()) {
            System.out.println("Sistema vazio.");
        } 
        
        else {
            System.out.println("\n--- Lista de Usuários ---");
            for (Usuario u : usuarios.values()) {
                System.out.println(u);
            }
        }
    }

    public void remover(String email) {
        if (usuarios.remove(email) != null) {
            System.out.println("Usuário com e-mail " + email + " removido.");
        } 
        
        else {
            System.out.println("Erro: Usuário não encontrado.");
        }
    }
}
