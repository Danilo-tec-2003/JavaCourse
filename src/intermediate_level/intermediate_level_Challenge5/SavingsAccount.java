package intermediate_level.intermediate_level_Challenge5;

public class SavingsAccount  extends BankAccount {

    // Construtor que também chama o construtor da classe mãe.
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double value) {

        // Lógica com a taxa: calcula o valor líquido a ser depositado.
        double fee = value * 0.01; // Calcula 1% de taxa
        double netValue = value - fee; // Valor líquido

        // Adiciona o valor líquido ao saldo.
        this.balance += netValue;
        System.out.println("Depósito de R$" + value + " realizado na Poupança. Taxa de R$" + fee + " aplicada.");
    }

}
