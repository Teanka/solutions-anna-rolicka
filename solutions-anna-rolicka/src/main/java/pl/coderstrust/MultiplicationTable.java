package pl.coderstrust;

import java.util.*;

public class MultiplicationTable{
    public static void main(String[] args){
        System.out.println(printMultiplicationTable(4));
        System.out.println(printMultiplicationTable(10));
        System.out.println(printMultiplicationTable(20));
        System.out.println(printMultiplicationTable(-2));
        System.out.println(printMultiplicationTable(2));
    }

    public static List<String> printMultiplicationTable(int size){
        List<String> list = new ArrayList<>();
        List<String> empty = Collections.singletonList("Not a valid number");
        if(size < 2){
            return empty;
        }else{
            StringBuilder sb = new StringBuilder();
            Formatter fmt = new Formatter(sb);
            fmt.format("\n");
            fmt.format("    ");
            for(int n = 1; n <= size; n++){
                fmt.format("%4d", n);
            }
            fmt.format("\n");
            fmt.format("\n");
            for(int n = 1; n <= size; n++){
                fmt.format("%4d", n);
                for(int i = 1; i <= size; i++){
                    fmt.format("%4d", (n * i));
                }
                fmt.format("\n");
            }
            list.add(sb.toString());
            return list;
        }
    }
}

