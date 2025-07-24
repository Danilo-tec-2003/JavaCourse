package intermediate_level.Encapsulation;

public class Person {

    private String name;
    private int age;

    // Getter para o nome.
    public String getName() {
        return this.name;
    }

    // Setter para o nome.
    public void setName(String name) {
        this.name = name;
    }

    // Getter para a idade.
    public int getAge() {
        return this.age;
    }

    // Setter para a idade com validação. Agora ele define o valor do atributo.
    public void setAge(int age) {
        if (age > 0) { // Garante que a idade seja um número positivo.
            this.age = age;
        } else {
            // Informa sobre o erro, mas não para a execução.
            System.out.println("Erro: Idade inválida. O valor não foi alterado.");
        }
    }

    // Metodo que retorna uma informação derivada da idade (lógica de negócio).
    public String getAgeStatus() {
        if (this.age >= 18) {
            return "Adulto.";
        } else if (this.age > 0) {
            return "Menor de idade.";
        } else {
            return "Idade não definida ou inválida.";
        }
    }
}