package answer5;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {}
    public NegativeBalanceException(String message) {
        super(message);
    }
}
