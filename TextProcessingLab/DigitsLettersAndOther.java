package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text =scanner.nextLine();
        StringBuilder digitStr = new  StringBuilder();
        StringBuilder letterStr = new StringBuilder();
        StringBuilder otherStr = new StringBuilder();
        for (int i = 0; i < text.length() ; i++) {
            char symbol = text.charAt(i);

            // we have to ask if the symbol is char or int or String
            // we use ASCII table

            if(Character.isDigit(symbol)){
                digitStr.append(symbol);
            }else if(Character.isLetter(symbol)){
                letterStr.append(symbol);
            }else {
                otherStr.append(symbol);
            }
        }
        System.out.println(digitStr);
        System.out.println(letterStr);
        System.out.println(otherStr);
    }
}
