# Diferenças entre List, Set e Map (Java Collections)

Na Programação Orientada a Objetos, escolher a interface correta é aplicar o conceito de **especialização**. Cada uma dessas interfaces dita como os objetos serão armazenados e recuperados.

---

## 1. Interface `List` (A Sequência)

A `List` funciona como uma lista de compras ou uma fila. O que importa aqui é a **posição**.

- **Comportamento:**
  - Mantém a **ordem de inserção**.
  - Permite elementos **duplicados**.
  - Cada elemento tem um índice (0, 1, 2...).
  
- **Quando utilizar:** Quando a ordem dos dados é importante e você precisa acessar itens por sua posição.

- **Exemplo Prático:** Uma lista de reprodução de músicas (Playlist) ou o histórico de navegação de um usuário.

```java
// Exemplo: Lista de nomes aceitando duplicatas e mantendo a ordem
List<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Maria");
nomes.add("João"); // Aceita repetido

System.out.println(nomes.get(0)); // Acesso pelo índice: "João"
```

---

## 2. Interface `Set` (O Conjunto)

O `Set` funciona como um conjunto matemático. O que importa aqui é a **unicidade**.

- **Comportamento:**
  - **Não permite elementos repetidos**.
  - Geralmente **não garante a ordem** (com exceção de classes como `TreeSet`).
  - Não possui índices.

- **Quando utilizar:** Quando você quer evitar duplicatas e não se importa com a ordem dos elementos.

- **Exemplo Prático:** Armazenar os números de CPF de clientes em um sistema ou os IDs de usuários ativos em uma sala.

```java
// Exemplo: Conjunto que impede nomes iguais
Set<String> convidados = new HashSet<>();
convidados.add("Ana");
convidados.add("Ana"); // Será ignorado pelo Java
convidados.add("Beto");

System.out.println(convidados.size()); // Resultado: 2
```

---

## 3. Interface `Map` (O Dicionário)

O `Map` é diferente das outras porque não herda de `Collection`. Ele trabalha com o conceito de **Chave e Valor**.

- **Comportamento:**
  - Mapeia uma **Chave única** para um **Valor**.
  - Você não busca pelo índice, mas pela chave.
  - Se você adicionar uma chave que já existe, o valor antigo é substituído.

- **Quando utilizar:** Quando você precisa associar um identificador (chave) a uma informação (valor).

- **Exemplo Prático:** Um sistema de estoque (Código de barras -> Produto) ou um dicionário de tradução (Palavra em Inglês -> Palavra em Português).

```java
// Exemplo: Mapa associando CPF (Chave) ao Nome (Valor)
Map<String, String> usuarios = new HashMap<>();
usuarios.put("123.456-00", "Carlos Silva");
usuarios.put("987.654-11", "Mariana Souza");

// Buscando o valor através da chave
System.out.println(usuarios.get("123.456-00")); // Retorna "Carlos Silva"
```

---

## Resumo Comparativo Rapidão ⚡

| Interface | Aceita Repetidos? | Mantém Ordem? | Como você acessa?              |
| --------- | ----------------- | ------------- | ------------------------------ |
| **List**  | Sim               | Sim           | Pelo índice (0, 1, 2...)       |
| **Set**   | Não               | Não           | Verificando se o objeto existe |
| **Map**   | Não (chaves)      | Não           | Através da Chave               |

---

### Qual a importância disso na POO?

Essas interfaces permitem o uso do **Polimorfismo**. Você pode declarar sua variável como a interface e instanciar a implementação que melhor se adapta à sua necessidade de performance:

`List<String> minhaLista = new ArrayList<>();`

Se amanhã você precisar de uma lista mais rápida para inserções no meio, basta mudar para `new LinkedList<>()` e o resto do seu código continua funcionando perfeitamente!
