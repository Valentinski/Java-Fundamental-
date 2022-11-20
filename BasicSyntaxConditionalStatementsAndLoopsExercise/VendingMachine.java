package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //price list
        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;

        double price = 0;

        while (!input.equals("Start")) {
                double coin = Double.parseDouble(input);

                if (coin == 0.1) {
                    price += coin;
                } else if (coin == 0.2) {
                    price += coin;
                } else if (coin == 0.5) {
                    price += coin;
                } else if (coin == 1) {
                    price += coin;
                } else if (coin == 2) {
                    price += coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coin);
                }

                input = scanner.nextLine();
            }
                input = scanner.nextLine();
        while (!input.equals("End")){

                if (input.equals("Nuts")) {
                    if (price < nuts) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        price = price - nuts;
                        System.out.printf("Purchased %s%n", input);
                    }
                } else if (input.equals("Water")) {
                    if (price < water) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        price = price - water;
                        System.out.printf("Purchased %s%n", input);
                    }
                } else if (input.equals("Crisps")) {
                    if (price < crisps) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        price = price - crisps;
                        System.out.printf("Purchased %s%n", input);
                    }
                } else if (input.equals("Soda")) {
                    if (price < soda) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        price = price - soda;
                        System.out.printf("Purchased %s%n", input);
                    }
                } else if (input.equals("Coke")) {
                    if (price < coke) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        price = price - coke;
                        System.out.printf("Purchased %s%n", input);
                    }
                } else {
                    System.out.println("Invalid product");
                }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", price);

    }
}
