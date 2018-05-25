package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(300)));
    }


    public static int[] sieve(int maximumNumber){
        int[] array = new int[maximumNumber + 1];
        for(int i = 0; i < maximumNumber + 1; i++){
            array[i] = i;
        }
        for(int primeSearch = 2; primeSearch < maximumNumber; primeSearch++){
            int crossOut = primeSearch;
            while ((crossOut <= maximumNumber-primeSearch) && (primeSearch <= maximumNumber-crossOut)){
                crossOut += primeSearch;
                array[crossOut] = -1;
            }
        }
        int count = 0;
        for(int i = 0; i < maximumNumber; i++){
            if(array[i] > 0){
                count++;
            }
        }
        int j = 0;
        int[] output = new int [count];
        for(int i = 0; i < maximumNumber; i++){
            if(array[i] > 0){
                output[j] = array[i];
                j++;
            }
        }
        return output;
    }
}
