package intermediate_level.builders;

public class Company {
    String name;
    String position;
    double salary;
    boolean cltORpj; // true = CLT, false = PJ
    int workload;

    // Construtor Sem argumento (NoArgs Constructor)
    public Company() {

    }

    // Construtor com argumento (AllArgs Constructor)
    public Company (String name, String position, double salary, boolean cltORpj, int workload) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.cltORpj = cltORpj;
        this.workload = workload;
    }
}

