package code.kata.fibo;

import static java.lang.String.format;

public class FiboNaive {

    public int fibonacci(int index) {

        long startTime = System.nanoTime();
        int fibo = compute(index);
        long endTime = System.nanoTime();
        System.out.println(format("Computation of fibonacci(%d) took %d ns", index, (endTime - startTime)));

        return fibo;
    }

    private int compute(int index) {
        if(index == 0 || index == 1) {
            return 1;
        }

        return compute(index - 1) + compute(index - 2);
    }
}
