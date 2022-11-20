package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacters(text);

    }

    private static void printMiddleCharacters (String text){

        // we take the String and create an Array
        if(text.length() % 2 != 0){
           int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }else {
            int indexFirstMiddleCharacter =text.length()/2 - 1;
            int indexSecondMiddleCharacter = text.length()/2;
            System.out.println(text.charAt(indexFirstMiddleCharacter) + "" + text.charAt(indexSecondMiddleCharacter));
        }
    }
}
