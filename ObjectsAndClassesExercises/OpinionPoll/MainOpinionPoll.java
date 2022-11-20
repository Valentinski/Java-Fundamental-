package ObjectsAndClassesExercises.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String personalData = scanner.nextLine();
            String name = personalData.split(" ")[0]; // Name is taken
            int age =Integer.parseInt( personalData.split(" ")[1]); // Age is taken

            if(age > 30){
                // valid human -> the human is created
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        // We have one list with people
        for (Person person: personList) {
            // name - age
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
