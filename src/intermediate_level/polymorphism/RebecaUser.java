package intermediate_level.polymorphism;

public class RebecaUser extends User{

    @Override //anotação que sobreescre, essencial pra polimorfismo e reutilização de codigo
    public void TalentPerson() {
        System.out.println(name + "tem um talento especial: uma criatividade fora do comum!");
    }
}
