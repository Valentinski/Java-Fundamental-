package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bombField = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> specialNumberAndAPower = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int specialNumber = Integer.parseInt(String.valueOf(specialNumberAndAPower.get(0)));
        int power = Integer.parseInt(String.valueOf(specialNumberAndAPower.get(1)));


        for (int i = 0; i < bombField.size() - 1 ; i++) {
            int theNumber =Integer.parseInt(String.valueOf( bombField.get(i)));
            if(theNumber == specialNumber){
                int indexOfSpecialNumber = i;
                int radius = 0;
                if (power < bombField.size() - 1 - indexOfSpecialNumber ) {
                    radius = power * 2 + 1;
                }else {
                    radius = power + bombField.size() - 1 - indexOfSpecialNumber + 1;
                }
                for (int j = 0; j < radius ; j++) {
                    if(radius - j > bombField.size() - 1){
                        break;
                    }else {
                        bombField.remove(indexOfSpecialNumber - power);
                    }
                }

            }
        }
        int totalSum = 0;
        for (int i = 0; i < bombField.size() ; i++) {
            int element= Integer.parseInt(String.valueOf(bombField.get(i)));
            totalSum += element;

        }
        System.out.println(totalSum);
    }

}
