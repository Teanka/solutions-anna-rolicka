package pl.coderstrust.processor;

public class NumberProcessor{
    public String processLine(String line){
        String[] numbersArray = line.trim().split("\\s+");
        int sum = 0;
        for(String number : numbersArray){
            Integer n = Integer.parseInt(number);
            sum += n;
        }
        line = line.trim().replaceAll("\\s+", " + ") + " = " + sum;
        return line;
    }
}
