package pl.coderstrust.solutions.udemy.section4;

public class Statements {
    public static void main(String[] args) {
        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " and still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is yetanother one");
    }
}
