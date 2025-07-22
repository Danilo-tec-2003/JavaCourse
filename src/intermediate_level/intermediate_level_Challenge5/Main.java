package intermediate_level.intermediate_level_Challenge5;

public class Main {
    public static void main(String[] args) {
        // Criando uma Conta Corrente com saldo inicial de 1000
        Account CurrentAccount = new CurrentAccount(1000);
        System.out.println("Saldo inicial CC: R$: " +  CurrentAccount.checkBalance());
        CurrentAccount.deposit(500);
        System.out.println("Saldo Final CC: R$" + CurrentAccount.checkBalance());

        System.out.println("\n-----------------------------------\n");

        // Criando uma Conta Poupança com saldo inicial de 2000
        Account SavingsAccount = new SavingsAccount(2000);
        System.out.println("Saldo inicial CP: R$" + SavingsAccount.checkBalance());
        SavingsAccount.deposit(500);
        System.out.println("Saldo Final CP: R$" + SavingsAccount.checkBalance());
    }
}
