package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double countOfLightSabers =Math.ceil( countOfStudents  + countOfStudents * 0.1);
        int countOfBelts = 0;
        if(countOfStudents >= 6){
            int reduced = countOfStudents / 6;
            countOfBelts = countOfStudents - reduced;
        }else {
            countOfBelts = countOfStudents;
        }

        double totalPrice = (priceOfLightSabers * countOfLightSabers)+
                (priceOfRobes * countOfStudents) + (priceOfBelts * countOfBelts);

        double target = Math.abs(totalPrice - amountOfMoney);
        if(totalPrice <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", target);
        }



    }
}
