package MethodsExercises;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase(Locale.ROOT); // take a text and makes them smalls
        printVowelsCount(text);
    }

    private static void printVowelsCount (String text){
        int counter = 0;
        // A, a, E, e, I,i O,o,U, u

        for (char symbol : text.toCharArray()) {
            if(symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'o' || symbol == 'u'  ){
                counter++;
            }
        }
        System.out.println(counter);
    }

}
