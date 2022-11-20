package AssociativeArraysLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> usersList = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];


            switch (command){
                case "register":
                    String licenseNumber = input.split(" ")[2];
                    if(usersList.containsKey(name)){
                        String plateNumber = usersList.get(name);
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber );
                    }else {
                        usersList.put(name, licenseNumber);
                        String plateNumber = usersList.get(name);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);
                    }
                    break;
                case "unregister":
                    if(!usersList.containsKey(name)){
                        System.out.printf("ERROR: user %s not found%n", name);
                    }else {
                        usersList.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;

            }
        }
        usersList.entrySet().
                forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
