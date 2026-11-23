package bank.account;

import java.math.BigDecimal;
import java.time.LocalDate;

/** Immutable record of one balance change. */
public final class Transaction {
    private final String id;
    private final TransactionType type;
    private final BigDecimal amount;
    private final LocalDate date;
    private final BigDecimal balanceAfter;

    public Transaction(String id, TransactionType type, BigDecimal amount,
                       LocalDate date, BigDecimal balanceAfter) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.balanceAfter = balanceAfter;
    }

    public String getId() { return id; }
    public TransactionType getType() { return type; }
    public BigDecimal getAmount() { return amount; }
    public LocalDate getDate() { return date; }
    public BigDecimal getBalanceAfter() { return balanceAfter; }
}
