package pl.coderstrust.processor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor{
    public List<String> readLinesFromFile(String fileName){
        List<String> line = new ArrayList<>();
        try(Scanner inputFile = new Scanner(new File(fileName))){
            while(inputFile.hasNextLine()){
                line.add(inputFile.nextLine());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return line;
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName){
        Path file = Paths.get(resultFileName);
        try{
            Files.write(file, resultLines, Charset.forName("UTF-8"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
