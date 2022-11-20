package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



        for (int number = 1; number <= n ; number++) {
            if (isSumDigitsDivisibleBy8(number) && isContainOddDigit(number)){
                System.out.println(number);
            }
        }
    }

    private static boolean isSumDigitsDivisibleBy8 (int number){
        // Алгоритъм за намиране на цифрите на едно число !!!
        int sumDigits = 0;
        while (number > 0){
            // we take the last digit
            int lastDigit = number % 10;
            // add to the sum
            sumDigits += lastDigit;
            // remove the last digit of the number
            number = number / 10;

        }
        // we check if the digit is divisible by 8
        return sumDigits % 8 == 0;
    }

    private static boolean isContainOddDigit (int number){
        while ( number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 1) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
