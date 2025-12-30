# Por que usar Getters e Setters em Java?

## O que são Getters e Setters?

Getters e setters são métodos que permitem **acessar** e **modificar** os atributos de uma classe de forma controlada. Em vez de deixar os atributos públicos, deixamos eles privados e criamos métodos para trabalhar com eles.

## Por que usar?

### 1. **Proteger os dados**
Você controla o que entra e sai da sua classe.

### 2. **Validar valores**
Pode verificar se o valor é válido antes de guardar no atributo.

### 3. **Facilitar mudanças**
Se precisar mudar algo internamente, não quebra o código de quem usa sua classe.

## Exemplo Simples: Classe Pessoa

### ❌ **Jeito Errado (atributos públicos)**

```java
public class PessoaRuim {
    public String nome;
    public int idade;
}

// Usando a classe:
public class Teste {
    public static void main(String[] args) {
        PessoaRuim pessoa = new PessoaRuim();
        
        // Problemas: aceita valores inválidos!
        pessoa.nome = "";           // ❌ Nome vazio
        pessoa.idade = -5;          // ❌ Idade negativa
        pessoa.idade = 200;         // ❌ Idade impossível
        
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
    }
}
```

**Problema:** Qualquer código pode colocar valores absurdos nos atributos!

### ✅ **Jeito Certo (com getters e setters)**

```java
public class Pessoa {
    // Atributos PRIVADOS (ninguém acessa diretamente)
    private String nome;
    private int idade;
    
    // Construtor
    public Pessoa(String nome, int idade) {
        this.setNome(nome);    // Usa o setter para validar
        this.setIdade(idade);  // Usa o setter para validar
    }
    
    // GETTER: para pegar o valor do nome
    public String getNome() {
        return this.nome;
    }
    
    // SETTER: para mudar o nome (com validação!)
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio!");
            return;
        }
        this.nome = nome;
    }
    
    // GETTER: para pegar o valor da idade
    public int getIdade() {
        return this.idade;
    }
    
    // SETTER: para mudar a idade (com validação!)
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Erro: Idade não pode ser negativa!");
            return;
        }
        if (idade > 150) {
            System.out.println("Erro: Idade muito alta!");
            return;
        }
        this.idade = idade;
    }
    
    // Método para mostrar informações
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
    }
}
```

### Usando a Classe com Validação

```java
public class Teste {
    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("João Silva", 25);
        pessoa.mostrarInfo();
        
        System.out.println("\n--- Tentando valores inválidos ---");
        
        // ✅ Setters impedem valores inválidos
        pessoa.setNome("");        // Mostra erro
        pessoa.setIdade(-5);       // Mostra erro
        pessoa.setIdade(200);      // Mostra erro
        
        System.out.println("\n--- Depois das tentativas ---");
        pessoa.mostrarInfo();      // Valores continuam corretos!
        
        System.out.println("\n--- Mudando para valores válidos ---");
        pessoa.setNome("Maria Santos");
        pessoa.setIdade(30);
        pessoa.mostrarInfo();      // Agora mudou!
    }
}
```

### Saída do Programa

```
Nome: João Silva
Idade: 25 anos

--- Tentando valores inválidos ---
Erro: Nome não pode ser vazio!
Erro: Idade não pode ser negativa!
Erro: Idade muito alta!

--- Depois das tentativas ---
Nome: João Silva
Idade: 25 anos

--- Mudando para valores válidos ---
Nome: Maria Santos
Idade: 30 anos
```

## Comparação Visual

| Sem Getters/Setters | Com Getters/Setters |
|---------------------|---------------------|
| `pessoa.idade = -5;` ✅ Aceita | `pessoa.setIdade(-5);` ❌ Bloqueia |
| `pessoa.nome = "";` ✅ Aceita | `pessoa.setNome("");` ❌ Bloqueia |
| Qualquer valor passa | Só valores válidos |

## Resumo

**Getters e Setters protegem sua classe!**

- **Getter** (get): pega o valor do atributo
- **Setter** (set): muda o valor do atributo (com validação)
- **Atributos privados**: ninguém mexe diretamente neles

Assim você garante que os objetos sempre terão valores válidos e seu programa não quebra por causa de dados errados!