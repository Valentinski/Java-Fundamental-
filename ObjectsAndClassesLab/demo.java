package ObjectsAndClassesLab;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        //method which give us a local date
        LocalDate birthday = LocalDate.of(years,month,day);

        // add or remove days/months/years
       birthday= birthday.plusYears(60);


       //create random object
        Random rnd = new Random();
        int num = rnd.nextInt(99);





        System.out.println(birthday);
        System.out.println(num);
    }
}
