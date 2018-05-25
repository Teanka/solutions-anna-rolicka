package pl.coderstrust.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static pl.coderstrust.fibonacci.FibonacciIterative.fibonacci;

@RunWith(JUnitParamsRunner.class)

public class FibonacciIterativeTest{
    @Test
    public void ShouldCheckIfClassFunctionsForNegativeNumbers(){
        //given
        long expected = -1;

        //when
        long actual = fibonacci(-66);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldCheckIfClassFunctionsForZero(){
        //given
        long expected = 0;

        //when
        long actual = fibonacci(0);

        //then
        assertEquals(expected, actual);

    }

    @Test
    @Parameters({"-27", "-1", "0", "1", "5", "10", "15", "20"})
    public void ShouldCheckIfResultIsTheSameAsWhenUsingFibonacciRecursiveClass(int fibonacciNumberInOrder){
        //given
        long expected = FibonacciRecursive.fibonacci(fibonacciNumberInOrder);

        //when
        long actual = FibonacciIterative.fibonacci(fibonacciNumberInOrder);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @Parameters({"0, 0", "5, 5", "55, 10"})
    public void ShouldCheckIfResultsAreCorrectForNumbersProvided(long param, int fibonacciNumberInOrder){
        //given
        long expected = param;

        //when
        long actual = FibonacciIterative.fibonacci(fibonacciNumberInOrder);

        //then
        assertEquals(expected, actual);
    }
}

