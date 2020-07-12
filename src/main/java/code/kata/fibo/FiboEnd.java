package code.kata.fibo;

import static java.lang.String.format;

public class FiboEnd {

    public int fibonacci(int index) {
        long startTime = System.nanoTime();
        int fibo = compute(index, 1, 1);
        long endTime = System.nanoTime();
        System.out.println(format("Computation of fibonacci(%d) took %d ns", index, (endTime - startTime)));

        return fibo;
    }

    private int compute(int index, int fibo_nMinus2, int fibo_nMinus1) {

        if(index == 0 || index == 1) {
            return fibo_nMinus1;
        }

        return compute(index - 1, fibo_nMinus1, fibo_nMinus2 + fibo_nMinus1);
    }
}
