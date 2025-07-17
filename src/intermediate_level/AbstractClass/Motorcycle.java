package intermediate_level.AbstractClass;

public class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(String brand, String model, int cylinderCapacity) {
        super(brand, model);
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public void accelerate() {
        if (this.On) {
            System.out.println(this.model + ": Girando a manopla! Raaanndandandan!");
        } else {
            System.out.println("Não é possível acelerar, a moto está desligada.");
        }
    }

    @Override
    public void brake() {
        System.out.println(this.model + ": Acionando freio a disco...");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Cilindradas: " + this.cylinderCapacity);
    }
}
