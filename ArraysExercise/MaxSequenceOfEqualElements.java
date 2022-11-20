package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int length = 1; // this is a max value at the begging of the program

        //we create two variables which consist the best result of the test
        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < array.length ; i++) {
            // Checking if the next two digits are equals
            if(array[i] == array[i - 1]){
                //if they are we increase length
                length++;
            }else {
                //if not the length stay with the same value
                length = 1;
                startIndex = i;
            }

            if(length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }
        for (int i = bestStart; i < bestStart + maxLength ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
