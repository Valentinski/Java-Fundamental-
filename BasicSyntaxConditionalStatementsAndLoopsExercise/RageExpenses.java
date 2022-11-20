package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());

        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headSetCount = gamesLost / 2;
        int mouseCount = gamesLost / 3;
        int keyboardCount = gamesLost / 6;
        int displayCount = gamesLost / 12;

        //total sum he must pay: whole sums
        double totalSum = headSetCount * headSetPrice
                        + mouseCount * mousePrice
                        + keyboardCount * keyboardPrice
                        + displayCount * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
