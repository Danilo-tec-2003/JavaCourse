package intermediate_level.intermediate_level_Challenger6;

public class UserData {
    private String nome;
    private int idade;
    private String cidade;

    public UserData(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    // Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}