package pl.coderstrust;

import java.util.ArrayList;
import java.util.List;

public class FooBar {
    public static void main(String[] args) {
        printFooBar(100);
    }
    public static List<String> printFooBar(int i){
        List<String> list = new ArrayList<>();
        for (i = 0; i < 101; i ++) {
            while (true) {
                if ((i % 3 == 0)&& (i % 5 == 0)) {
                    list.add (i + " FooBar");
                }

                else if (i % 3 == 0){
                    list.add (i + " Foo");
                }

                else if (i % 5 == 0) {
                    list.add(i + " Bar");

                } else {
                    list.add("" + i);
                }
                i++;
                if (i>100){
                    list.add("The End");
                    break;
                }

            }
            System.out.println(list);

        }
        return(list);
    }
}

