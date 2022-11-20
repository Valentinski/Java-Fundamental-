package TextProcessingExercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] arguments = input.split(" ");
        String first = arguments[0];
        String second = arguments[1];

        List<Integer> firstValues = new ArrayList<>();
        List<Integer> secondValues = new ArrayList<>();

        for (int i = 0; i < first.length() ; i++) {
            firstValues.add((int)first.charAt(i));
        }
        for (int j = 0; j < second.length() ; j++) {
            secondValues.add((int)second.charAt(j));
        }
        int totalSum = 0;
        if(isLongerOrNot(first, second)){
            for (int i = 0; i < firstValues.size() ; i++) {
                int theValueOne = firstValues.get(i);
                int theValueTwo = secondValues.get(i);

                int total = theValueOne * theValueTwo;

                totalSum += total;
            }
        }else {
            if(firstValues.size() > secondValues.size()){
                List <Integer> newList = new ArrayList<>();
                for (int i = 0; i < secondValues.size() ; i++) {
                    newList.add((int)firstValues.get(i));
                }
                for (int i = 0; i < newList.size() ; i++) {
                    int theValueOne = firstValues.get(i);
                    int theValueTwo = secondValues.get(i);

                    int total = theValueOne * theValueTwo;
                    totalSum += total;
                }
                for (int i = firstValues.size() - newList.size() ; i > 0 ; i--) {
                    totalSum += firstValues.get(i);
                }
                
            }else if(firstValues.size() < secondValues.size()){ // не смята правилно тук !!!
                List <Integer> newList = new ArrayList<>();
                for (int i = 0; i < firstValues.size() ; i++) {
                    newList.add((int)secondValues.get(i));
                }
                for (int i = 0; i < newList.size() ; i++) {
                    int theValueOne = firstValues.get(i);
                    int theValueTwo = secondValues.get(i);

                    int total = theValueOne * theValueTwo;
                    totalSum += total;
                }
                for (int i = secondValues.size() - newList.size() ; i > 0 ; i--) {
                    totalSum += secondValues.get(i);
                }
            }
        }

        System.out.println(totalSum);

    }
    public static boolean isLongerOrNot (String first, String second){
        if(first.length() > second.length() || first.length() < second.length()){
            return false;
        }else {
            return true;
        }
    }
}
