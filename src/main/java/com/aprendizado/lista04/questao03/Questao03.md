# Construtores em Herança - RESUMO

## 🏗️ Como Funciona?

**Quando você cria um objeto filho, os construtores são chamados em ORDEM:**

```
Pai → Filho → Neto
```

### Exemplo:

```java
class Animal {
    public Animal() {
        System.out.println("1. Animal criado");
    }
}

class Cachorro extends Animal {
    public Cachorro() {
        // super(); ← Java chama automaticamente
        System.out.println("2. Cachorro criado");
    }
}

// new Cachorro() imprime:
// 1. Animal criado
// 2. Cachorro criado
```

---

## 🤔 Por Que É Obrigatório Chamar o Construtor do Pai?

### **3 Motivos:**

**1. Inicializar atributos herdados**

```java
class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;  // Precisa inicializar!
    }
}

class Aluno extends Pessoa {
    public Aluno(String nome) {
        super(nome);  // ✅ Inicializa o nome
    }
}
```

**2. Executar validações do pai**

```java
class Conta {
    public Conta(double saldo) {
        if (saldo < 0) throw new Exception("Inválido!");
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);  // ✅ Executa a validação
    }
}
```

**3. Garantir que o objeto nasça completo**

- Sem chamar o pai, o objeto fica "pela metade"
- Atributos privados do pai ficam sem valor

---

## 🔄 Chamada Implícita vs Explícita

### **Implícita (automática):**

```java
class Pai {
    public Pai() { }  // Sem parâmetros
}

class Filho extends Pai {
    public Filho() {
        // Java chama super() automaticamente ✅
    }
}
```

### **Explícita (obrigatória):**

```java
class Pai {
    public Pai(String msg) { }  // COM parâmetros
}

class Filho extends Pai {
    public Filho() {
        super("mensagem");  // ✅ OBRIGATÓRIO!
    }
}
```

---

## ⚠️ Regras Importantes

1. **`super()` deve ser a PRIMEIRA linha** do construtor
2. **Só pode chamar `super()` UMA vez**
3. **Construtores executam de cima para baixo** (Avô → Pai → Filho)

---

## ❌ Erros Comuns

```java
// ❌ ERRO: super() não é a primeira linha
public Filho() {
    int x = 10;
    super();  // Erro!
}

// ❌ ERRO: Pai não tem construtor sem parâmetros
class Pai {
    public Pai(String x) { }
}
class Filho extends Pai {
    public Filho() {
        // Falta super(...)
    }
}
```

---

## 📊 Exemplo Completo

```java
class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
        System.out.println("Funcionário: " + nome);
    }
}

class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, String setor) {
        super(nome);  // 1º: inicializa Funcionario
        this.setor = setor;  // 2º: inicializa Gerente
        System.out.println("Setor: " + setor);
    }
}

// new Gerente("João", "TI") imprime:
// Funcionário: João
// Setor: TI
```

---

## 🎯 Resumão Final

**Por que é obrigatório?**

- ✅ Inicializa atributos do pai
- ✅ Executa validações do pai
- ✅ Garante objeto completo e válido

**Analogia:**

> Não dá pra construir o 2º andar sem antes construir o 1º! 🏠

**Regra de ouro:**

> `super()` sempre PRIMEIRO, inicializa o pai ANTES do filho!
