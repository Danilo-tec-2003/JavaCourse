package intermediate_level.Getters_Setters;

/**
 * Superclasse que define a estrutura e os comportamentos base de um usuário.
 * Funciona como um modelo para outras classes.
 */
public class User {
    // Atributos privados garantem o encapsulamento. Só podem ser acessados
    // diretamente de dentro desta classe.
    private String name;
    private String city;
    private int age;
    private String hobby;
    private double height;

    /**
     * Construtor parametrizado.
     * Usado para criar um objeto 'User' já com todos os seus atributos definidos.
     * @param name Nome do usuário.
     * @param city Cidade do usuário.
     * @param age Idade do usuário.
     * @param hobby Hobby do usuário.
     * @param height Altura do usuário.
     */
    public User(String name, String city, int age, String hobby, double height) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.hobby = hobby;
        this.height = height;
    }

    /**
     * Construtor padrão (sem argumentos).
     * Permite criar um objeto 'User' vazio, cujos valores podem ser definidos depois
     * usando os métodos setters.
     */
    public User () {

    }

    // --- MÉTODOS GETTERS E SETTERS ---
    // Fornecem acesso controlado aos atributos privados.

    /**
     * Getter: Retorna o valor do atributo 'name'.
     * Usado para LER o dado.
     * @return o nome do usuário.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter: Define um novo valor para o atributo 'name'.
     * Usado para MODIFICAR o dado.
     * @param name o novo nome a ser atribuído.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}