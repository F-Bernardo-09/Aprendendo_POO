# Resumo: Scanner e System.out.printf em Java

## 📥 Scanner - Entrada de Dados

### O que é?
Classe do pacote `java.util` para ler dados do teclado, arquivos ou strings.

### Configuração Básica
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

### Métodos Principais
| Método | Descrição |
|--------|-----------|
| `nextInt()` | Lê número inteiro |
| `nextDouble()` | Lê número decimal |
| `nextLine()` | Lê linha completa |
| `next()` | Lê uma palavra |

### Exemplo de Uso
```java
System.out.print("Digite um número: ");
double numero = sc.nextDouble();
sc.close(); // Sempre fechar ao final
```

---

## 📤 System.out.printf - Formatação de Saída

### O que é?
Método para exibir dados formatados, controlando casas decimais, alinhamento, etc.

### Especificadores de Formato
| Código | Tipo | Exemplo |
|--------|------|---------|
| `%d` | Inteiro | `printf("%d", 10)` → 10 |
| `%f` | Decimal | `printf("%f", 3.14)` → 3.140000 |
| `%.2f` | Decimal com 2 casas | `printf("%.2f", 3.14159)` → 3.14 |
| `%s` | String | `printf("%s", "texto")` → texto |
| `%n` | Quebra de linha | Multiplataforma |

### Exemplos Práticos
```java
double preco = 25.50;
int qtd = 3;
double total = preco * qtd;

// Saída formatada
System.out.printf("Preço: R$ %.2f%n", preco);
System.out.printf("Quantidade: %d%n", qtd);
System.out.printf("Total: R$ %.2f%n", total);
```

**Saída:**
```
Preço: R$ 25.50
Quantidade: 3
Total: R$ 76.50
```

---

## ⚠️ Dicas Importantes

✅ Sempre fechar com `sc.close()`  
✅ `%.2f` arredonda automaticamente  
✅ Especificar largura: `%10.2f` (10 caracteres, 2 decimais)  
⚠️ Cuidado ao misturar `nextInt()` com `nextLine()`
