package FInalExamPreparation;

import java.util.*;

public class NeedForSpeedThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] carsToken = scanner.nextLine().split("\\|");
            String car = carsToken[0];
            int mileAge = Integer.parseInt(carsToken[1]);
            int fuel = Integer.parseInt(carsToken[2]);

            carsMap.putIfAbsent(car, new ArrayList<>());

            carsMap.get(car).add(0, mileAge);
            carsMap.get(car).add(1, fuel);
        }
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Stop")){
            String [] tokens = inputLine.split(" : ");
            String command = tokens[0];
            String car = tokens[1];
            
            int mileAge = carsMap.get(car).get(0);
            int fuel = carsMap.get(car).get(1);
            switch (command){
                case "Drive":
                    int distance = Integer.parseInt(tokens[2]);
                    int consumedFuel = Integer.parseInt(tokens[3]);
                    
                    if(fuel >= consumedFuel){
                        carsMap.get(car).set(0, mileAge + distance);
                        carsMap.get(car).set(1, fuel - consumedFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, fuel, consumedFuel);
                    }else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    if(mileAge + distance >= 100000){
                        System.out.printf("Time to sell the %s!%n",car);
                        carsMap.remove(car);
                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(tokens[2]);

                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(tokens[2]);

                    break;
            }




            inputLine = scanner.nextLine();
        }
    }
}
