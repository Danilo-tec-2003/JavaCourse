package intermediate_level.intermediate_level_Challenge5;

public class CurrentAccount extends BankAccount {

    //Construtor que chama o construtor da classe mãe (BankAccount) utilizando a palavra_chave 'super'.
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double value) {
        // Lógica simples: adiciona o valor diretamente ao saldo.
        // this.balance += value; é um atalho para this.balance = this.balance + value;
        this.balance += value;
        System.out.println("Depósito de R$" + value + " realizado na Conta Corrente.");
    }
}