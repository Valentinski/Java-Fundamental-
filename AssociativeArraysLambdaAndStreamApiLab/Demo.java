package AssociativeArraysLambdaAndStreamApiLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        // Method for adding element ".put"
        map.put("Valentin", 35988998);
        map.put("Lachi", 35984998);
        map.put("Yanchi", 3594998);

        // we remove an element with specific key
        map.remove("Valentin");

        //print a "Map", we can print only "keys" only "name" or two elements together
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


        System.out.println();
    }
}
