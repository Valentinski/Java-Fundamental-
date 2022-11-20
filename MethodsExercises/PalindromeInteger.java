package MethodsExercises;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(positiveNumber(Integer.parseInt(input))) {
            while (!input.equals("END")) {
                int number = Integer.parseInt(input);
                String firstDigit = String.valueOf(input.charAt(0));
                int length = input.length();
                String lastDigit = String.valueOf(input.charAt(length - 1));

                if (firstDigit.equals(lastDigit)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                input = scanner.nextLine();
            }
        }else{
            System.out.println("false");
        }
    }
    public static boolean positiveNumber (int num){
        return num >= 0;
    }
}
