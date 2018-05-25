package pl.coderstrust;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static pl.coderstrust.MultiplicationTable.printMultiplicationTable;

@RunWith(JUnitParamsRunner.class)
public class MultiplicationTableTest{


    @Test
    public void shouldCheckThatTheTableSize10ContainsNecessaryNumbers(){
        //given
        int size = 10;
        List<String> actual = printMultiplicationTable(size);
        String expected = "\n" + "       1   2   3   4   5   6   7   8   9  10\n" +
                "\n" + "   1   1   2   3   4   5   6   7   8   9  10\n" +
                "   2   2   4   6   8  10  12  14  16  18  20\n" +
                "   3   3   6   9  12  15  18  21  24  27  30\n" +
                "   4   4   8  12  16  20  24  28  32  36  40\n" +
                "   5   5  10  15  20  25  30  35  40  45  50\n" +
                "   6   6  12  18  24  30  36  42  48  54  60\n" +
                "   7   7  14  21  28  35  42  49  56  63  70\n" +
                "   8   8  16  24  32  40  48  56  64  72  80\n" +
                "   9   9  18  27  36  45  54  63  72  81  90\n" +
                "  10  10  20  30  40  50  60  70  80  90 100\n";

        //when
        String given = actual.get(actual.size() - 1);

        //then

        assertThat(actual, contains(expected));
        assertEquals(expected, given);
    }

    @Parameters({"5", "10", "20", "-2"})
    @Test
    public void whateverValueYouProvideTheSizeOfMultiplicationTableIsAlwaysOne(int size){
        //given


        //when
        List<String> actual = printMultiplicationTable(size);

        //then
        assertEquals(actual.size(), 1);
    }

    @Parameters({"-20", "-1"})
    @Test
    public void shouldCheckIfClassFunctionsForNegativeNumbers(int size){
        //given
        String expected = "Not a valid number";

        //when
        List<String> actual = printMultiplicationTable(size);
        String given = actual.get(actual.size() - 1);

        //then
        assertEquals(expected, given);
    }

}