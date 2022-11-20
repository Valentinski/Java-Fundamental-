package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dayOfTheWeek = new String [8];
        // String [] dayOfTheWeek = new String [] { "Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // another type of writing
        dayOfTheWeek[0] = "Invalid day!";
        dayOfTheWeek[1] = "Monday";
        dayOfTheWeek[2] = "Tuesday";
        dayOfTheWeek[3] = "Wednesday";
        dayOfTheWeek[4] = "Thursday";
        dayOfTheWeek[5] = "Friday";
        dayOfTheWeek[6] = "Saturday";
        dayOfTheWeek[7] = "Sunday";

        int input = Integer.parseInt(scanner.nextLine());
        if(input >= 1 && input <= 7) {
            System.out.println(dayOfTheWeek[input]);
        }else {
            System.out.println(dayOfTheWeek[0]);
        }
    }
}
// Monday
// Tuesday
//Wednesday
//Thursday
//Friday
//Saturday
// Sunday