# 📘 RECORDS em Java

## ✅ O que são Records?

`Record` é uma *core class* (classe especial) introduzida no Java 14 (preview) e estabilizada no Java 16, usada para representar **estruturas imutáveis de dados**.

Eles **evitam a verbosidade** típica de uma classe Java padrão ao gerar automaticamente:
- Construtor
- Getters
- `equals()`
- `hashCode()`
- `toString()`

---

## 🧱 Exemplo Básico

```java
public record UserRecord(String name, String email, int phone) {}

Esse código equivale a algo assim:
public final class UserRecord {
    private final String name;
    private final String email;
    private final int phone;

    public UserRecord(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String name() { return name; }
    public String email() { return email; }
    public int phone() { return phone; }

    // equals(), hashCode(), toString() gerados automaticamente
}
⚠️ Características Importantes
Todos os campos são final → imutáveis

Não existem setters

Não podem estender outras classes (porque já estendem java.lang.Record)

Podem implementar interfaces

🧠 Quando Usar?
Use records quando:

Os dados são imutáveis

Você quer simplesmente representar dados (sem lógica de negócio interna)

Situações semelhantes a enums: estruturas que não vão mudar depois de criadas

Exemplo:

public record StatusCode(int code, String description) {}
Ideal para cenários como:

DTOs (Data Transfer Objects)

Representação de dados vindos de APIs

Respostas de banco de dados que não precisam ser editadas

Constantes com valor fixo (sem lógica de alteração)

🚫 Quando NÃO Usar?
Evite usar record se:

Você precisa de setters

Precisa de lógica interna que altera o estado da classe

Vai usar herança (não é permitido com records)

✅ Resumo Rápido
✅ Record = classe final + imutável + sem boilerplate

✅ Atributos final e privados

✅ Ideal para representar dados puros

❌ Não tem setters nem herança

✅ Permite métodos adicionais, se necessário

🧪 Curiosidade (Extra)
Você pode adicionar lógica de validação dentro do construtor compactado:

public record Product(String name, double price) {
    public Product {
        if (price < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
    }
}
Dica final: use record quando sua classe for uma simples "estrutura de dados". Mais conciso, mais limpo e mais seguro!