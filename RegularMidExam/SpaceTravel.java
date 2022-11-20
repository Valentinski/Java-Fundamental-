package RegularMidExam;

import java.util.Scanner;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] travelToTitan = scanner.nextLine().split("\\|\\|");
        int startingAmountOhFuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        String command = "";
        int value = 0;
        boolean isFailed = false;
        for (int i = 0; i < travelToTitan.length; ) {
            String[] array = travelToTitan[i].split("  ");
            String [] input = array[0].split(" ");
            command = input[0];

            if(isFailed){
                break;
            }
            if(command.equals("Titan")){
                System.out.println("You have reached Titan, all passengers are safe.");
                break;
            }
            value = Integer.parseInt(input[1]);

            if (!command.equals("Titan")) {
                switch (command) {
                    case "Travel":
                        startingAmountOhFuel -= value;
                        if (startingAmountOhFuel < 0) {
                            System.out.println("Mission failed.");
                            isFailed = true;
                            break;
                        } else {
                            System.out.printf("The spaceship travelled %d light-years.%n", value);
                            break;
                        }
                    case "Enemy":
                        if (ammunition >= value) {
                            ammunition -= value;
                            System.out.printf("An enemy with %d armour is defeated.%n", value);
                            break;
                        } else if (startingAmountOhFuel >= 2 * value) {
                            startingAmountOhFuel = startingAmountOhFuel - 2 * value;
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n", value);
                            break;
                        } else if (startingAmountOhFuel <= 2 * value || ammunition <= value) {
                            System.out.println("Mission failed.");
                            isFailed = true;
                            break;
                        }

                    case "Repair":
                        System.out.printf("Ammunitions added: %d.%n", value *2);
                        System.out.printf("Fuel added: %d.%n", value);
                        break;
                }

            }
            i++;
        }
    }
}
