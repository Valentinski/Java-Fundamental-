package AssociativeArraysLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> symbolsCount =new LinkedHashMap<>();

        for (char symbol : text.toCharArray() ) {
            if(symbol == ' '){
                continue;
            }
            //if I do not meet this symbol
            if(!symbolsCount.containsKey(symbol)){
                //if not the symbol is counted (+1)
                symbolsCount.put(symbol, 1);
            }
            //if I already met this symbol
            else{
                int currentCount = symbolsCount.get(symbol);
                //if i have this key i do not add new symbol, just add new value
                symbolsCount.put(symbol, currentCount + 1);//
            }
        }

        //Map: symbol -> count of meetings
        symbolsCount.entrySet().
                forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
