package ListLab;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // tha data is read from the console, and they are parsed to Double
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList()); // they are put into collection "Collectors.toList"

        //Iterated is done through elements
        for (int i = 0; i < numbers.size() - 1 ; i++) {
            double firstEl = numbers.get(i);
            double secondEl = numbers.get(i+1);
            // We check if one element is equals to the next.
            if(firstEl == secondEl){
                // if they are equals they are summed
                numbers.set(i, numbers.get(i)+ numbers.get(i + 1));
                // the element is removed because it is  not needed
                numbers.remove(i+1);

                i= -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbers," "));
    }
        public static String joinElementsByDelimiter (List<Double> list, String delimiter) {
        String result = "";
            for (Double num : list) {
                DecimalFormat df = new DecimalFormat("0.#");

                String numFormat = df.format(num) + delimiter;

                result += numFormat;
            }
            return result;
    }
}
