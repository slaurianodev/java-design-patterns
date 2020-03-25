package pt.com.srg.decorator;

public class BasicCar implements Car {
    @Override
    public String assemble() {
        return "Basic Car.";
    }
}
