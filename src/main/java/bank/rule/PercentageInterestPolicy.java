package bank.rule;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** Fixed monthly rate on positive balances; nothing is earned on zero or negative balances. */
public class PercentageInterestPolicy implements InterestPolicy {
    private final BigDecimal monthlyRate;

    public PercentageInterestPolicy(BigDecimal monthlyRate) {
        if (monthlyRate == null || monthlyRate.signum() < 0) {
            throw new IllegalArgumentException("rate must be >= 0");
        }
        this.monthlyRate = monthlyRate;
    }

    @Override
    public BigDecimal monthlyInterest(BigDecimal balance) {
        if (balance.signum() <= 0) {
            return BigDecimal.ZERO.setScale(2);
        }
        return balance.multiply(monthlyRate).setScale(2, RoundingMode.HALF_UP);
    }
}
