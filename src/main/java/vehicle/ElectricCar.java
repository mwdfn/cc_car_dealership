package vehicle;

public class ElectricCar extends Vehicle{

    private Motor motor;
    private Door door;


    public ElectricCar(String name, double price, String colour, Wheel wheel, Break breaks, Motor motor, Door door) {
        super(name, price, colour, wheel, breaks);
        this.motor = motor;
        this.door = door;

    }

    public Motor getMotor() {
        return motor;
    }

    public int getCarsWheels() {
        return wheel.getNumberOfWheels();
    }
}

