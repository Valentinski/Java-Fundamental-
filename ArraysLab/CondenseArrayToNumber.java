package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();

        int [] nums = Arrays
                .stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] condensed = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1 ; i++) {
            condensed [i] = nums[i] + nums[i + 1]; // i got the result of 12 13
            // i should continue with the summing of the Array till the last number
        }

    }

}
