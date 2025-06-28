package intermediate_level;

public class Main {
    public static void main(String[] args) {

        //Criando usuario1 a partir da class User.java (com objetos)

        Developer Danilo = new Developer(); //inicializando o objeto e declarando valores

        Danilo.name = "Danilo Mendes";
        Danilo.city = "Recife";
        Danilo.age = 21;
        Danilo.iamDeveloper();

        //Criando usuario2

        SocialWorker Rebeca = new SocialWorker();

        Rebeca.name = "Rebeca Nascimento";
        Rebeca.city = "Recife";
        Rebeca.age = 24;
        Rebeca.iamSocialWorker();

        //Criando usuario3

        Filmmaker Yane = new Filmmaker();

        Yane.name = "Yane Mendes";
        Yane.city = "Recife";
        Yane.age = 35;
        Yane.iamFilmmaker();

        //Criando usuario4

        Designer Edilene = new Designer();
        Edilene.name = "Edilene Mendes";
        Edilene.city = "Recife";
        Edilene.age = 28;
        Edilene.iamDesigner();
    }
}
