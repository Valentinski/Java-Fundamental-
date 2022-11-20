package AssociativeArraysLambdaAndStreamApiLab;

import java.util.*;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        TreeMap<Double, Integer> countNumbersMap = new TreeMap<>();
        for (double currentNum: numbersList) {
            // we have to save the value in "Integer" not in "int" !!! 
            Integer currentValue = countNumbersMap.get(currentNum);
            //int currentValue = countNumberMap.get(currentNum, 0) - we set a value and can we use "int"
            if(countNumbersMap.containsKey(currentNum)) {
                countNumbersMap.put(currentNum, currentValue + 1);
            }else {
                countNumbersMap.put(currentNum, 1);
            }
        }
        //count.EntrySet + atl. and Enter fill all automatically
        for (Map.Entry<Double, Integer> doubleIntegerEntry : countNumbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }

    }
}
