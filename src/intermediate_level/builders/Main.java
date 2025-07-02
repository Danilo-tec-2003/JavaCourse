package intermediate_level.builders;

public class Main {
    public static void main(String[] args) {

        Company Effetive = new Company("Effetive Sistemas", "Desenvolvedor full stack", 1200.0, false, 6);
        System.out.println( " Nome da empresa: " + Effetive.name);
        System.out.println( " Cargo: " + Effetive.position);
        System.out.println( " Salário " + Effetive.salary);
        System.out.println( " CLT? " + Effetive.cltORpj);
        System.out.println( " Carga horária: " + Effetive.workload + " Horas por Dia.");

        System.out.println("_________________________________________________________________________________________");
        Company Parvi = new Company("Parvi Seguradora", "Vendendora de Seguros", 1500.0, true, 8); // usando construtor com parâmetro
        System.out.println(" Nome da empresa: " + Parvi.name);
        System.out.println(" Cargo: " + Parvi.position);
        System.out.println(" Salário " + Parvi.salary);
        System.out.println(" CLT? " + Parvi.cltORpj);
        System.out.println(" Carga horária: " + Parvi.workload + " Horas por Dia.");
    }
}
