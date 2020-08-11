package code.kata.fibo;

import code.kata.fibo.trampoline.Trampoline;

import static java.lang.String.format;

public class FiboBounce {

    public Long fibonacci(Integer index) {

        long startTime = System.nanoTime();
        Long fibo = compute(index, 1L, 1L).get();
        long endTime = System.nanoTime();
        System.out.println(format("Computation of fibonacci(%d) took %d ns", index, (endTime - startTime)));

        return fibo;
    }

    private Trampoline<Long> compute(Integer index, Long fibo_nMinus2, Long fibo_nMinus1) {
        if(index == 0 || index == 1) {
            return Trampoline.stopBouncing(fibo_nMinus1);
        }

        return Trampoline.keepBouncing(
                () -> compute(index - 1, fibo_nMinus1, fibo_nMinus2 + fibo_nMinus1));
    }
}
