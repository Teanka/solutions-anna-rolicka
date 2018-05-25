package pl.coderstrust.solutions.udemy.section4;

public class MethodOverloading {
    public static void main(String[] args) {int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(157);

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >=0 && inches <=12)){
            double resultInCm = inches*2.54 + feet*12*2.54;
            System.out.println("Your result in cm is: " + resultInCm);
            return resultInCm;
        } else {
            System.out.println("Invalid input data, sorry!");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0){
            double remainderInches = inches % 12;
            int howManyFeetInInches = (int)inches/12;
            inches = remainderInches;
            double feet = (double)howManyFeetInInches;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            System.out.println("Invalid input data, sorry!");
            return -1;
        }
    }
}
