package bank.exception;

/** Thrown when an account exceeds its monthly withdrawal count. */
public class WithdrawalLimitExceededException extends BankException {
    public WithdrawalLimitExceededException(String message) {
        super(message);
    }
}
