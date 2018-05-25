package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        int[] array = {3, 4, 5, 1, 8, 12, 133, 2, 7, 6};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sort(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            int minimalValueIndex = i;

            for(int j = i + 1; j < (array.length); j++){
                if(array[j] < array[minimalValueIndex]){
                    minimalValueIndex = j;
                }
            }
            if(minimalValueIndex != i){
                int temp = array[i];
                array[i] = array[minimalValueIndex];
                array[minimalValueIndex] = temp;
            }
        }
        return array;
    }
}




