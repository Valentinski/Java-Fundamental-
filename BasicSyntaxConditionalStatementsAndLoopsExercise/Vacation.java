package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double price = 0;

        switch (typeOfGroup){
            case "Students":
                if(weekDay.equals("Friday")){
                    price = 8.45;

                }else if(weekDay.equals("Saturday")){
                    price = 9.80;

                }else if(weekDay.equals("Sunday")){
                    price = 10.46;

                }
                break;
            case"Business":

                if(weekDay.equals("Friday")){
                    price = 10.90;
                }else if(weekDay.equals("Saturday")){
                    price = 15.60;
                }else if(weekDay.equals("Sunday")){
                    price = 16;
                }
                break;
            case"Regular":
                if(weekDay.equals("Friday")){
                    price = 15;
                }else if(weekDay.equals("Saturday")){
                    price = 20;
                }else if(weekDay.equals("Sunday")){
                    price = 22.50;
                }
                break;
        }
        if(typeOfGroup.equals("Business") && people >= 100 ){
            people = people - 10;
        }

        double totalPrice = price * people;

        if(typeOfGroup.equals("Students") && people >= 30){
        totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (typeOfGroup.equals("Regular") && people >= 10 && people <= 20){
            totalPrice = totalPrice - totalPrice * 0.05;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
