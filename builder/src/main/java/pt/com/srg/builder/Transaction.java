package pt.com.srg.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String paymentMethod;
    private String cardNumber;
    private String shoppingLocate;
    private String seller;
    private LocalDateTime transactionDate;
    private BigDecimal value;

    public static class Builder {
        private String paymentMethod;
        private String cardNumber;
        private String shoppingLocate;
        private String seller;
        private LocalDateTime transactionDate;
        private BigDecimal value;

        public Builder(BigDecimal value, LocalDateTime transactionDate) {
            this.value = value;
            this.transactionDate = transactionDate;
        }

        public Builder withPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder withCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder withShoppingLocate(String shoppingLocate) {
            this.shoppingLocate = shoppingLocate;
            return this;
        }

        public Builder withSeller(String seller) {
            this.seller = seller;
            return this;
        }

        public Transaction build() {
            Transaction transaction = new Transaction();
            transaction.paymentMethod = this.paymentMethod;
            transaction.transactionDate = this.transactionDate;
            transaction.cardNumber = this.cardNumber;
            transaction.seller = this.seller;
            transaction.shoppingLocate = this.shoppingLocate;
            transaction.value = this.value;
            return transaction;
        }


    }

    private Transaction() {
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getShoppingLocate() {
        return shoppingLocate;
    }

    public String getSeller() {
        return seller;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public BigDecimal getValue() {
        return value;
    }
}