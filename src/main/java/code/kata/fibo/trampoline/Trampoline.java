package code.kata.fibo.trampoline;

public interface Trampoline<T>
{
    T get();

    default Trampoline<T> jump() {
        return this;
    }

    default boolean complete() {
        return true;
    }

    static <T> Trampoline<T> stopBouncing(final T result) {
        return () -> result;
    }

    static <T> Trampoline<T> keepBouncing(final Trampoline<Trampoline<T>> trampoline) {
        return new Trampoline<>() {
            @Override
            public boolean complete() {
                return false;
            }

            @Override
            public Trampoline<T> jump() {
                return trampoline.get();
            }

            @Override
            public T get() {
                return trampoline(this);
            }

            private T trampoline(final Trampoline<T> trampoline) {

                Trampoline<T> t = trampoline;

                while(!t.complete()) {
                    t = t.jump();
                }

                return t.get();
            }

/*            T trampoline(final Trampoline<T> trampoline) {
                return Stream.iterate(trampoline, Trampoline::jump)
                        .filter(Trampoline::complete)
                        .findFirst()
                        .map(Trampoline::result)
                        .orElseThrow();
            }*/
        };
    }
}
