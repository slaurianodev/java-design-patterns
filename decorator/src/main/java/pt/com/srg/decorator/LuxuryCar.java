package pt.com.srg.decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return car.assemble() + " Adding features of Luxury Car.";
    }
}
