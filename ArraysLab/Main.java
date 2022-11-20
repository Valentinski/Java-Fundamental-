package ArraysLab;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Streams in Java
        // Integer
        int [] numArr = Arrays
                .stream(scanner.nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        // Double
        double [] numDouble = Arrays
                .stream(scanner.nextLine().split(""))
                .mapToDouble(Double::parseDouble)
                .toArray();

        String[] arr = scanner.nextLine().split("");

        // String
        // "1, 2, 3, 4, 5"
        String inPutLine = scanner.nextLine();
        //String [] arr = inPutLine.split(" ");

        int [] numbersArr = new int [arr.length];
        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr[i] = Integer.parseInt(arr[i]);

        }
        System.out.println();
    }
}
