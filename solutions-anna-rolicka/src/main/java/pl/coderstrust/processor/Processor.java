package pl.coderstrust.processor;


import java.util.ArrayList;
import java.util.List;

public class Processor{

    private NumberProcessor numberProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumberProcessor numberProcessor, FileProcessor fileProcessor){

        this.numberProcessor = numberProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String fileName, String resultFileName){
        List<String> linesFromFile = fileProcessor.readLinesFromFile(fileName);
        List<String> resultLines = new ArrayList<>();
        for(String line : linesFromFile){
            if(line.matches("[\\d\\s]+")){
                resultLines.add(numberProcessor.processLine(line));
            }
        }
        fileProcessor.writeLinesToFile(resultLines, resultFileName);
    }
}
