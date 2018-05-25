package pl.coderstrust.processor;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)

public class FileProcessorTest{

    @Test
    public void shouldCheckThatFileProcessorReadsLinesFromFile(){
        //given
        FileProcessor fileProcessor = new FileProcessor();
        List<String> expected = Arrays.asList("line 0", "line 1", "line 2");

        //when
        List<String> actual = fileProcessor.readLinesFromFile("src\\test\\resources\\pl\\coderstrust\\processor\\trial_input.txt");

        //then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldCheckThatFileProcessorWritesLinesToFile(){
        //given
        FileProcessor fileProcessor = new FileProcessor();
        List<String> expected = Arrays.asList("line 0", "line 1", "line 2");
        List<String> actual = fileProcessor.readLinesFromFile("src\\test\\resources\\pl\\coderstrust\\processor\\trial_input.txt");

        //when
        fileProcessor.writeLinesToFile(expected, "src\\test\\resources\\pl\\coderstrust\\processor\\trial_output.txt");

        //then
        assertThat(actual, is(expected));
    }
}