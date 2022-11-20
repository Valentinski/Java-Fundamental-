package ArraysLab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2 ; i++) {
            String oldElement = inputArr[i]; // we saved the first element in another variable
            inputArr[i] =inputArr[inputArr.length - 1 - i];// we take the last element
            inputArr[inputArr.length - 1 - i] = oldElement; // we switched these elements
        }

        System.out.println(String.join(" ", inputArr));
    }
}
