package pt.com.srg.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@ToString
public class TransactionLombok {
    private String paymentMethod;
    private String cardNumber;
    private String shoppingLocate;
    private String seller;
    private LocalDateTime transactionDate;
    private BigDecimal value;
}
