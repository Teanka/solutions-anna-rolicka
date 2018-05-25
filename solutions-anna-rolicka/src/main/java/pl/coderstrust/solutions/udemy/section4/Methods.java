package pl.coderstrust.solutions.udemy.section4;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String playersName = "Jacek";
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition( playersName,position );

        playersName = "Julka";
        position = calculateHighScorePosition(900);
        displayHighScorePosition( playersName,position );

        playersName = "Marta";
        position = calculateHighScorePosition(400);
        displayHighScorePosition( playersName,position );

        playersName = "Ola";
        position = calculateHighScorePosition(50);
        displayHighScorePosition( playersName,position );
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else {
            return -1;
        }
    }
    public static void displayHighScorePosition(String playersName, int position) {
        if (position >= 1 && position <=4) {
            System.out.println( playersName + " managed to get into position "  +  position + " on the high score table");
        }
        else {
            System.out.println("Better luck next time! ");
        }
    }
    public static int calculateHighScorePosition( int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000){
            return 2;
        } else if (score >=100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
