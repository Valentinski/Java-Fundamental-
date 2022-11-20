package RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> listOfCards = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        while (count < n){
            count++;
            String command = scanner.nextLine();
                if (command.contains("Add")) {
                    String game = command.split(", ")[1];
                    if (listOfCards.contains(game)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        listOfCards.add(game);
                        System.out.println("Card successfully added");
                    }
                } else if (command.contains("Remove")) {
                    String games = command.split(", ")[1];
                    if (listOfCards.contains(games)) {
                        listOfCards.remove(games);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                } else if (command.contains("Remove At")) {
                    String removedGame = command.split(", ")[2];
                    int index = Integer.parseInt(command.split(", ")[1]);
                    if (isIndexValid(index, listOfCards.size())) {
                        listOfCards.remove(index);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                } else if (command.contains("Insert")){
                    int num = Integer.parseInt(command.split(", ")[1]);
                    String insertedGame = command.split(", ")[2];

                    if (!isIndexValid(num, listOfCards.size())) {
                        System.out.println("Index out of range");
                    }else {
                        if (listOfCards.contains(insertedGame)) {
                            System.out.println("Card is already in the deck");
                        } else {
                            listOfCards.add(num, insertedGame);
                            System.out.println("Card successfully added");
                        }
                    }
                }

        }
        System.out.println(String.join(", ",listOfCards));

    }
    public static boolean isIndexValid (int index, int sizeOfList) {
        //[0 до последния]
        return index >= 0 && index <= sizeOfList - 1;
    }
}
