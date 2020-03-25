package pt.com.srg.decorator;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public String assemble() {
        return this.car.assemble();
    }
}
