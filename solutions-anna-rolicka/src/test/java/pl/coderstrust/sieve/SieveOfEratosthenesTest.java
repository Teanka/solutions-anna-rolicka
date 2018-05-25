package pl.coderstrust.sieve;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static pl.coderstrust.sieve.SieveOfEratosthenes.sieve;

public class SieveOfEratosthenesTest{

    @Test
    public void shouldCheckIfReturnedArrayHasRequiredLength(){
        //given
        int [] expected = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127,
                131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197,
                199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
                281, 283, 293};
        int expected1 = expected.length;

        //when
        int [] actual = sieve(300);
        int actual1 = actual.length;

        //then
        assertEquals(expected1, actual1);
    }
    @Test
    public void shouldCalculatePrimeNumbers1To293(){
        //given
        int [] expected = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127,
                131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197,
                199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
                281, 283, 293};

        //when
        int [] actual = sieve(300);

        //then
        assertArrayEquals(expected, actual);
    }
}