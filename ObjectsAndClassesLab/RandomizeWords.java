package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> line = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!line.isEmpty()){ // isEmpty we ask if the list is empty
            Random rnd = new Random();
            //take the random index from the line
            int randomIndex = rnd.nextInt(line.size());

            // safe the word which we toke
            String word = line.get(randomIndex);

            System.out.println(word);
            line.remove(randomIndex);




        }

    }
}
