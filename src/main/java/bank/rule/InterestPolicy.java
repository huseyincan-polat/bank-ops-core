package bank.rule;

import java.math.BigDecimal;

/** Strategy: how much interest an account earns for one month. */
public interface InterestPolicy {
    BigDecimal monthlyInterest(BigDecimal balance);
}
