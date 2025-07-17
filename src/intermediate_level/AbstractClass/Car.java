package intermediate_level.AbstractClass;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accelerate() {
        if (this.On) {
            System.out.println(this.model + ": Pisando no acelerador! Vruum!");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }

    @Override
    public void brake() {
        System.out.println(this.model + ": Acionando freios ABS...");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Portas: " + this.numberOfDoors);
    }
}
