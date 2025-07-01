package intermediate_level;

public class Developer extends User implements characteristicCouple {

    //Metodo String vai ter que retornar uma String, onde é necessario um retorno
    public void iamDeveloper() {
        System.out.println("Meu nome é " + name + ", Atuo profissionalmente como Desenvolvedor de software! ");
    }

    // Método obrigatório da interface

    public void LightEyes() {
        System.out.println(name + " tem olhos claros.");
    }

    // Método obrigatório da interface

    public void SkinColor() {
        System.out.println(name + " Tem tom de pele branca.");
    }
}
