package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input consists of 3 lines
        int power = Integer.parseInt(scanner.nextLine());//N
        int distance = Integer.parseInt(scanner.nextLine());//M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());//Y

        int count = 0;// counts of a pokes
        int startPower = power; // the original value of the power N
        while (power >= distance){
            power -= distance; // we reduce the power with the distance
            count++;

            if (power == startPower * 0.5){// check out 50% of the original value
                if(exhaustionFactor > 0) {
                    power /= exhaustionFactor; // dividing N by Y power = power / exhaustionFactor
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
