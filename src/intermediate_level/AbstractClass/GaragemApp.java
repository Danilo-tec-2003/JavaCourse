package intermediate_level.AbstractClass;

public class GaragemApp {
    public static void main(String[] args) {

        // Criamos objetos das classes concretas
        Vehicle meuCarro = new Car("Ford", "Mustang", 2);
        Vehicle minhaMoto = new Motorcycle("Honda", "CB 500", 500);

        Vehicle[] minhaGaragem = { meuCarro, minhaMoto };

        for (Vehicle v : minhaGaragem) {
            System.out.println("\n--- Testando o " + v.model + " ---");
            v.showDetails();
            v.turnOn();
            v.accelerate();
            v.brake();
            v.turnOff();
            System.out.println("--------------------------");
        }
    }
}
