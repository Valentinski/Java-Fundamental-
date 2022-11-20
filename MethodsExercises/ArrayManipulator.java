package MethodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        String command = scanner.nextLine();

        while (!command.equals("end")){
            if(command.contains("exchange")){
                int countRotations = Integer.parseInt(scanner.nextLine());

                for (int  rotation = 1;  rotation <= countRotations; rotation++) {
                    //rotation of the array
                    //1.we take the first number
                    String firstElement = command.split(" ")[0];
                    //2.we change the position of the all elements on the left
                    for (int index = 0; index < input.length - 1 ; index++) {
                        input[index] = input[index + 1];
                    }
                    //3. the last number goes on the first position
                    input[input.length - 1 ] = firstElement;
                }

            }else if(command.contains("max")){

            }else if(command.contains("min")){

            }else if(command.contains("first")){

            }else if(command.contains("last")){

            }




            command=scanner.nextLine();
        }
    }

}
