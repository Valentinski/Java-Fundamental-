package MethodsExercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        subtractTheInput(first, second, third);
    }

    public static Integer subtractTheInput ( int first, int second, int third){
        int subtract = (first + second) - third;
        System.out.println(subtract);

        return subtract;
    }
}
