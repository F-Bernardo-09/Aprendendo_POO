# 📚 Aprendendo POO - Exercícios de Programação Orientada a Objetos

Repositório educacional com **65 exercícios práticos** de **Programação Orientada a Objetos (POO)** em Java, organizados em 7 listas de exercícios progressivas que cobrem desde fundamentos até conceitos avançados.

**GitHub:** https://github.com/F-Bernardo-09/Aprendendo_POO

## 📋 Estrutura do Projeto

```
src/main/java/com/aprendizado/
├── lista01/                    (13 questões - Fundamentos)
├── lista02/questao0[1-6]/      (6 questões - Classes e Métodos)
├── lista03/questao0[1-4]/ + extra/ (5 pastas - Encapsulamento)
├── lista04/questao0[1-5]/      (5 questões - Herança/Polimorfismo)
├── lista05/questao0[1-5]/      (5 questões - Interfaces)
├── lista06/questao0[1-4]/      (4 questões - Coleções)
└── lista07/questao0[1-6]/      (6 questões - Streams e Lambda)
```

## 🎯 Conteúdo das Listas

### Lista 01: Fundamentos (13 questões)

- Múltiplos de um número
- Cálculo de raízes (equação de 2º grau)
- Números perfeitos
- Cálculo de fatorial (recursão)
- Leitura de múltiplos números e operações
- Validação de senha com tentativas
- Soma de dígitos

### Lista 02: Classes e Métodos (6 questões)

**Questões 01-04:** Exercícios com código Java

- Média ponderada de aluno com aprovação/reprovação
- Sistema escolar com validações
- Verificação de múltiplos
- Gráfico de barras com asteriscos

**Questões 05-06:** Enunciados em .md (teórico/prático)

### Lista 03: Encapsulamento (5 questões)

**Questões 01-02:** Enunciados em .md (conceitual)

**Questões 03-04:** Exercícios com código Java

- Classe `Produto` com validações de preço
- Classe `ContaCorrente` com operações bancárias (saque/depósito)

**Questão Extra:** Complemento ao conteúdo

### Lista 04: Herança e Polimorfismo (5 questões)

**Questões 01-03:** Enunciados em .md (teórico)

**Questões 04-05:** Exercícios com código Java

- Sistema de pagamento com classes abstratas
- Implementações: `CartaoCredito`, `Boleto`, `Pix` com regras diferentes
- Personagens de RPG com herança e especialização

### Lista 05: Interfaces (5 questões)

**Questões 01-02:** Enunciados em .md (explicativo)

**Questões 03-05:** Exercícios com código Java

- Interface `AparelhoTelefonico`
- Interface `NavegadorInternet`
- Interface `ReprodutorMusical`
- Implementação em classe `Smartphone`
- Interfaces de contrato: `Imprimivel`, `EnviavelPorEmail`
- Operações matemáticas com interfaces

### Lista 06: Coleções (4 questões)

- Gerenciamento de turmas e alunos
- Sorteio da Mega Sena
- Sequência de Fibonacci com cache
- Questão 04: Enunciado em .md
- Uso de `ArrayList` e estruturas de dados

### Lista 07: Streams e Expressões Lambda (6 questões)

**Questões 01-03:** Enunciados em .md (conceitual/educativo)

- Java Collections Framework
- Diferenças entre List, Set e Map
- Comparativo de implementações (HashSet, LinkedHashSet, TreeSet)

**Questões 04-06:** Exercícios com código Java

- Sistema de usuários com filtros
- Navegador com histórico
- Filtros de números e strings
- Operações com `Stream`, `filter()`, `map()`, `collect()`

## 🚀 Como Usar

### Pré-requisitos

- **JDK 11 ou superior** instalado
- Terminal/Prompt de comando

### Instalação

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/Aprendendo_POO.git
cd Aprendendo_POO
```

### Compilação

Compile todos os arquivos Java de uma vez:

```bash
# Cria o diretório bin e compila
mkdir -p bin
javac -d bin src/main/java/com/aprendizado/**/*.java
```

Ou compile um arquivo específico:

```bash
javac -d bin src/main/java/com/aprendizado/lista01/Questao01.java
```

### Execução

Execute qualquer questão usando o comando:

```bash
java -cp bin com.aprendizado.lista01.Questao01
java -cp bin com.aprendizado.lista02.questao01.Questao01
java -cp bin com.aprendizado.lista03.questao03.Questao03
```

**Exemplos de execução:**

```bash
# Lista 01 - Múltiplos de 7
java -cp bin com.aprendizado.lista01.Questao01

# Lista 02 - Média ponderada
java -cp bin com.aprendizado.lista02.questao01.Questao01

# Lista 03 - Classe Produto
java -cp bin com.aprendizado.lista03.questao03.Questao03

# Lista 04 - Sistema de Pagamento
java -cp bin com.aprendizado.lista04.questao04.Questao04

# Lista 07 - Filtros com Streams
java -cp bin com.aprendizado.lista07.questao06.Questao6
```

## 📖 Estrutura de Pacotes

Cada questão segue a convenção:

```
com.aprendizado.lista01.Questao0X                    (Lista 01)
com.aprendizado.lista0X.questao0Y.Questao0Y          (Listas 02-07 com código)
com.aprendizado.lista0X.questao0Y/Questao0Y.md       (Questões com enunciados)
```

## 🛠️ Ferramentas e Tecnologias

- **Linguagem:** Java 11+
- **Build:** Compilador `javac` (JDK)
- **IDE Recomendada:** VS Code, IntelliJ IDEA, Eclipse

## 📝 Anotações Importantes

- **Questões com código Java:** Enunciado em comentário acima do `package`
- **Questões com .md:** Enunciado/teoria em arquivo Markdown dentro da pasta da questão
- Os exercícios progridem em dificuldade
- Alguns exercícios possuem classes auxiliares (ex: `SistemaEscolar`, `Pagamento`)
- Todos os arquivos compilam sem erros com JDK 11+
- **Total:** 65 exercícios, 13 arquivos .md educacionais, 66 classes compiladas

**Nota importante sobre `bin/`:** A pasta `bin/` contendo classes compiladas é ignorada no `.gitignore` (melhor prática). Você deve compilar localmente com `javac`.

## 🎓 Objetivos de Aprendizado

Após completar todas as listas, você terá aprendido:

✅ Fundamentos de Java (variáveis, loops, condicionais)  
✅ Programação Orientada a Objetos (classes, objetos, herança)  
✅ Encapsulamento (getters, setters, validações)  
✅ Polimorfismo (classes abstratas, interfaces)  
✅ Coleções (ArrayList, HashMap, iteração)  
✅ Programação Funcional (Streams, Expressões Lambda)

## 📄 Licença

Este projeto é fornecido como material educacional de forma livre.

## 💬 Dúvidas ou Sugestões

Sinta-se livre para fazer fork deste repositório ou abrir issues com sugestões de melhorias!
