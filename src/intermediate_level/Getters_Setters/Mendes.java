package intermediate_level.Getters_Setters;

/**
 * Outra subclasse que herda de User. Demonstra como a mesma base
 * pode ser usada para criar diferentes tipos de objetos.
 */
public class Mendes extends User {

    /**
     * Construtor padrão.
     */
    public Mendes () {

    }

    /**
     * Construtor que utiliza o construtor da classe pai 'User'
     * para inicializar os atributos herdados.
     */
    public Mendes(String name, String city, int age, String hobby, double height) {
        super(name, city, age, hobby, height);
    }
}