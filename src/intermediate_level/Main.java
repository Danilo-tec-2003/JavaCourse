package intermediate_level;

public class Main {
    public static void main(String[] args) {

        // --- CONVENÇÃO: Nomes de variáveis começam com letra minúscula ---

        Developer danilo = new Developer();
        danilo.name = "Danilo Mendes";
        danilo.city = "Recife";
        danilo.age = 21;

        SocialWorker rebeca = new SocialWorker();
        rebeca.name = "Rebeca Nascimento";
        rebeca.city = "Recife";
        rebeca.age = 24;

        Filmmaker yane = new Filmmaker();
        yane.name = "Yane Mendes";
        yane.city = "Recife";
        yane.age = 35;

        Designer edilene = new Designer();
        edilene.name = "Edilene Mendes";
        edilene.city = "Recife";
        edilene.age = 28;

        CleaningLady ivanice = new CleaningLady();
        ivanice.name = "Ivanice Mendes";
        ivanice.city = "Recife";
        ivanice.age = 55;

        DanteSon dante = new DanteSon();
        dante.name = "Dante Mendes do Nascimento";
        dante.city = "Recife";
        dante.age = 1;

        // --- AÇÃO: Vamos chamar os métodos para ver o resultado ---
        System.out.println("--- Apresentações ---");
        danilo.iamDeveloper();
        rebeca.iamSocialWorker();
        edilene.iamDesigner();
        ivanice.iamCleaningLady();

        System.out.println("\n--- Características do Casal e Filho ---");
        danilo.LightEyes();
        rebeca.SkinColor();

        System.out.println("\n--- Características do Filho ---");
        System.out.println("Nome: " + dante.name + ", Idade: " + dante.age + " ano.");
        dante.LightEyes(); // Linha completada
        dante.SkinColor(); // Linha completada
    }
}