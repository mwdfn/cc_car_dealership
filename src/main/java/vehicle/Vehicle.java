package vehicle;

public class Vehicle {

    private String name;
    private double price;
    private String colour;
    protected Wheel wheel;
    private Break breaks;

    public Vehicle(String name, double price, String colour, Wheel wheel, Break breaks) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.wheel = wheel;
        this.breaks = breaks;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int get
}
