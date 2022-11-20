package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numInput = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numInput.length - 1 ; index++) {
            int currentlyNumber = numInput[index];
            int secondNumber = 0;
            if(index == numInput.length - 1){
                System.out.print(currentlyNumber);
                break;
            }
            boolean isFalse = false;
            for (int i =index + 1; i < numInput.length ; i++) {
                secondNumber = numInput[i];
                if(currentlyNumber > secondNumber){
                    isFalse = true;
                }else {
                    isFalse = false;
                    break;
                }
            }
            if(isFalse){
                System.out.print(currentlyNumber + " ");
            }
        }
    }
}
