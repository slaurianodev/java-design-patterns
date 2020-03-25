package pt.com.srg.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testAssemble(){
        Car sportsCar = new SportsCar(new BasicCar());
        Assert.assertEquals("Basic Car. Adding features of Sports Car.",sportsCar.assemble());
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        Assert.assertEquals("Basic Car. Adding features of Luxury Car. Adding features of Sports Car.",sportsLuxuryCar.assemble());
    }
}
