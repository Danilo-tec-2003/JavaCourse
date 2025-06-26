package intermediate_level;

public class User {

    String name;
    String city;
    int age;
    int ageMinRetirement = 65;

    //Criar um metodo publico personalizado, onde VOID nao preciasr retornar nada
    public void greet() {
        System.out.println("Olá, tudo bem?");
    }

    //Metodo String vai ter que retornar uma String, onde é necessario um retorno
    public String iamDeveloper() {
    return "Eu sou um Desenvolvedor! ";
    }

    //Metodo int vai ter que retornr um int (saber qunantos anos faltam para chegar a aposentadoria)
    public int retirementAge(int ageMinRetirement) {
        return ageMinRetirement - age;
    }
}
