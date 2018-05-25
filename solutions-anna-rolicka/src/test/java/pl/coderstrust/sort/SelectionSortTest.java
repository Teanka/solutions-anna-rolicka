package pl.coderstrust.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SelectionSortTest{

    @Test
    @Parameters (method = "parametersForSortTest")
    public void shouldSortTheArrayProvided(int[]input, int[]expected){
        //given

        //when
        int[]actual = new SelectionSort().sort(input);

        //then
        assertArrayEquals("Array should be sorted", expected, actual);
    }

    @Test
    @Parameters (method = "parametersForSortTest")
    public void shouldCheckIfSortedArrayHasTheExpectedLength(int[]input, int[]expected){
        //given

        //when
        int[]actual = new SelectionSort().sort(input);

        //then
        assertEquals("Arrays should have equal length", expected.length, actual.length);
    }

    @Test
    public void shouldSortRandomlyProvidedNumbers(){
        //given
         int [] input = randomNumbersArray(100000);

         int[] expected = BubbleSort.sort(input);

        //when
        int[]actual = new SelectionSort().sort(input);

        //then
        assertArrayEquals("Array should be sorted", expected, actual);
    }

    private int[] randomNumbersArray(int n){
        n = 1000;
        Random r = new Random();
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++){
            newArray[i] = r.nextInt(1000);
        }
        return newArray;
    }

    private Object parametersForSortTest(){

        return new Object[]{
                new Object[]{
                        new int[]{3, 5, 4, 1, 8, 12, 133, 2, 7, 6},
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 12, 133}
        },
                new Object[]{
                        new int[]{1, 2, 3, 4, 5, 6},
                        new int[]{1, 2, 3, 4, 5, 6}
                },
                new Object[]{
                        new int[]{22, 15, 13, 6, 4, 2, -1, -28},
                        new int[]{-28, -1, 2, 4, 6, 13, 15, 22}
                },
        };
    }
}
