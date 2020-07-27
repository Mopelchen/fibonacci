package code.kata.fibo;

import static java.lang.String.format;

public class FiboEnd {

    public Long fibonacci(int index) {
        long startTime = System.nanoTime();
        Long fibo = compute(index, 1L, 1L);
        long endTime = System.nanoTime();
        System.out.println(format("Computation of fibonacci(%d) took %d ns", index, (endTime - startTime)));

        return fibo;
    }

    private Long compute(int index, Long fibo_nMinus2, Long fibo_nMinus1) {

        if(index == 0 || index == 1) {
            return fibo_nMinus1;
        }

        return compute(index - 1, fibo_nMinus1, fibo_nMinus2 + fibo_nMinus1);
    }
}
