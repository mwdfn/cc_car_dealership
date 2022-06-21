package vehicle;

public class MotorBike extends Vehicle {

    private Engine engine;
    private Gear gear;

    public MotorBike(String name, double price, String colour, Wheel wheel, Break breaks, Engine engine, Gear gear) {
        super(name, price, colour, wheel, breaks);
        this.engine = engine;
        this.gear = gear;
    }
}
