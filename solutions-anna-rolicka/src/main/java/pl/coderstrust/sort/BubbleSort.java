package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int[] array = {3, 5, 4, 1, 8, 12, 133, 2, 7, 6};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] sort(int[] array){
        boolean swap;
        do{
            swap = false;
            for(int i = 0; i < (array.length - 1); i++){
                for(int j = 1; j < (array.length - 2); j++){
                    while(array[i] > array[i + 1]){
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        swap = true;
                    }
                }
            }
        }while (swap);
         return array;
    }
}
