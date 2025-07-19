✅ Superclasses e Subclasses – Java
🔹 Superclasse:
É uma classe base que serve de modelo para outras classes.
Ela define atributos e comportamentos comuns que serão herdados pelas subclasses.

java
Copiar
Editar
// Superclasse abstrata Ninja
public abstract class Ninja implements EstrategiaDeBatalha {
    // Construtor padrão (vazio)
    public Ninja() {
        System.out.println("Um ninja foi criado.");
    }

    public void moverSilenciosamente() {
        System.out.println("Movendo-se em silêncio...");
    }
}
Ninja é a superclasse. Ela pode ter métodos comuns e até mesmo uma estratégia de batalha (interface ou outro comportamento comum).

🔹 Subclasses:
São classes que herdam da superclasse. Elas podem:

Usar os métodos e atributos da superclasse.

Criar novos métodos ou sobrescrever (override) os herdados.

java
Copiar
Editar
// Subclasse Uchila
public class Uchila extends Ninja {
    public Uchila() {
        super(); // chama o construtor da superclasse
        System.out.println("Ninja do clã Uchila criado.");
    }
}
java
Copiar
Editar
// Subclasse Uzumaki
public class Uzumaki extends Ninja {
    public Uzumaki() {
        super(); // chama o construtor da superclasse
        System.out.println("Ninja do clã Uzumaki criado.");
    }
}
🔸 O que é super();?
O super(); é usado dentro do construtor da subclasse para chamar o construtor da superclasse.

Isso garante que toda a estrutura da superclasse seja corretamente inicializada antes de continuar na subclasse.

🧠 Resumo:
Termo	Significado
Superclasse	Classe base (pai) que será estendida.
Subclasse	Classe derivada (filha) que herda da superclasse.
extends	Palavra-chave usada para herança.
super();	Chama o construtor da superclasse.



DESAFIO

.

💼 Desafio: Sistema de Funcionários
📌 Objetivo:
Criar uma estrutura com uma superclasse Funcionario e pelo menos duas subclasses: Gerente e Desenvolvedor.
Todos os funcionários têm nome e salário, e possuem um método realizarTarefa() que será sobrescrito nas subclasses.

🛠️ Requisitos:
Crie a superclasse Funcionario com:

Atributos: nome (String), salario (double)

Construtor com parâmetros

Método realizarTarefa() que imprime: "Funcionário está realizando uma tarefa genérica."

Crie a subclasse Gerente que:

Usa super() no construtor

Sobrescreve realizarTarefa() e imprime: "Gerente está coordenando a equipe e definindo metas."

Crie a subclasse Desenvolvedor que:

Usa super() no construtor

Sobrescreve realizarTarefa() e imprime: "Desenvolvedor está codificando novas funcionalidades."

Crie a classe Main com o método main:

Instancie um Gerente e um Desenvolvedor

Chame realizarTarefa() de cada um

🧱 Estrutura sugerida:
java
Copiar
Editar
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void realizarTarefa() {
        System.out.println("Funcionário está realizando uma tarefa genérica.");
    }
}
java
Copiar
Editar
public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(nome + " está coordenando a equipe e definindo metas.");
    }
}
java
Copiar
Editar
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(nome + " está codificando novas funcionalidades.");
    }
}
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        Funcionario gestor = new Gerente("Mariana Silva", 8000.00);
        Funcionario programador = new Desenvolvedor("Lucas Oliveira", 5000.00);

        gestor.realizarTarefa();
        programador.realizarTarefa();
    }
}
✅ Extra (opcional):
Crie um método exibirDados() na superclasse para exibir nome e salário, e sobrescreva nas subclasses adicionando um prefixo diferente (por exemplo, "Perfil do Gerente", "Perfil do Desenvolvedor").

