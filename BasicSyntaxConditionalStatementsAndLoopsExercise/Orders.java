package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // orders
        double price = 0;
        for (int i = 1; i <= n ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysOnMonth = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double priceOfOrder = ((daysOnMonth * capsuleCount) * pricePerCapsule);
            price += priceOfOrder;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOfOrder);
        }
        System.out.printf("Total: $%.2f", price);
    }
}
