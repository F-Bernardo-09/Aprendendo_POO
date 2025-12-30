package com.aprendizado.lista07.questao04;

class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() { 
        return email; 
    }

    public String getNome() { 
        return nome; 
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | E-mail: " + email;
    }
}
