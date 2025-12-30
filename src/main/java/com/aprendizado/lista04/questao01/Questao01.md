# Resumo: Herança em Java

## 📝 Questão 1: Construtores são herdados?

### ✅ VERDADEIRO - Construtores NÃO são herdados

**Em português claro:**
Quando você cria uma classe filha, ela NÃO recebe os construtores da classe pai. Você precisa criar construtores novos na classe filha.

**Exemplo simples:**

```java
// Classe pai
class Animal {
    public Animal(String nome) {
        // construtor do Animal
    }
}

// Classe filha
class Cachorro extends Animal {
    // Cachorro NÃO herdou o construtor de Animal!
    // Preciso criar um novo construtor aqui
    public Cachorro(String nome) {
        super(nome);  // Chamo o construtor do pai
    }
}
```

**Resumindo:** Cada classe precisa ter seus próprios construtores, mesmo sendo filha de outra classe.

---

## 📝 Questão 2: "TEM UM" usa herança?

### ❌ FALSO - "TEM UM" usa COMPOSIÇÃO, não herança

**Em português claro:**
Existem dois tipos de relacionamento entre classes:

### 🔵 **"É UM"** → Usa HERANÇA (`extends`)

Quando algo **É** outra coisa:

```java
class Cachorro extends Animal {
    // Cachorro É UM Animal ✅
}
```

### 🟢 **"TEM UM"** → Usa COMPOSIÇÃO (atributo)

Quando algo **TEM** outra coisa dentro:

```java
class Carro {
    private Motor motor;  // Carro TEM UM Motor ✅
    private Roda[] rodas; // Carro TEM Rodas ✅
}
```

**Macete:**

- Cachorro **É** um animal? SIM → Herança
- Carro **É** um motor? NÃO! Carro **TEM** um motor → Composição

**Resumindo:** "TEM UM" = colocar um objeto dentro de outro como atributo. NÃO é herança!

---

## 📝 Questão 3: Mesma assinatura é sobrecarga?

### ❌ FALSO - Mesma assinatura é SOBRESCRITA, não sobrecarga

**Em português claro:**
Existem dois conceitos parecidos mas DIFERENTES:

### 🔴 **SOBRESCRITA (Override)** = Mesma assinatura

Reescrever um método do pai **exatamente igual**:

```java
class Animal {
    public void fazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override  // SOBRESCRITA - mesmo nome, mesmos parâmetros
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
```

### 🔵 **SOBRECARGA (Overload)** = Assinaturas diferentes

Criar várias versões do **mesmo método** com parâmetros diferentes:

```java
class Calculadora {
    // SOBRECARGA - mesmo nome, parâmetros DIFERENTES

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}
```

**Macete:**

- **Override** = Reescrever o método do pai (mesma coisa, novo comportamento)
- **Overload** = Várias versões do método (mesmo nome, parâmetros diferentes)

**Resumindo:** Se tem a MESMA assinatura (nome e parâmetros iguais), é SOBRESCRITA!

---

## 🎯 Tabela Resumo

| Pergunta                       | Resposta | Conceito Certo                    |
| ------------------------------ | -------- | --------------------------------- |
| Construtores são herdados?     | ❌ NÃO   | Cada classe faz seus construtores |
| "TEM UM" usa herança?          | ❌ NÃO   | "TEM UM" = Composição (atributo)  |
| Mesma assinatura = sobrecarga? | ❌ NÃO   | Mesma assinatura = Sobrescrita    |

---

## 💡 Dicas Rápidas

### Herança vs Composição

```java
// HERANÇA - "É UM"
class Gato extends Animal { }

// COMPOSIÇÃO - "TEM UM"
class Casa {
    private Porta porta;
    private Janela janela;
}
```

### Override vs Overload

```java
// OVERRIDE - Reescreve método do pai
@Override
public void metodo() { }

// OVERLOAD - Várias versões
public void metodo(int x) { }
public void metodo(String x) { }
public void metodo(int x, int y) { }
```

---

## 🎓 Para Decorar

**Construtores:**

- ❌ NÃO passam de pai para filho
- ✅ Cada classe cria os seus

**Relacionamentos:**

- **"É UM"** → `extends` (herança)
- **"TEM UM"** → atributo (composição)

**Métodos:**

- **Override** → Mesmo nome, mesmos parâmetros (reescrever)
- **Overload** → Mesmo nome, parâmetros diferentes (sobrecarregar)
