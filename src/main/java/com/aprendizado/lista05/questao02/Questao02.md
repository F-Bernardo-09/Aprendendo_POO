# Resumo: Desacoplamento com Interfaces

## 📝 Questão 1: O que é um sistema "acoplado"?

### ❌ RUIM - Acoplamento Forte (Depender de Classes Concretas)

Acontece quando uma classe conhece detalhes demais de outra. Se você mudar a classe "A", a classe "B" para de funcionar. O código fica "engessado".

**Exemplo do problema:**
Imagine um sistema que só envia avisos por SMS. Se amanhã o cliente quiser E-mail, você terá que abrir a classe principal e reescrever tudo.

---

## 📝 Questão 2: Como a Interface "Desaclopa"?

### ✅ BOM - Acoplamento Fraco (Depender de Contratos)

A classe principal não sabe **quem** faz o trabalho, ela só sabe **o que** é feito. Ela depende de uma Interface, não de uma classe específica.

**Exemplo prático: Sistema de Logística**

Imagine que você está criando um sistema de entregas para um E-commerce.

### 🔴 **Sem Interface (Errado):**

Você cria a classe `Pedido` amarrada à classe `Correios`.

```java
class Pedido {
    private Correios correios; // ERRO: Se mudar para Transportadora, quebra tudo!
}

```

### 🔵 **Com Interface (Correto):**

Você cria a interface `Frete` e o Pedido aceita qualquer coisa que siga essa regra.

```java
interface Frete {
    double calcular(double peso);
}

class Pedido {
    private Frete servicoEntrega; // ACEITA: Correios, Jadlog, Uber, etc.

    public Pedido(Frete servico) {
        this.servicoEntrega = servico;
    }
}

```

---

## 📝 Questão 3: Por que é melhor para a manutenção?

### 🚀 Facilidade de Evolução

Se você precisar adicionar uma nova forma de envio, você **não mexe** na classe `Pedido`. Você apenas cria uma classe nova que implementa a interface.

**Cenário Real:**

1. **Segunda-feira:** O sistema usa `Sedex`.
2. **Terça-feira:** O chefe pede para usar `Loggi`.
3. **Ação:** Você cria a classe `Loggi implements Frete` e "injeta" ela no sistema. O código antigo do `Pedido` continua intacto e funcionando.

---

## 🎯 Tabela Resumo: Classe Concreta vs Interface

| Situação                 | Usando Classe Concreta                            | Usando Interface                              |
| ------------------------ | ------------------------------------------------- | --------------------------------------------- |
| **Mudança de Requisito** | Precisa alterar código existente (Risco de bugs). | Cria código novo (Segurança).                 |
| **Testes de Software**   | Difícil de testar (precisa da classe real).       | Fácil (pode usar um "Mock" ou objeto falso).  |
| **Flexibilidade**        | Baixa: está preso a um único fornecedor.          | Alta: aceita qualquer um que siga o contrato. |

---

## 💡 Dica de Ouro: "Programe para Interfaces"

Sempre que você for criar um atributo em uma classe, pergunte-se: _"Eu realmente preciso que isso seja exatamente um `ArrayList` ou pode ser apenas uma `List`?"_.

- **Ruim:** `ArrayList<String> nomes = new ArrayList<>();` (Amarrado à implementação)
- **Bom:** `List<String> nomes = new ArrayList<>();` (Se amanhã você mudar para `LinkedList`, o resto do código não sofre).

---

## 🎓 Para Decorar

**Desacoplamento:**

- ❌ **Classes Concretas:** Criam dependências rígidas (Cimento).
- ✅ **Interfaces:** Criam conexões flexíveis (Tomadas).

**Manutenção:**

- O segredo é o código ser **Aberto para Extensão** (aceitar coisas novas) e **Fechado para Modificação** (não precisar mexer no que já funciona).
