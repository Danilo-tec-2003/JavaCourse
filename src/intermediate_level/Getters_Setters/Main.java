package intermediate_level.Getters_Setters;

/**
 * Classe principal que contém o metodo main.
 * É o ponto de entrada para a execução do programa.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Usuarios da familia Mendes");

        // 1. Criação de um objeto (instância) da classe Mendes.
        // Como Mendes herda de User, usamos o construtor definido na classe pai.
        Mendes userMendes1 = new Mendes("Danilo Mendes","Recife", 21, "Artes Marciais",1.85);

        // 2. Leitura do dado usando o método getter herdado de User.
        System.out.println("Meu nome é: " + userMendes1.getName());

        // 3. Modificação do dado usando o método setter herdado de User.
        userMendes1.setName("Danilo Mendes com nome alterado usando o Setter");

        // 4. Leitura do dado novamente para confirmar a alteração.
        System.out.println("Meu nome é: " + userMendes1.getName());
    }
}