package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int maxBallSnow = 0;
        int maxBallTime = 0;
        int maxBallQuality = 0;

        for (int snowBall  = 1; snowBall  <= n ; snowBall ++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue =Math.pow(snowBallSnow / snowBallTime, snowBallQuality ) ;

            if(snowBallValue > maxValue){
                maxValue = snowBallValue;
                maxBallSnow = snowBallSnow;
                maxBallTime = snowBallTime;
                maxBallQuality = snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxBallSnow, maxBallTime, maxValue, maxBallQuality );
    }
}
