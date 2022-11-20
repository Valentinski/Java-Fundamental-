package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream( scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            // the command is split by interval to get it like array
            String commandName = command.split(" ")[0]; // we took the first element
            int element = Integer.parseInt(command.split(" ")[1]);// we transform the text into number

            if (commandName.equals("Delete")){
                numbers.removeAll(Arrays.asList(element)); // remove this element from the array.
            }else if (commandName.equals("Insert")) {
                int position =Integer.parseInt( command.split(" ")[2]);
                numbers.add(position, element); // we took the list and the element is added;
            }

            command = scanner.nextLine();
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }


    }
}
