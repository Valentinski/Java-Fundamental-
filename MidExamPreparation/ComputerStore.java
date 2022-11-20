package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSumWithOutTax = 0;
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("special") && !inputLine.equals("regular")){
            double currentAmount = Double.parseDouble(inputLine);

            if(currentAmount < 0){
                System.out.println("Invalid price!");
                inputLine = scanner.nextLine();
                continue;
            }

            totalSumWithOutTax += currentAmount;




            inputLine = scanner.nextLine();
        }
        if(totalSumWithOutTax == 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalSumWithOutTax);
            double taxes = totalSumWithOutTax * 0.20;
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            double sumWithTaxes = totalSumWithOutTax + taxes;
            if (inputLine.equals("special")) {
                sumWithTaxes = sumWithTaxes * 0.9;
            }
            System.out.printf("Total price: %.2f$%n", sumWithTaxes);
        }
    }
}
