package TextProcessingLab;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!line.equals("end")){
            String revers = "";
            for (int i = line.length() - 1; i >= 0 ; i--) {
                revers += line.charAt(i);
            }
            System.out.printf("%s = %s%n", line, revers);
            line = scanner.nextLine();
        }
    }
}
