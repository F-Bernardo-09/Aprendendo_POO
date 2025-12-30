# Comparativo de Implementações: HashSet vs LinkedHashSet vs TreeSet

Embora todos esses pertençam à interface `Set` (não aceitam repetidos), a forma como organizam os dados por baixo do capô é totalmente diferente.

---

## 1. Ordem dos Elementos

A principal diferença visual entre eles é como os itens aparecem quando você percorre o conjunto.

- **HashSet:** É o mais "caótico". **Não garante nenhuma ordem**. A ordem pode inclusive mudar quando novos elementos são adicionados.

- **LinkedHashSet:** Mantém a **ordem de inserção**. Se você adicionou "A", depois "C" e depois "B", eles sairão exatamente nessa sequência.

- **TreeSet:** Mantém a **ordem natural** (alfabética para Strings, numérica para números) ou uma ordem personalizada definida por um `Comparator`.

---

## 2. Complexidade (Performance)

Aqui falamos de quão rápido o Java consegue encontrar, colocar ou tirar um item da estrutura.

| Implementação     | Busca / Inserção / Remoção             | Estrutura de Dados Interna |
| :---------------- | :------------------------------------- | :------------------------- |
| **HashSet**       | O(1) - Constante (Muito Rápido)        | Tabela Hash                |
| **LinkedHashSet** | O(1) - Constante (Rápido)              | Tabela Hash + Lista Ligada |
| **TreeSet**       | O(log n) - Logarítmica (Mais lento)    | Árvore Rubro-Negra         |

- **HashSet** é o campeão de velocidade porque usa um código (hash) para ir direto ao endereço do dado.
- **TreeSet** é mais lento porque, a cada inserção, ele precisa "balancear a árvore" para manter tudo em ordem.

---

## 3. Uso de Memória

- **HashSet:** É o mais econômico, pois guarda apenas os elementos e seus códigos hash.
- **LinkedHashSet:** É o que **mais consome memória**, pois além da tabela hash, ele precisa manter ponteiros (links) para o próximo e o anterior, para lembrar a ordem de inserção.
- **TreeSet:** Consumo moderado a alto, pois precisa armazenar a estrutura de nós da árvore (pai, filhos esquerda/direita).

---

## Resumo Comparativo

| Característica    | HashSet | LinkedHashSet | TreeSet                        |
| :---------------- | :------ | :------------ | :----------------------------- |
| **Ordem**         | Nenhuma | De inserção   | Natural (ex: A-Z)              |
| **Velocidade**    | Máxima  | Rápida        | Média                          |
| **Memória**       | Baixa   | Alta          | Média                          |
| **Permite Null?** | Sim     | Sim           | Não (lança erro na comparação) |

---

## Exemplo Prático de Código

```java
import java.util.*;

public class ComparativoSets {
    public static void main(String[] args) {
        // 1. HashSet: Rápido, mas bagunçado
        Set<String> hash = new HashSet<>(Arrays.asList("Banana", "Maçã", "Abacaxi"));
        System.out.println("HashSet: " + hash); // Ordem imprevisível

        // 2. LinkedHashSet: Lembra quem chegou primeiro
        Set<String> linked = new LinkedHashSet<>(Arrays.asList("Banana", "Maçã", "Abacaxi"));
        System.out.println("LinkedHashSet: " + linked); // Banana, Maçã, Abacaxi

        // 3. TreeSet: Organiza sozinho (A-Z)
        Set<String> tree = new TreeSet<>(Arrays.asList("Banana", "Maçã", "Abacaxi"));
        System.out.println("TreeSet: " + tree); // Abacaxi, Banana, Maçã
    }
}
```

---

### Qual escolher?

1. Se a **ordem não importa** e você quer **performance máxima**: use **HashSet**.
2. Se você precisa que a lista saia na **mesma ordem** que você digitou: use **LinkedHashSet**.
3. Se você precisa que os dados estejam **sempre ordenados** (ex: lista alfabética): use **TreeSet**.
