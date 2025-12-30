# Arrays em Java: Primitivos vs. Objetos

### a) Alocação de Memória

A grande diferença está no que o "espaço" do array realmente guarda.

#### 1. Array de Primitivos (`int[]`, `double[]`)

- **Armazenamento Direto:** O array reserva um bloco contínuo na memória e coloca os **valores reais** dentro de cada gaveta.
- **Exemplo:** Um `int[]` de 3 posições guarda os números 10, 20 e 30 diretamente.
- **Estado Inicial:** Assim que criado, o Java preenche tudo com o valor padrão (zero).

#### 2. Array de Objetos (`Aluno[]`, `String[]`)

- **Armazenamento de Referências (Endereços):** O array não guarda o objeto "Aluno" dentro dele. Ele guarda apenas o **endereço de memória** (um ponteiro) que aponta para onde o objeto Aluno realmente está.
- **Exemplo:** Um `Aluno[]` guarda "setas" que apontam para os objetos criados no _Heap_.
- **Estado Inicial:** Assim que criado, o array guarda apenas `null` (nada) em todas as posições.

---

### b) Cuidados Necessários com Arrays de Objetos

Trabalhar com arrays de objetos exige mais atenção do que com primitivos. Aqui estão os 2 principais cuidados:

#### 1. O Perigo do `NullPointerException`

Diferente dos números (que começam em 0), objetos começam como `null`.

- **Erro comum:** Criar o array e tentar usar um método sem instanciar o objeto.
- **Exemplo do erro:**

```java
Aluno[] turma = new Aluno[5];
turma[0].getNome(); // ERRO! A gaveta 0 existe, mas está vazia (null).

```

- **Solução:** Sempre use o `new` para cada posição do array:

```java
turma[0] = new Aluno("João");

```

#### 2. Instanciação Individual

Lembre-se: `new Aluno[5]` cria apenas o **estacionamento** com 5 vagas. Você ainda precisa criar os **carros** (objetos) um por um para colocar nas vagas.

---

### Tabela Comparativa

| Característica    | Array Primitivo (`int[]`)  | Array de Objetos (`Aluno[]`)  |
| ----------------- | -------------------------- | ----------------------------- |
| **O que guarda?** | O valor real (ex: 10, 5.5) | Um endereço (referência)      |
| **Valor inicial** | `0` ou `0.0`               | `null`                        |
| **Memória**       | Bloco único e direto       | Vários blocos espalhados      |
| **Risco de Erro** | Quase nenhum               | Alto (`NullPointerException`) |

---

**Dica de Ouro:** Sempre que for percorrer um array de objetos, é uma boa prática verificar se a posição não é nula:
`if (alunos[i] != null) { ... }`
