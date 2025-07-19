Exercício com Guia: Sistema de Cálculo de Salário
Vamos criar um pequeno sistema para calcular o bônus salarial de diferentes tipos de funcionários em uma empresa. Cada cargo tem uma regra de bônus diferente, o que é um cenário perfeito para usar abstração e polimorfismo.

Objetivo: Criar uma classe abstrata Funcionario e duas subclasses concretas (Gerente e Desenvolvedor). Depois, criar uma lista de funcionários e calcular o bônus de todos eles de forma polimórfica.

Guia Passo a Passo
Passo 1: Crie a Classe Abstrata Funcionario

Crie uma nova classe chamada Funcionario.

Declare-a como abstract.

Adicione os atributos nome (String) e salarioBase (double). Crie um construtor para inicializá-los.

Crie um método abstrato chamado calcularBonus(), que retorna um double. Este método não terá corpo.

Seu código deve parecer com isto:

Java

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonus();

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
Passo 2: Crie as Subclasses Gerente e Desenvolvedor

Crie a classe Gerente que herda (extends) de Funcionario.

Crie um construtor para Gerente que chame o construtor da superclasse (super()).

Sobrescreva (@Override) o método calcularBonus(). A regra para o gerente é um bônus de 20% sobre o salário base.

Repita o processo para a classe Desenvolvedor. A regra para o desenvolvedor é um bônus de 10% sobre o salário base.

Código da classe Gerente:

Java

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        // Bônus de 20%
        return getSalarioBase() * 0.20;
    }
}
Código da classe Desenvolvedor:

Java

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        // Bônus de 10%
        return getSalarioBase() * 0.10;
    }
}
Passo 3: Crie a Classe Principal para Testar (Polimorfismo)

Crie uma classe com um método main, por exemplo, Empresa.

Dentro do main, crie uma lista de Funcionario. Use ArrayList.

Java

import java.util.ArrayList;
import java.util.List;
Adicione à lista um novo Gerente e um novo Desenvolvedor.

Java

List<Funcionario> funcionarios = new ArrayList<>();
funcionarios.add(new Gerente("Ana", 10000.0));
funcionarios.add(new Desenvolvedor("Carlos", 5000.0));
Use um laço (for-each) para percorrer a lista de funcionários. Para cada funcionário na lista, imprima seu nome, o valor do bônus e o salário total (salário base + bônus).

Seu método main deve se parecer com isto:

Java

public class Empresa {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Ana", 10000.0));
        funcionarios.add(new Desenvolvedor("Carlos", 5000.0));
        funcionarios.add(new Desenvolvedor("Beatriz", 6000.0));

        System.out.println("--- Folha de Bônus ---");

        for (Funcionario func : funcionarios) {
            double bonus = func.calcularBonus(); // Magia do polimorfismo!
            double salarioTotal = func.getSalarioBase() + bonus;
            System.out.printf("Funcionário: %s | Bônus: R$ %.2f | Salário Total: R$ %.2f\n",
                func.getNome(), bonus, salarioTotal);
        }
    }
}
Resultado Esperado:
Ao executar a classe Empresa, a saída deve ser:

--- Folha de Bônus ---
Funcionário: Ana | Bônus: R$ 2000.00 | Salário Total: R$ 12000.00
Funcionário: Carlos | Bônus: R$ 500.00 | Salário Total: R$ 5500.00
Funcionário: Beatriz | Bônus: R$ 600.00 | Salário Total: R$ 6600.00
Conclusão do Exercício:
Note que, no laço for, a variável func é do tipo Funcionario. No entanto, quando func.calcularBonus() é chamado, o Java executa a versão do método correspondente ao objeto real (Gerente ou Desenvolvedor). Isso demonstra o poder do polimorfismo para escrever um código mais limpo e genérico.