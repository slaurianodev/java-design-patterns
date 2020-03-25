package pt.com.srg.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testFactory(){
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        Assert.assertEquals("Factory PC Config::RAM= 2 GB, HDD=500 GB, CPU=2.4 GHz", "Factory PC Config::"+pc);
        Assert.assertEquals("Factory Server Config::RAM= 16 GB, HDD=1 TB, CPU=2.9 GHz","Factory Server Config::"+server);
    }
}
