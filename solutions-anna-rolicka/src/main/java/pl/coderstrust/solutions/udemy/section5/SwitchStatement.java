package pl.coderstrust.solutions.udemy.section5;

public class SwitchStatement {
    public static void main(String[] args) {
        int value = 3;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("It was a 3 or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or even 5");
                break;
        }
        char myChar = 'E';

        switch(myChar) {
            case 'A':
                System.out.println("My char was an 'A'. How did you find it out?");
                break;

            case 'B':
                System.out.println("OK, so this was a 'B'. ");
                break;

            case'C': case 'D': case 'E':
                System.out.println("It was either C or D or E. ");
                break;

            default:
                System.out.println("Your guess was incorrect. Better luck next time!");
                break;

        }

    }
}
