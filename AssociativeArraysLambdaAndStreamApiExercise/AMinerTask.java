package AssociativeArraysLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int counter = 0;
        Map<String, Integer > resourceList = new LinkedHashMap<>();
        String resource = "";
        int quantitiesOfResources = 0;

        while (!input.equals("stop")){
            counter++;
            if(counter % 2==1){
                resource = input;
                if(!resourceList.containsKey(input)) {
                    resourceList.put(resource, 0);
                }
            }else {
                quantitiesOfResources = Integer.parseInt(input);
                if(resourceList.containsKey(resource)){
                    int oldQuantities = resourceList.get(resource);
                    resourceList.put(resource, quantitiesOfResources + oldQuantities);
                }else {
                    resourceList.put(resource, quantitiesOfResources);
                }
            }

            input = scanner.nextLine();
        }
        resourceList.entrySet().
                forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
