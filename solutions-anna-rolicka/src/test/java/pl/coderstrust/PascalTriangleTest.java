package pl.coderstrust;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static pl.coderstrust.PascalTriangle.printPascalTriangle;


@RunWith(JUnitParamsRunner.class)
public class PascalTriangleTest{

    @Parameters({"-20", "-1"})
    @Test
    public void shouldCheckIfClassFunctionsForNegativeNumbers(int size){
        //given
        String expected = "Not a valid number";

        //when
        String actual = printPascalTriangle(-2);

        //then
        assertEquals(expected, actual);
    }

    @Parameters({"5", "10", "20"})
    @Test
    public void shouldCheckIfPascalTriangleContainsExpectedSubstring(int size){
        //given


        //when
        String actual = printPascalTriangle(size);

        //then
        assertThat(actual, containsString("        1"));
    }
    @Test
    public void shouldCheckThatTheTriangleSize10ContainsNecessaryNumbers(){
        //given
        int size = 10;
        String expected = "             1 \n" +
                "            1    1 \n" +
                "           1    2    1 \n" +
                "          1    3    3    1 \n" +
                "         1    4    6    4    1 \n" +
                "        1    5   10   10    5    1 \n" +
                "       1    6   15   20   15    6    1 \n" +
                "      1    7   21   35   35   21    7    1 \n" +
                "     1    8   28   56   70   56   28    8    1 \n" +
                "    1    9   36   84  126  126   84   36    9    1";

        //when
        String actual = printPascalTriangle(size);

        //then
        assertThat(actual, containsString(expected));
    }
}

