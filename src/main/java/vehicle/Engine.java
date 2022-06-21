package vehicle;

import behaviour.IConnectParts;

public class Engine implements IConnectParts {

    private int horsepower;
    private double litres;

    public Engine(int horsepower, double litres) {
        this.horsepower = horsepower;
        this.litres = litres;
    }

    public String connectPart(String part){
        return "";
    }
}
