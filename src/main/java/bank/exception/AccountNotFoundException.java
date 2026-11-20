package bank.exception;

/** Thrown when an account id is unknown to the bank. */
public class AccountNotFoundException extends BankException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
