package bank.exception;

/** Thrown when an operation is attempted on a frozen account. */
public class AccountFrozenException extends BankException {
    public AccountFrozenException(String message) {
        super(message);
    }
}
