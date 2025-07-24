package intermediate_level.Getters_Setters;

/**
 * Subclasse que herda todos os atributos e métodos da classe User.
 * Representa um tipo específico de usuário.
 */
public class Silva extends User {

    /**
     * Construtor padrão.
     */
    public Silva() {
    }

    /**
     * Construtor que repassa os dados para o construtor da superclasse (User).
     * A palavra-chave 'super' chama o construtor da classe pai.
     */
    public Silva(String name, String city, int age, String hobby, double height) {
        super(name, city, age, hobby, height);
    }
}