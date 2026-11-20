package bank.exception;

/** Thrown when the balance (plus any overdraft) cannot cover a debit. */
public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
