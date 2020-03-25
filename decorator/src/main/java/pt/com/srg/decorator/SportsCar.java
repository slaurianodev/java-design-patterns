package pt.com.srg.decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String  assemble() {
        return car.assemble() + " Adding features of Sports Car.";
    }
}
