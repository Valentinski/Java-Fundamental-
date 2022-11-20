package AssociativeArraysLambdaAndStreamApiExercise;

import java.security.Key;
import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseList = new LinkedHashMap<>();
        int count = 0;

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String nameOfThePearson = input.split(" : ")[1];

            if(!courseList.containsKey(courseName)){
                courseList.put(courseName, new ArrayList<>());
                courseList.get(courseName).add(nameOfThePearson);
            }else {
                courseList.get(courseName).add(nameOfThePearson);
            }

            input = scanner.nextLine();
        }
        courseList.entrySet()
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());

                    entry.getValue().forEach(studentName-> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });
    }
}
