# 🧠 Polimorfismo com @Override em Java

> Exemplo prático de reutilização de métodos com personalização através de sobrescrita.

## 📦 Package
`Polimorfismo`

## 📂 Classes Envolvidas

- `Main.java`
- `User.java` (classe base)
- `DaniloUser.java` (subclasse)
- `RebecaUser.java` (subclasse)

---

## 🧩 Descrição

A classe `User` é um molde com atributos comuns:

- `name`
- `age`
- `city`
- `TalentPerson()` → método genérico que será sobrescrito

As subclasses (`DaniloUser`, `RebecaUser`) sobrescrevem o método `TalentPerson()` para exibir talentos personalizados, usando o conceito de **Polimorfismo** com a anotação **@Override**.

---

## 📌 Exemplo de Uso

### 🔹 `Main.java`

DaniloUser userOne = new DaniloUser();
userOne.name = "Danilo Mendes";
userOne.TalentPerson(); // Exibe talento específico de Danilo

🔹 User.java
public class User {
    public String name;
    public int age;
    public String city;

    public void TalentPerson() {
        System.out.println(name + " tem um talento especial!");
    }
}
🔹 DaniloUser.java
public class DaniloUser extends User {
    @Override
    public void TalentPerson() {
        System.out.println(name + " tem um talento especial: uma excelente capacidade analítica!");
    }
}
🔹 RebecaUser.java
public class RebecaUser extends User {
    @Override
    public void TalentPerson() {
        System.out.println(name + " tem um talento especial: uma criatividade fora do comum!");
    }
}
✅ Resultado Esperado

Danilo Mendes tem um talento especial: uma excelente capacidade analítica!
Rebeca Pereira tem um talento especial: uma criatividade fora do comum!

🧠 Conceitos Reforçados

Herança: Compartilhamento de atributos e métodos comuns.
Polimorfismo: Um mesmo método com comportamentos diferentes.
@Override: Sobrescreve métodos da superclasse com comportamentos específicos.