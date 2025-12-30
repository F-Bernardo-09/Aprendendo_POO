# Identificação e Correção de Erro

## 🔍 Código Original (COM ERROS)

```java
import java.util.Scanner;
public class Contador {
    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador)
        }
    }
}
```

---

## ❌ Erros Identificados

### 1. **Assinatura do método main incorreta**
```java
public static void main(String args)    // ❌ ERRADO
public static void main(String[] args)  // ✅ CORRETO

```

**Problema:** Falta os colchetes `[]` no parâmetro.

**Explicação:** O método main deve receber um array de Strings.

---

### 2. **Falta ponto e vírgula**
```java
System.out.println("Contador: " + contador)   // ❌ ERRADO
System.out.println("Contador: " + contador);  // ✅ CORRETO

```

**Problema:** Toda instrução em Java deve terminar com `;`

---

### 3. **Loop infinito (erro lógico)**
```java
while (contador <= 5) {
    System.out.println("Contador: " + contador)
    // ❌ contador nunca é incrementado!
}
```

**Problema:** A variável `contador` permanece sempre 0, criando um loop infinito.

**Explicação:** Sem incrementar o contador, a condição `contador <= 5` será sempre verdadeira.

**Correção:**
```java
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;  // ✅ Incrementa o contador
}
```

---

### 4. **Scanner não utilizado/fechado**
```java
Scanner sc = new Scanner(System.in);
// ❌ Scanner criado mas não usado nem fechado
```

**Problema:** Recurso não fechado e desnecessário no código.

**Correção:** Fechar com `sc.close()` ou remover se não for usado.

---

## ✅ Código Corrigido Completo

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {  // ✅ String[] args
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        while (contador <= 5) {
            System.out.println("Contador: " + contador);  // ✅ Ponto e vírgula
            contador++;  // ✅ Incremento do contador
        }
        
        sc.close();  // ✅ Fecha o Scanner
    }
}
```

### 📤 Saída do Programa:
```
Contador: 0
Contador: 1
Contador: 2
Contador: 3
Contador: 4
Contador: 5
```