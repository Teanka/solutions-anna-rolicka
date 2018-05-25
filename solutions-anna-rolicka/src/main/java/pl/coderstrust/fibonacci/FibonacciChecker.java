package pl.coderstrust.fibonacci;

import java.util.HashSet;

public class FibonacciChecker{
    public static void main(String[] args){
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        System.out.println(fibonacciChecker.isFibonacciNumber(-22));
        System.out.println(fibonacciChecker.isFibonacciNumber(0));
        System.out.println(fibonacciChecker.isFibonacciNumber(1));
        System.out.println(fibonacciChecker.isFibonacciNumber(35));
        System.out.println(fibonacciChecker.isFibonacciNumber(5));
        System.out.println(fibonacciChecker.isFibonacciNumber(121393));
        System.out.println(fibonacciChecker.isFibonacciNumber(121395));
        System.out.println(fibonacciChecker.isFibonacciNumber(1134903170));
        System.out.println(fibonacciChecker.isFibonacciNumber(1548008755920L));
        System.out.println(fibonacciChecker.isFibonacciNumber(127346));
    }

    private HashSet<Long> fibList = new HashSet<>();
    private long fibPreviousNumber = 0;
    private long fibCurrentNumber = 1;

    private void fibonacciSequenceGenerator(long number){
        while(fibCurrentNumber <= number){
            long fibTemp = fibCurrentNumber;
            fibCurrentNumber = fibPreviousNumber + fibCurrentNumber;
            fibPreviousNumber = fibTemp;
            fibList.add(fibCurrentNumber);
        }
    }

    boolean isFibonacciNumber(long number){
        if(fibList.isEmpty()){
            fibList.add(fibPreviousNumber);
            fibList.add(fibCurrentNumber);
        }
        fibonacciSequenceGenerator(number);
        return (fibList.contains(number));
    }
}

