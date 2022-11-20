package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lines = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int quantity = 0;
        for (int i = 1; i <= lines ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (capacity >= liters) {
                capacity -=liters;
                quantity += liters;
            }else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(quantity);
    }
}
