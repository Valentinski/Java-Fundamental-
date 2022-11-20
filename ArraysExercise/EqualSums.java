package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isFound = false;

        for (int index = 0; index <= numbers.length - 1 ; index++) {
            int currentElement = numbers[index];
            int leftSum = 0;
            int rightSum = 0;

            // left sum
            for (int leftIndex  = 0; leftIndex  < index; leftIndex ++) {
                leftSum += numbers[leftIndex];
            }

            // right sum
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1  ; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            //we check if the sum are equal
            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
