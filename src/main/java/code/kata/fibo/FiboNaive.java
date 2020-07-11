package code.kata.fibo;

public class FiboNaive {

    public int fibonacci(int index) {
        if(index == 0 || index == 1) {
            return 1;
        }

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
