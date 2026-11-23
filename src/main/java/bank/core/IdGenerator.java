package bank.core;

/** Injected so ids are deterministic in tests. */
public interface IdGenerator {
    String next(String prefix);
}
