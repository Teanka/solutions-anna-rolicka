package pl.coderstrust.processor;

public class Main{
    public static void main(String[] args){
        FileProcessor fileProcessor = new FileProcessor();
        NumberProcessor numberProcessor = new NumberProcessor();
        Processor processor = new Processor(numberProcessor, fileProcessor);
        processor.process("src\\main\\resources\\Primes.txt", "src\\main\\resources\\PrimesSumResult.txt");
    }
}
