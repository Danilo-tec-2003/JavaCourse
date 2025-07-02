# 🏗️ Construtores em Java — Exemplo com Classe `Company`

> Se **classes são moldes**, então **construtores são os padrões** para criar objetos com os dados iniciais preenchidos.

---
## 📦 Pacote
`builders`

## 📂 Classes Envolvidas
- `Company.java`
- `Main.java`

---

## 🧱 Tipos de Construtores

Em Java, temos dois tipos principais de construtores:

### 🔹 `NoArgs Constructor`  
Um construtor **vazio**, que não recebe argumentos.

```java
public Company() {
}

🔹 AllArgs Constructor
Um construtor que recebe todos os atributos da classe como parâmetros.
Isso nos permite criar objetos já com os valores definidos, economizando código.


public Company(String name, String position, double salary, boolean cltORpj, int workload) {
    this.name = name;
    this.position = position;
    this.salary = salary;
    this.cltORpj = cltORpj;
    this.workload = workload;
}
💡 Dica: Você pode gerar rapidamente construtores no IntelliJ com o atalho ALT + INSERT.

🧩 Estrutura da Classe Company
public class Company {
    String name;
    String position;
    double salary;
    boolean cltORpj; // true = CLT, false = PJ
    int workload;

    // Construtor com todos os parâmetros (AllArgs Constructor)
    public Company(String name, String position, double salary, boolean cltORpj, int workload) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.cltORpj = cltORpj;
        this.workload = workload;
    }
}

🚀 Uso na Classe Main
Criando e exibindo dados de duas empresas distintas com uma única linha para cada objeto:

public class Main {
    public static void main(String[] args) {

        Company effetive = new Company("Effetive Sistemas", "Desenvolvedor Full Stack", 1200.0, false, 6);
        System.out.println("Nome da empresa: " + effetive.name);
        System.out.println("Cargo: " + effetive.position);
        System.out.println("Salário: " + effetive.salary);
        System.out.println("CLT? " + effetive.cltORpj);
        System.out.println("Carga horária: " + effetive.workload + " horas por dia.");

        System.out.println("--------------------------------------------------------------------------------");

        Company parvi = new Company("Parvi Seguradora", "Vendedora de Seguros", 1500.0, true, 8);
        System.out.println("Nome da empresa: " + parvi.name);
        System.out.println("Cargo: " + parvi.position);
        System.out.println("Salário: " + parvi.salary);
        System.out.println("CLT? " + parvi.cltORpj);
        System.out.println("Carga horária: " + parvi.workload + " horas por dia.");
    }
}

✅ Resultado Esperado no Terminal

Nome da empresa: Effetive Sistemas
Cargo: Desenvolvedor Full Stack
Salário: 1200.0
CLT? false
Carga horária: 6 horas por dia.

--------------------------------------------------------------------------------

Nome da empresa: Parvi Seguradora
Cargo: Vendedora de Seguros
Salário: 1500.0
CLT? true
Carga horária: 8 horas por dia.


🧠 Benefícios do Uso de Construtores

Evita repetição de código
Facilita a criação de objetos com dados prontos
Organiza a inicialização de forma clara e objetiva
Permite padronizar a construção de objetos em grandes projetos