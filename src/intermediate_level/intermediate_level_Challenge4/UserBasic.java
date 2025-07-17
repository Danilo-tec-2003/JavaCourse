package intermediate_level.intermediate_level_Challenge4;

public class UserBasic implements User {

    String name;
    int age;
    String training;

    public UserBasic(String name, int age, String training) {
        this.name = name;
        this.age = age;
        this.training = training;
    }

    @Override
    public void showInformation() {
        System.out.println("🟢 Atleta Básico:");
        System.out.println("- Nome: " + name);
        System.out.println("- Idade: " + age);
        System.out.println("- Modalidade: " + training);
    }

    @Override
    public void praticTime() {
        System.out.println("⏱️ Tempo de prática: 6 meses");
    }
}
