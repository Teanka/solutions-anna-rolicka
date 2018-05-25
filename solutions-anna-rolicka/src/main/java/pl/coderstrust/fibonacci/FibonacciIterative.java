package pl.coderstrust.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(40));
        System.out.println(fibonacci(-66));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        List<Long> result = new ArrayList<>();
        long fibPreviousNumber = 0;
        result.add(fibPreviousNumber);
        long fibCurrentNumber = 1;
        result.add(fibCurrentNumber);
        if (fibonacciNumberInOrder < 0) {
            return -1;
        } else {
            if (fibonacciNumberInOrder == 0) {
                result.remove(result.size() - 1);
                return result.get(result.size() - 1);
            } else {
                for (int fibIteration = 2; fibIteration <= fibonacciNumberInOrder; fibIteration++) {
                    long fibTemp = fibCurrentNumber;
                    fibCurrentNumber = fibPreviousNumber + fibCurrentNumber;
                    result.add(fibCurrentNumber);
                    fibPreviousNumber = fibTemp;
                }
            }
            return result.get(result.size() - 1);
        }
    }
}


