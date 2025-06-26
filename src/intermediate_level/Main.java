package intermediate_level;

public class Main {
    public static void main(String[] args) {

        //Criando usuario1 a partir da class User.java (com objetos)

        User Danilo = new User(); //inicializando o objeto e declarando valores

        Danilo.name = "Danilo Mendes";
        Danilo.city = "Recife";
        Danilo.age = 21;

        //Aplicando metodo aos meus objetos, metodo de comprimentar
        Danilo.greet();

        String  callingMethod = Danilo.iamDeveloper();
        System.out.println(callingMethod);

        int remainingTime = Danilo.retirementAge(60);
        System.out.println("Você tem: " + Danilo.age + " anos, então faltam: " + remainingTime + " anos para se aposentar.");

        //Criando usuario2

        User Rebeca = new User();

        Rebeca.name = "Rebeca Nascimento";
        Rebeca.city = "Recife";
        Rebeca.age = 24;

        //Criando usuario3

        User Yane = new User();

        Yane.name = "Yane Mendes";
        Yane.city = "Recife";
        Yane.age = 35;

    }
}
