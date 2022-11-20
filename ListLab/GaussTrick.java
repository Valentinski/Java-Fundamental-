package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numList.size();

        for (int i = 0; i < sizeList / 2 ; i++) {
            int firsNum = numList.get(i);
            int secondNum = numList.get(numList.size() - 1);
            //sum them
            numList.set(i, numList.get(i) + numList.get(numList.size() - 1));
            //remove the last element
            numList.remove(numList.size() - 1);

        }
        for (int element: numList) {
            //System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
            System.out.print(element + " ");
        }
    }
}
