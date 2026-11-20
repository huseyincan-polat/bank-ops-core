package bank.exception;

/** Thrown when a transfer request is not valid, e.g. same source and target. */
public class InvalidTransferException extends BankException {
    public InvalidTransferException(String message) {
        super(message);
    }
}
