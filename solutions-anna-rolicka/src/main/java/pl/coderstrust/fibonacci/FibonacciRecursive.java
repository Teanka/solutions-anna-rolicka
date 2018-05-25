package pl.coderstrust.fibonacci;

public class FibonacciRecursive{
    public static void main(String[] args){
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(40));
        System.out.println(fibonacci(-66));
    }

    public static long fibonacci(int fibonacciNumberInOrder){

        if(fibonacciNumberInOrder >= 2){
            long fibNumber = fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
            return fibNumber;
        }else if(fibonacciNumberInOrder == 0){
            return 0;
        }else if(fibonacciNumberInOrder == 1){
            return 1;
        }else{
            return -1;
        }
    }
}

