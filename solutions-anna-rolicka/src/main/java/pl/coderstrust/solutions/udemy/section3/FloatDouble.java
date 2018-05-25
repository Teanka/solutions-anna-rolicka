package pl.coderstrust.solutions.udemy.section3;

public class FloatDouble {
    public static void main(String[] args) {
        int myInt = 5/3;

        // width of Int = 32 (4 bytes)

        float myFloat = 5.0f/3f;

        // width of float = 32 (4 bytes) 7 units of precision

        double myDouble = 5.0d/3d;

        // width of double = 64 (8 bytes) 16 units of precision

        float myFloat2 = (float)5.0; // better not to use it like this

        System.out.println("My Int = " + myInt);
        System.out.println("My Float = " + myFloat);
        System.out.println("My Double = " + myDouble);

        double numberOfPounds = 5.0;
        double convertPoundsToKilos = numberOfPounds * 0.45359237;
        System.out.println( numberOfPounds + " pounds equals to " + convertPoundsToKilos + " kilos.");
    }
}
