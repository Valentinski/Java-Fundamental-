package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //1. дължина
        boolean isPasswordLengthValid = isValidLength(password);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. съдържание
        boolean isPasswordContentValid = isValidContent(password);
        if (!isPasswordContentValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        //3. брой цифри
        boolean isPasswordCountDigitsValid = isValidCountDigits(password);
        if (!isPasswordCountDigitsValid) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLengthValid && isPasswordContentValid && isPasswordCountDigitsValid) {
            System.out.println("Password is valid");
        }

    }

    //метод за валидиране на дължината
    //true -> ако дължината е валидна
    //false -> ако дължината не е валидна
    private static boolean isValidLength (String password) {
        //валидна дължина: 6 - 10 вкл
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        //невалидна дължина: Password must be between 6 and 10 characters
        else {
            return false;
        }
        //return password.length() >= 6 && password.length() <= 10;
    }

    //метод за валидиране на съдържанието
    //true -> ако съдържанието е валидно
    //false -> ако съдържанието не е валидно
    private static boolean isValidContent (String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    //метод, който валидира брой на цифрите
    //true -> бр. цифрите >= 2
    //false -> бр. цифрите < 2
    private static boolean isValidCountDigits (String password) {
        int countDigits = 0; //брой на цифрите
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        //брой цифрите
        /*if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }*/

        return countDigits >= 2;

    }

}
//•	"Password must be between 6 and 10 characters";
//•	"Password must consist only of letters and digits";
//•	"Password must have at least 2 digits".
