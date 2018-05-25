package pl.coderstrust.solutions.udemy.section3;

public class Stringz {
    public static void main(String[] args){
        String myString = "this is my string";
        System.out.println("My string looks like this: " + myString);
        myString = myString + " and I'm prolonging it now like this.";
        System.out.println("My string looks like this: " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("My string looks like this: " + myString);

        String numberString = "2015";
        numberString = numberString + "10";
        System.out.println("This doesn't really add up: 2015 + 10 is not equal to" + numberString);

        String lastString = "2000.1";
        int myInt = 55;
        lastString = lastString + myInt;
        System.out.println("And neither does this one (2000.1 + 55): " + lastString);
    }
}
