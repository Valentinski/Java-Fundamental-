package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meter = Integer.parseInt(scanner.nextLine());

        double km = meter / 1000.0;

        System.out.printf("%.2f",km);

    }

}
