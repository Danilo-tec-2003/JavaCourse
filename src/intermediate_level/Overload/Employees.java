package intermediate_level.Overload;

public class Employees {

    String name;
    int id;
    double salary;
    Position position;
    String department;

    // Construtor completo
    public Employees(String name, int id, double salary, Position position, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    // Construtor com apenas os atributos essenciais
    public Employees(String name, int id, double salary) {
        // Chamando o construtor completo com valores padrão
        this(name, id, salary, Position.ANALYST_JR, "Padrão");
    }

    // Método para exibir os dados
    public void showInformation() {
        System.out.println("\n====================");
        System.out.println("Nome: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salário: R$ %.2f%n", salary);
        System.out.println("Cargo: " + position);
        System.out.println("Departamento: " + department);
        System.out.println("====================");
    }

    // Método padrão de cálculo de pagamento
    public double calculatePayment() {
        return this.salary;
    }

    // Sobrecarga com bônus
    public double calculatePayment(double bonus) {
        return this.salary + bonus;
    }

    // Sobrecarga com horas extras
    public double calculatePayment(int horasExtras, double valorPorHora) {
        return this.salary + (horasExtras * valorPorHora);
    }
}
