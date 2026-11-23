package bank.core;

public class SequentialIdGenerator implements IdGenerator {
    private int counter = 0;

    @Override
    public String next(String prefix) {
        return prefix + "-" + (++counter);
    }
}
