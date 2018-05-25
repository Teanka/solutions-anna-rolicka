package pl.coderstrust;

import java.util.Formatter;

public class PascalTriangle{
    public static void main(String[] args){
        System.out.println(printPascalTriangle(5));
        System.out.println(printPascalTriangle(8));
        System.out.println(printPascalTriangle(12));
        System.out.println(printPascalTriangle(-3));
    }

    public static String printPascalTriangle(int size){
        //List<String> list = new ArrayList<>();
        //List<String> empty = Collections.singletonList("Not a valid number");

        String empty = "Not a valid number";
        if(size < 2){
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
                for(int k = 0; k <= n; k++){
                    long term = fact(n) / (fact(k) * fact(n - k));
                    fmt.format("%4s ", " " + term);
                }
                fmt.format("\n");
                n++;
            }
            return sb.toString();
        }
    }

    public static long fact(int n){
        if(n == 0){
            return 1;
        }else{
            return (n * fact(n - 1));
        }
    }
}
