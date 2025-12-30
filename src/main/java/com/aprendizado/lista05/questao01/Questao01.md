# Resumo: Interfaces Modernas (Java 8+)

## 📝 Questão 1: Interfaces podem ter métodos com corpo?

### ✅ VERDADEIRO - A partir do Java 8 é possível

Antigamente, interfaces só podiam ter métodos "vazios" (sem chaves `{}`). A partir do Java 8, você pode criar métodos com lógica dentro da interface usando as palavras-chave `default` ou `static`.

---

## 📝 Questão 2: O que é um método `default`?

### 🔵 **MÉTODO DEFAULT** → Herança de comportamento

É um método que já vem com uma implementação padrão. Se a classe que usa a interface não quiser escrever o método, ela usa o que já está pronto na interface.

**Utilidade:** Permite adicionar funções novas em interfaces que já existem sem "quebrar" o código de quem já as usava.

**Exemplo simples:**

```java
interface Pagamento {
    void processar(); // Obrigatório implementar

    // Opcional: as classes filhas já ganham isso pronto
    default void emitirRecibo() {
        System.out.println("Gerando recibo padrão...");
    }
}

class Pix implements Pagamento {
    public void processar() {
        System.out.println("Pagando via Pix...");
    }
    // NÃO precisei criar o emitirRecibo(), ele já veio de graça!
}

```

---

## 📝 Questão 3: O que é um método `static` em Interface?

### 🟢 **MÉTODO STATIC** → Método utilitário

É um método que pertence à **Interface** e não ao objeto. Você não precisa criar um `new` para usar ele. Ele serve como uma ferramenta de ajuda.

**Exemplo simples:**

```java
interface Validador {
    // Método de ajuda que não depende de nenhum dado da classe
    static boolean isCpfValido(String cpf) {
        return cpf != null && cpf.length() == 11;
    }
}

// Para usar, você chama direto pelo nome da Interface:
boolean valido = Validador.isCpfValido("12345678901");

```

---

## 🎯 Tabela Resumo

| Recurso             | Palavra-chave | Precisa de Objeto? | Pode ser Sobrescrito? | Objetivo Principal            |
| ------------------- | ------------- | ------------------ | --------------------- | ----------------------------- |
| **Método Abstrato** | (nenhuma)     | Sim                | ✅ Sim (Obrigatório)  | Definir um contrato           |
| **Método Default**  | `default`     | Sim                | ✅ Sim (Opcional)     | Evoluir a interface sem erros |
| **Método Estático** | `static`      | Não                | ❌ Não                | Criar funções utilitárias     |

---

## 💡 Dicas Rápidas

### Quando usar Default?

Use quando você quer que **todas** as classes que implementam aquela interface ganhem uma funcionalidade nova automaticamente, mas permitindo que elas mudem se precisarem.

### Quando usar Static?

Use quando a função é apenas uma "ferramenta" que não precisa acessar dados do objeto (como validações, cálculos simples ou conversões).

### E o Private? (Java 9+)

O Java 9 permitiu métodos `private` dentro de interfaces. Eles servem apenas para organizar o código interno da interface, escondendo lógicas repetidas de métodos `default`.

---

## 🎓 Para Decorar

**Métodos Default:**

- ✅ Têm corpo `{ }`
- ✅ São herdados pelas classes
- 💡 Ótimos para evitar código repetido em interfaces

**Métodos Static:**

- ✅ Têm corpo `{ }`
- ❌ NÃO são herdados (chama pela Interface)
- 💡 Ótimos para funções de ajuda (Helper methods)
