package intermediate_level.intermediate_level_Challenge4;

public class Main {
    public static void main(String[] args) {
        UserAdvanced danilo = new UserAdvanced(21, "Danilo Mendes", "CT Galo de Raça", "Competição");

        User basic = new UserBasic("Bruno Silva", 25, "Boxe");

        System.out.println("=== Atleta Avançado ===");
        danilo.showInformation();
        danilo.praticTime();
        danilo.praticedSport();
        danilo.trainingSchedule();

        System.out.println("\n=== Atleta Básico ===");
        basic.showInformation();
        basic.praticTime();
    }
}
