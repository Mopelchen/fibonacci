package code.kata.fibo;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class FiboMemo {

    public int fibonacci(int index) {
        Map<Integer, Integer> memory = new HashMap<>();
        memory.put(0, 1);
        memory.put(1, 1);

        long startTime = System.nanoTime();
        int fibo = compute(index, memory);
        long endTime = System.nanoTime();
        System.out.println(format("Computation of fibonacci(%d) took %d ns", index, (endTime - startTime)));

        return fibo;
    }

    private int compute(int index, Map<Integer, Integer> memory) {
        if(memory.containsKey(index)) {
            return memory.get(index);
        }

        int result = compute(index - 1, memory) + compute(index - 2, memory);
        memory.put(index, result);

        return result;
    }
}
