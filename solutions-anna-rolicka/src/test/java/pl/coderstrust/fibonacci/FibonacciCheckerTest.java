package pl.coderstrust.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)

public class FibonacciCheckerTest{
    @Test
    public void shouldCheckIfClassFunctionsForNegativeNumbers(){
        //given
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean expected = false;

        //when
        boolean actual = fibonacciChecker.isFibonacciNumber(-66);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldCheckIfClassFunctionsForZero(){
        //given
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean expected = true;

        //when
        boolean actual = fibonacciChecker.isFibonacciNumber(0);

        //then
        assertEquals(expected, actual);

    }


    @Test
    @Parameters({"true, 5", "true, 121393", "false, 121395"})
    public void shouldCheckIfResultsAreCorrectForNumbersProvided(boolean param, int number){
        //given
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean expected = param;

        //when
        boolean actual = fibonacciChecker.isFibonacciNumber(number);

        //then
        assertEquals(expected, actual);
    }
}

