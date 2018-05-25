package pl.coderstrust;

import java.util.*;

public class Christmas{
    public static void main(String[] args){
        System.out.println(printChristmasTree(5));
        System.out.println(printChristmasTree(10));
        System.out.println(printChristmasTree(15));
        System.out.println(printChristmasTree(1));
    }

    public static List<String> printChristmasTree(int size){
        List<String> list = new ArrayList<>();
        List<String> empty = Collections.singletonList("Not a valid number");
        if(size < 3){
            return empty;
        }else{
            StringBuilder sb = new StringBuilder();
            Formatter fmt = new Formatter(sb);
            fmt.format("\n");
            int n = 0;
            while(n < size){

                for(int i = size; i > n; i--){
                    fmt.format(" ");
                }
                for(int j = 0; j < (n * 2 + 1); j++){
                    fmt.format("*");
                }
                fmt.format("\n");
                n++;
            }

            fmt.format("%" + (size + 1) + "s", "**");
            fmt.format("\n");
            list.add(sb.toString());
        }
        return list;
    }
}