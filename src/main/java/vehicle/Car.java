package vehicle;

public class Car extends Vehicle{

    private Engine engine;
    private Door door;
    private Gear gear;

    public Car(String name, double price, String colour, Wheel wheel, Break breaks, Engine engine, Door door, Gear gear) {
        super(name, price, colour, wheel, breaks);
        this.engine = engine;
        this.door = door;
        this.gear = gear;
    }
}
