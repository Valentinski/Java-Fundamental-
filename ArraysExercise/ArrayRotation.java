package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int  rotation = 1;  rotation <= countRotations; rotation++) {
            //rotation of the array
            //1.we take the first number
            String firstElement = array[0];
            //2.we change the position of the all elements on the left
            for (int index = 0; index < array.length - 1 ; index++) {
                array[index] = array[index + 1];
            }
            //3. the last number goes on the first position
            array[array.length - 1 ] = firstElement;
        }
        for (String element : array) {
            System.out.print(element + " ");

        }
    }
}
