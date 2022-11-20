package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());

        // every day we reduce the power of the yield with 10; yield - 26
        // we stop working when it contains <=  100

        int days = 0;
        int totalAmountSpices = 0;

        while (source >= 100){
            int spices = source - 26; // the mining
            totalAmountSpices += spices;
            days++;
            source -= 10;
        }
        System.out.println(days);
        if(totalAmountSpices >= 26){
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);
    }
}
