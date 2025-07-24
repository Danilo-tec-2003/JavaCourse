package intermediate_level.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Cria o primeiro objeto Person.
        Person person1 = new Person();

        // Define os valores usando os setters.
        person1.setName("Danilo Mendes");
        person1.setAge(21);

        // Exibe as informações da primeira pessoa.
        System.out.println("Nome: " + person1.getName());
        System.out.println("Idade: " + person1.getAge());
        System.out.println("Status: " + person1.getAgeStatus());

        System.out.println("\n--- Criando outra pessoa ---");

        // Cria o segundo objeto Person.
        Person person2 = new Person();
        person2.setName("Carla");
        person2.setAge(15);

        // Exibe as informações da segunda pessoa.
        System.out.println("Nome: " + person2.getName());
        System.out.println("Idade: " + person2.getAge());
        System.out.println("Status: " + person2.getAgeStatus());
    }
}