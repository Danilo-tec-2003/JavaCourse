package intermediate_level_Challenge4;

public class UserAdvanced implements User {

    int age;
    String name;
    String trainingCenter;
    String especialidade;

    public UserAdvanced(int age, String name, String trainingCenter, String especialidade) {
        this.age = age;
        this.name = name;
        this.trainingCenter = trainingCenter;
        this.especialidade = especialidade;
    }

    @Override
    public void showInformation() {
        System.out.println("🔴 Atleta Avançado:");
        System.out.println("- Nome: " + name);
        System.out.println("- Idade: " + age);
        System.out.println("- Centro de Treinamento: " + trainingCenter);
        System.out.println("- Especialidade: " + especialidade);
    }

    @Override
    public void praticTime() {
        System.out.println("⏱️ Tempo de prática: 2 anos");
    }

    public void praticedSport() {
        System.out.println("🥋 Modalidade praticada: Jiu-Jitsu e Muay Thai");
    }

    public void trainingSchedule() {
        System.out.println("📅 Horários: Seg a Sex - 19h às 21h");
    }
}
