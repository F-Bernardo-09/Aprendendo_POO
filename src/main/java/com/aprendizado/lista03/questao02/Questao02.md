# Sistema de Controle de Biblioteca - Modelagem da Classe Livro

## 1. Informações Relevantes para Representar um Livro

Para um sistema de biblioteca, os atributos importantes de um livro seriam:

### Atributos Básicos
- **título**: nome do livro
- **autor**: quem escreveu o livro
- **ISBN**: código único de identificação do livro
- **editora**: quem publicou o livro
- **anoPublicacao**: ano em que foi publicado
- **numeroPaginas**: quantidade de páginas

### Atributos de Controle
- **disponivel**: se o livro está disponível para empréstimo (true/false)
- **categoria**: gênero do livro (ficção, técnico, romance, etc.)
- **localizacao**: onde o livro fica na biblioteca (prateleira, seção)
- **estadoConservacao**: condição física do livro (novo, bom, desgastado)

### Atributos Opcionais
- **edicao**: qual edição do livro
- **idioma**: idioma do livro
- **quantidadeExemplares**: quantos exemplares a biblioteca possui

## 2. Por que a Classe Livro é uma Abstração?

A classe `Livro` é uma **abstração** porque:

### Simplificação da Realidade
Um livro físico real tem infinitas características: peso exato, cor da capa, textura das páginas, cheiro, manchas específicas, etc. A classe `Livro` **abstrai** (simplifica) isso, mantendo apenas as informações **relevantes para o sistema**.

### Foco no Essencial
A abstração ignora detalhes irrelevantes e mantém apenas o que importa para o contexto. Para uma biblioteca, não importa se o livro tem uma mancha na página 47 ou qual o tom exato de azul da capa. Importa: título, autor, disponibilidade, etc.

### Representação Conceitual
A classe não é o livro físico, é uma **representação digital** dele. É um modelo que captura a "essência" do livro no contexto do sistema.

**Exemplo prático:** Dois livros físicos idênticos (mesmo título, autor, ISBN) podem ser representados por um único objeto `Livro` com `quantidadeExemplares = 2`. Isso é abstração!

## 3. Métodos que Fariam Sentido na Classe Livro

### Métodos Essenciais

#### 1. **emprestar()**
```java
public boolean emprestar() {
    if (this.disponivel) {
        this.disponivel = false;
        return true; // Empréstimo realizado
    }
    return false; // Livro não disponível
}
```
**Por quê?** Registra quando o livro é emprestado, mudando seu status.

#### 2. **devolver()**
```java
public void devolver() {
    this.disponivel = true;
}
```
**Por quê?** Marca o livro como disponível novamente quando é devolvido.

#### 3. **exibirInformacoes()**
```java
public void exibirInformacoes() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("ISBN: " + this.isbn);
    System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
}
```
**Por quê?** Mostra os dados do livro de forma organizada.

### Métodos Adicionais Úteis

#### 4. **isDisponivel()**
```java
public boolean isDisponivel() {
    return this.disponivel;
}
```
**Por quê?** Verifica rapidamente se o livro pode ser emprestado.

#### 5. **calcularIdadeLivro()**
```java
public int calcularIdadeLivro() {
    int anoAtual = 2025; // ou usar Calendar.getInstance()
    return anoAtual - this.anoPublicacao;
}
```
**Por quê?** Útil para saber há quanto tempo o livro foi publicado.

#### 6. **atualizarEstadoConservacao()**
```java
public void atualizarEstadoConservacao(String novoEstado) {
    if (novoEstado.equals("novo") || novoEstado.equals("bom") || 
        novoEstado.equals("desgastado") || novoEstado.equals("danificado")) {
        this.estadoConservacao = novoEstado;
    }
}
```
**Por quê?** Permite registrar o desgaste do livro ao longo do tempo.

## Exemplo Completo da Classe

```java
public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private boolean disponivel;
    private String categoria;
    
    // Construtor
    public Livro(String titulo, String autor, String isbn, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // Livro começa disponível
    }
    
    // Métodos principais
    public boolean emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
            return true;
        }
        System.out.println("Livro não está disponível.");
        return false;
    }
    
    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }
    
    public void exibirInformacoes() {
        System.out.println("=== Informações do Livro ===");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Ano: " + this.anoPublicacao);
        System.out.println("Status: " + (this.disponivel ? "Disponível" : "Emprestado"));
    }
    
    // Getters
    public boolean isDisponivel() {
        return this.disponivel;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
}
```

## Exemplo de Uso

```java
public class TesteBiblioteca {
    public static void main(String[] args) {
        // Criando um livro
        Livro livro = new Livro(
            "1984", 
            "George Orwell", 
            "978-0451524935", 
            1949
        );
        
        // Exibindo informações
        livro.exibirInformacoes();
        
        // Tentando emprestar
        livro.emprestar();  // Sucesso
        
        // Tentando emprestar novamente
        livro.emprestar();  // Falha - já está emprestado
        
        // Devolvendo
        livro.devolver();
        
        // Agora pode emprestar de novo
        livro.emprestar();  // Sucesso
    }
}
```

## Resumo

- **Abstração**: A classe Livro pega um objeto complexo do mundo real e representa apenas o que é importante para o sistema
- **Atributos**: Informações que descrevem o livro
- **Métodos**: Ações que o livro pode realizar ou que podemos fazer com ele
- **Encapsulamento**: Atributos privados protegidos por getters e setters