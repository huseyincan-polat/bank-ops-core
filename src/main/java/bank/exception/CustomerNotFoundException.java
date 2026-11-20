package bank.exception;

/** Thrown when a customer id is unknown to the bank. */
public class CustomerNotFoundException extends BankException {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
