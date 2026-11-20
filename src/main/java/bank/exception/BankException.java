package bank.exception;

/** Base class of every business error in the banking domain (checked). */
public class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}
