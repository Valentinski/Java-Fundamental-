package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int rest = people;
        int course = 0;
       while (rest > 0){
           course++;
           rest-= capacity;
       }

        System.out.println(course);

    }
}
