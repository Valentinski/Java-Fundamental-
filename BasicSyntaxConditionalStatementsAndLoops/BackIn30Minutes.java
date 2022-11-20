package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hours*60) + minutes + 30;

        int hour = allMinutes / 60;
        int min = allMinutes % 60;

        if(hour >23){
            hour = 0;
        }

        System.out.printf("%d:%02d", hour,min);;

    }
}
