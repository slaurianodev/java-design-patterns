package pt.com.srg.builder;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BuilderTest {
    @Test
    public void testBuild() {
        Transaction transaction = new Transaction
                .Builder(BigDecimal.TEN, LocalDateTime.now())
                .withSeller("Vendinha da Tia")
                .withShoppingLocate("Saldanha")
                .build();
        Assert.assertEquals("Vendinha da Tia",transaction.getSeller());
        Assert.assertEquals("Saldanha",transaction.getShoppingLocate());
    }

    @Test
    public void testBuildLombok() {
        TransactionLombok transaction = TransactionLombok.builder()
                .seller("Vendinha da Tia")
                .shoppingLocate("Saldanha")
                .build();
        Assert.assertEquals("Vendinha da Tia",transaction.getSeller());
        Assert.assertEquals("Saldanha",transaction.getShoppingLocate());
    }
}
