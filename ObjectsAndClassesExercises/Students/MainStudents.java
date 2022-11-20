package ObjectsAndClassesExercises.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainStudents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int studentCount = 1; studentCount <= n; studentCount++) {
            String personalData = scanner.nextLine();

            String firstName = personalData.split(" ")[0];
            String lastName = personalData.split(" ")[1];
            double grade = Double.parseDouble(personalData.split(" ")[2]);

            Students student = new Students(firstName, lastName, grade);
            studentList.add(student);
        }

        // the elements in the list are sorted
        studentList.sort(Comparator.comparing(Students :: getGrade) // ascending order throw grade 1,2,3,4...
                .reversed()); // the order is reversed : ascending order throw grade 4,3,2,1....

        for (Students students : studentList) {
            System.out.println(students.toString());
        }
    }
}
