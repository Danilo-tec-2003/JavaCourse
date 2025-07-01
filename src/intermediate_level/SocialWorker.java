package intermediate_level;

public class SocialWorker extends User {
    public void iamSocialWorker() {
        System.out.println("Meu nome é " + name + ", Atuo Profissionalmente como Assistente Social!");
    }

    // Método obrigatório da interface

    public void LightEyes() {
        System.out.println(name + " tem olhos claros.");
    }

    // Método obrigatório da interface

    public void SkinColor() {
        System.out.println(name + " tem a pele negra de tom claro.");
    }
}
