package pl.coderstrust.processor;

import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class ProcessorTest{

    @Test
    public void shouldCheckIfProcessorWorks(){

        FileProcessor fileProcessor = mock(FileProcessor.class);
        NumberProcessor numberProcessor = mock(NumberProcessor.class);
        Processor processor = new Processor(numberProcessor, fileProcessor);
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        when(fileProcessor.readLinesFromFile(inputFile)).thenReturn(Arrays.asList("1", "2", "3"));

        //when
        processor.process(inputFile, outputFile);


        // then
        verify(fileProcessor).readLinesFromFile(inputFile);
        verify(numberProcessor, times(3)).processLine(any());
        verify(fileProcessor).writeLinesToFile(any(), eq(outputFile));
    }

}