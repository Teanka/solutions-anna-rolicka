package pl.coderstrust.solutions.udemy.section5;

public class WhileDoWhile {
    public static void main(String[] args) {
        int count = 6;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 1;
        for(int i=6; i!= 6; i++) {
            System.out.println("Count value is " + i);
        }

        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count >100) {
                break;
            }

        } while(count != 6);

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                System.out.println("Even numbers found:" + evenNumbersFound);
                break;
            }
        }

    }
    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }
}
