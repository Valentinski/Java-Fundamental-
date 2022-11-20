package RegularMidExam;

import java.util.Scanner;

public class BiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBiscuitsPerDay  = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        long comparingFactory = Long.parseLong(scanner.next());


        int producingForThirtyDays = numberOfBiscuitsPerDay * countOfWorkers;

        double forTenDays  = (numberOfBiscuitsPerDay*1.0 * 10 * countOfWorkers) * 0.75;
        double twentyDays = (numberOfBiscuitsPerDay * 20) * countOfWorkers;

        double totalBiscuitsProMonth = Math.floor(forTenDays + twentyDays);

        int diff = (int) Math.abs(totalBiscuitsProMonth - comparingFactory);

        double moreOrLess = (diff * 1.0 / comparingFactory) * 100;

        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuitsProMonth);

        if(totalBiscuitsProMonth > comparingFactory){
            System.out.printf("You produce %.2f percent more biscuits.", moreOrLess);
        }else {
            System.out.printf("You produce %.2f percent less biscuits.", moreOrLess);
        }
    }
}
