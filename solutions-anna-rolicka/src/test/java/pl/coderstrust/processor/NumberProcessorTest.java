package pl.coderstrust.processor;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)

public class NumberProcessorTest{

    @Test
    @Parameters(method = "parametersForNumberProcessorTest")

    public void shouldCheckIfLineIsProcessedAsExpected(String given, String expected){
        //given
        NumberProcessor numberProcessor = new NumberProcessor();

        //when
        String actual = numberProcessor.processLine(given);

        //then
        assertThat(actual, is(expected));
    }

    @Parameters
    private Object parametersForNumberProcessorTest(){
        return new Object[]{new Object[]{new String("1 2 3 4 5"), new String("1 + 2 + 3 + 4 + 5 = 15")}, new Object[]{new String("      1 22   2      3      5      7     11     13     17     19     23     29"), new String("1 + 22 + 2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 + 29 = 152"),}};
    }
}
