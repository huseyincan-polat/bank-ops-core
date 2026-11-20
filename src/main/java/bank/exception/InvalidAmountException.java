package bank.exception;

/** Thrown when an amount is null, zero or negative. */
public class InvalidAmountException extends BankException {
    public InvalidAmountException(String message) {
        super(message);
    }
}
