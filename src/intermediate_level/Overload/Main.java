package intermediate_level.Overload;

public class Main {
    public static void main(String[] args) {

        // Testando a SOBRECARGA DE CONSTRUTORES
        System.out.println("CRIANDO FUNCIONÁRIOS...");

        Employees e1 = new Employees("Lucas Oliveira", 1, 3500.00); // usa valores padrão para cargo e depto
        Employees e2 = new Employees("Danilo Mendes", 2, 8200.00, Position.DEVELOPER_PL, "TI");

        e1.showInformation();
        e2.showInformation();

        // Testando a SOBRECARGA DE MÉTODOS
        System.out.println("\nCALCULANDO PAGAMENTOS...");

        // Para Lucas
        System.out.println("Pagamento padrão do Lucas: R$" + String.format("%.2f", e1.calculatePayment()));
        System.out.println("Pagamento do Lucas com bônus: R$" + String.format("%.2f", e1.calculatePayment(500.0)));

        // Para Danilo
        System.out.println("Pagamento do Danilo com horas extras: R$" + String.format("%.2f", e2.calculatePayment(10, 50.0)));
    }
}
