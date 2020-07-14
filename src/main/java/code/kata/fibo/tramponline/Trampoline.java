package code.kata.fibo.tramponline;

import java.util.stream.Stream;

public interface Trampoline<T> {

    T get();

    default Trampoline<T> bounce() {
        return this;
    }

    default T result() {
        return get();
    }

    default boolean done() {
        return true;
    }

    static <T> Trampoline<T> stopBouncing(final T result) {
        return () -> result;
    }

    static <T> Trampoline<T> keepBouncing(final Trampoline<Trampoline<T>> trampoline) {
        return new Trampoline<>() {
            @Override
            public boolean done() {
                return false;
            }

            @Override
            public Trampoline<T> bounce() {
                return trampoline.result();
            }

            @Override
            public T get() {
                return trampoline(this);
            }

            T trampoline(final Trampoline<T> trampoline) {
                return Stream.iterate(trampoline, Trampoline::bounce)
                        .filter(Trampoline::done)
                        .findFirst()
                        .map(Trampoline::result)
                        .orElseThrow();
            }
        };
    }

}
