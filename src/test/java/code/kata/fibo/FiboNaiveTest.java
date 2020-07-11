package code.kata.fibo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FiboNaiveTest {

    private FiboNaive fiboTest = new FiboNaive();

    @Test
    public void test_fibonacci_given0_thenReturn1() {
        assertThat(fiboTest.fibonacci(0)).isEqualTo(1);
    }

    @Test
    public void test_fibonacci_given1_thenReturn1() {
        assertThat(fiboTest.fibonacci(1)).isEqualTo(1);
    }

    @Test
    public void test_fibonacci_given2_thenReturn2() {
        assertThat(fiboTest.fibonacci(2)).isEqualTo(2);
    }

    @Test
    public void test_fibonacci_given3_thenReturn3() {
        assertThat(fiboTest.fibonacci(3)).isEqualTo(3);
    }

    @Test
    public void test_fibonacci_given4_thenReturn4() {
        assertThat(fiboTest.fibonacci(4)).isEqualTo(5);
    }

    @Test
    public void test_fibonacci_given5_thenReturn8() {
        assertThat(fiboTest.fibonacci(5)).isEqualTo(8);
    }

    @Test
    public void test_fibonacci_given6_thenReturn13() {
        assertThat(fiboTest.fibonacci(6)).isEqualTo(13);
    }

    @Test
    public void test_fibonacci_given7_thenReturn21() {
        assertThat(fiboTest.fibonacci(7)).isEqualTo(21);
    }

    @Test
    public void test_fibonacci_given8_thenReturn34() {
        assertThat(fiboTest.fibonacci(8)).isEqualTo(34);
    }

    @Test
    public void test_fibonacci_given9_thenReturn55() {
        assertThat(fiboTest.fibonacci(9)).isEqualTo(55);
    }

    @Test
    public void test_fibonacci_given10_thenReturn89() {
        assertThat(fiboTest.fibonacci(10)).isEqualTo(89);
    }

}