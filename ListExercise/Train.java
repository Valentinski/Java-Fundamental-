package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();


        while (!command.equals("end")){
                String commandType = command.split(" ")[0];
                switch (commandType){
                    case "Add":
                    int wagonWithPassengers =Integer.parseInt( command.split(" ")[1]);
                    train.add(wagonWithPassengers);
                    break;
                    default:
                        //команда -> число
                        int passengersToAdd = Integer.parseInt(commandType);
                        for(int index = 0; index < train.size(); index++) {
                            int currentWagon = train.get(index);
                            if(currentWagon + passengersToAdd <= maxCapacity) {
                                train.set(index, currentWagon + passengersToAdd);
                                break;
                            }
                        }
                }

            command = scanner.nextLine();

        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
    }
}
