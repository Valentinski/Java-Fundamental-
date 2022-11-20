package AssociativeArraysLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> listOfStudents = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!listOfStudents.containsKey(studentName)){
                listOfStudents.put(studentName, grade);
            }else {
                double currentGrade = listOfStudents.get(studentName);
                double averageGrade = (currentGrade + grade)/ 2;
                if(averageGrade < 4.5){
                    listOfStudents.remove(studentName);
                }else {
                    listOfStudents.put(studentName, averageGrade);
                }
            }

        }
        for (Map.Entry<String, Double> entry : listOfStudents.entrySet()) {
            //key (име на продукта) -> value (цена)
            //цена * количеството
            String name = entry.getKey();
            double grade = entry.getValue() ;
            System.out.printf("%s -> %.2f%n", name, grade);
        }
    }
}
