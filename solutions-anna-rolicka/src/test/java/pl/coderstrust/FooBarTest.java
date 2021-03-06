package pl.coderstrust;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.endsWith;
import static pl.coderstrust.FooBar.printFooBar;

public class FooBarTest {

    @Test
    public void shouldCheckIfFooBarListResultIsCorrect(){
        // given
        List<String> expected = Arrays.asList("0 FooBar", "1", "2", "3 Foo", "4", "5 Bar", "6 Foo", "7", "8", "9 Foo", "10 Bar", "11", "12 Foo", "13", "14", "15 FooBar", "16", "17", "18 Foo", "19", "20 Bar", "21 Foo", "22", "23", "24 Foo", "25 Bar", "26", "27 Foo", "28", "29", "30 FooBar", "31", "32", "33 Foo", "34", "35 Bar", "36 Foo", "37", "38", "39 Foo", "40 Bar", "41", "42 Foo", "43", "44", "45 FooBar", "46", "47", "48 Foo", "49", "50 Bar", "51 Foo", "52", "53", "54 Foo", "55 Bar", "56", "57 Foo", "58", "59", "60 FooBar", "61", "62", "63 Foo", "64", "65 Bar", "66 Foo", "67", "68", "69 Foo", "70 Bar", "71", "72 Foo", "73", "74", "75 FooBar", "76", "77", "78 Foo", "79", "80 Bar", "81 Foo", "82", "83", "84 Foo", "85 Bar", "86", "87 Foo", "88", "89", "90 FooBar", "91", "92", "93 Foo", "94", "95 Bar", "96 Foo", "97", "98", "99 Foo", "100 Bar", "The End");

        //when
        List<String> result = printFooBar(100);

        // then
        assertThat(result, contains(expected.toArray()));
    }
    @Test
    public void shouldCheckIfFooBarListContainsFooAndBar(){
        // given

        //when
        List<String> result = printFooBar(100);
        // then

        assertThat(result, hasItems(endsWith("Bar"), endsWith("Foo")));
    }
    @Test
    public void shouldCheckIfFooBarListResultContains102Elements() {
        // given

        //when
        List<String> result = printFooBar(102);

        // then
        assertThat(result.size(), is(102));
    }
}


