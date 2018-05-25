package pl.coderstrust.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class FibonacciRecursiveTest {

    @Test
    public void ShouldCheckIfClassFunctionsForNegativeNumbers() {
        //given
        long expected = -1;

        //when
        long actual = FibonacciRecursive.fibonacci(-6);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckIfClassFunctionsForZero() {
        //given
        long expected = 0;

        //when
        long actual = FibonacciRecursive.fibonacci(0);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @Parameters({"0", "1", "5", "10", "15", "20"})
    public void ShouldCheckIfResultIsTheSameAsWhenUsingFibonacciIterativeClass(int fibonacciNumberInOrder) {
        //given
        long actual;
        actual = FibonacciIterative.fibonacci(fibonacciNumberInOrder);

        //when
        long expected;
        expected = FibonacciRecursive.fibonacci(fibonacciNumberInOrder);

        //then
        assertThat(expected, is(actual));
    }
}
