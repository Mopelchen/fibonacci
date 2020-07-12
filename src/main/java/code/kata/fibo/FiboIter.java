package code.kata.fibo;

public class FiboIter {

    public int fibonacci(int index) {
        int fibo_nMinus2 = 1;
        int fibo_nMinus1 = 1;
        int fibo_n = 0;

        if(index == 0) {
            return fibo_nMinus2;
        }

        if(index == 1) {
            return fibo_nMinus1;
        }

        for (int n = 2; n <= index; n++)
        {
            fibo_n = fibo_nMinus2 + fibo_nMinus1;
            fibo_nMinus2 = fibo_nMinus1;
            fibo_nMinus1 = fibo_n;
        }
        return fibo_n;
    }



}
