package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int [] train = new int [wagons];
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            train [i] = people;
            System.out.print(train[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
    }

}
