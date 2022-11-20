package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // integer number
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; //the first value of the digit, we saved here the first number
        //we need whole digit
             //repeat digit > 0
             //stop digit <= 0
        int sumFact = 0; // we hold of all Factorials
        while (number > 0) {
            int lastDigit = number % 10;
                // Factorial of all digits
            int fact = 1; // here MUST be 1, because we could not devise with 0 !
            for (int i = 1; i <= lastDigit ; i++) { // all digit from 1 till my number
                fact = fact * i;

            }
                // Sum of all Factorials
            sumFact += fact;
            number = number / 10;
        }
        // Checking of Strong numbers - sum of all Factorials == first number
        if(sumFact == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
