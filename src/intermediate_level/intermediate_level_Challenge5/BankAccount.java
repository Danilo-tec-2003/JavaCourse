package intermediate_level.intermediate_level_Challenge5;

public abstract class BankAccount implements Account {

    // 'protecd' permite que esta variavel seja acessada diretamente pelas classes filhas
    // (CurrentAccount, SavingsAccount)
    protected double balance;

    //Construtor par inicializar o objeto com um saldo inicial
    public BankAccount(double iniitalBalance) {
        // Atribui o valor recebido no construtor ao atributo da classe.
        this.balance = iniitalBalance;
    }

    @Override
    public double checkBalance() {
        // Retorna o valor atual do saldo, como prometido pela assinatura do método.
        return this.balance;
    }

    // Declaração do método 'deposit' como abstrato.
    // Isso FORÇA qualquer classe filha a criar sua própria implementação.
    @Override
    public abstract void deposit (double value);

}
