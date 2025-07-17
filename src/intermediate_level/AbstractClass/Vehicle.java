package intermediate_level.AbstractClass;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected boolean On;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.On = false;
    }

    public abstract void accelerate();

    public abstract void brake();

    public void turnOn() {
        if (!this.On) {
            this.On = true;
            System.out.println(this.model + ": Motor ligado.");
        } else {
            System.out.println(this.model + " já está ligado.");
        }
    }

    public void turnOff() {
        if (this.On) {
            this.On = false;
            System.out.println(this.model + ": Motor desligado.");
        } else {
            System.out.println(this.model + " já está desligado.");
        }
    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
    }
}