package pl.coderstrust;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static pl.coderstrust.Christmas.printChristmasTree;

@RunWith(JUnitParamsRunner.class)
public class ChristmasTest{

    @Parameters({"-20", "-1"})
    @Test
    public void shouldCheckIfClassFunctionsForNegativeNumbers(int size){
        //given
        String expected = "Not a valid number";

        //when
        List<String> actual = printChristmasTree(size);
        String given = actual.get(actual.size() - 1);

        //then
        assertEquals(expected, given);
    }

    @Parameters({"5", "10", "20", "-2"})
    @Test
    public void whateverValueYouProvideTheSizeOfChristmasTreeItemIsAlwaysOne(int size){
        //given


        //when
        List<String> actual = printChristmasTree(size);

        //then
        assertEquals(actual.size(), 1);
    }


    @Test
    public void shouldCheckThatTheTableSize10ContainsNecessaryNumbers(){
        //given
        int size = 10;
        List<String> actual = printChristmasTree(size);
        String expected = "\n          *\n         ***\n" +
                "        *****\n       *******\n      *********\n" +
                "     ***********\n    *************\n   ***************\n" +
                "  *****************\n *******************\n         **\n";
        
        //when
        String given = actual.get(actual.size() - 1);

        //then

        assertThat(actual, contains(expected));
    }


}

