package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



            int playerOneLength = playerOne.size();
            int playerTwoLength = playerTwo.size();

            while (!noMoreCardsDeckTwo(playerTwo) && !noMoreCardsDeckOne(playerOne)) {
                if (playerOne.get(0) > playerTwo.get(0)) {
                    int win = playerOne.get(0); // the win index is taken
                    playerOne.remove(playerOne.get(0)); // index removing
                    int lose = playerTwo.get(0); // the lost index is taken
                    playerTwo.remove(playerTwo.get(0));//index removing
                    // adding the elements in the List of the winners
                    playerOne.add(playerOne.size(), win);
                    playerOne.add(playerOne.size(), lose);
                    if (noMoreCardsDeckTwo(playerTwo)) {
                        int sum = 0;
                        for (int i = 0; i < playerOne.size(); i++) {
                            sum += playerOne.get(i);
                        }
                        System.out.printf("First player wins! Sum: %d", sum);
                        break;
                    }
                } else if (playerTwo.get(0) > playerOne.get(0)) {
                    int win = playerTwo.get(0); // the win index is taken
                    playerTwo.remove(playerTwo.get(0)); // index removing
                    int lose = playerOne.get(0); // the lost index is taken
                    playerOne.remove(playerOne.get(0));//index removing
                    // adding the elements in the List of the winners
                    playerTwo.add(playerTwo.size(), win);
                    playerTwo.add(playerTwo.size(), lose);
                    if (noMoreCardsDeckOne(playerOne)) {
                        int sum = 0;
                        for (int i = 0; i < playerTwo.size(); i++) {
                            sum += playerTwo.get(i);
                        }
                        System.out.printf("Second player wins! Sum: %d", sum);
                        break;
                    }
                } else {
                    playerOne.remove(playerOne.get(0));
                    playerTwo.remove(playerTwo.get(0));
                    if (noMoreCardsDeckTwo(playerTwo)) {
                        int sum = 0;
                        for (int i = 0; i < playerOne.size(); i++) {
                            sum += playerOne.get(i);
                        }
                        System.out.printf("First player wins! Sum: %d", sum);
                        break;
                    } else if (noMoreCardsDeckOne(playerOne)) {
                        int sum = 0;
                        for (int i = 0; i < playerTwo.size(); i++) {
                            sum += playerTwo.get(i);
                        }
                        System.out.printf("Second player wins! Sum: %d", sum);
                        break;
                    }
                }
            }


    }

    public static boolean noMoreCardsDeckOne (List <Integer> deckOne){
        return deckOne.size()<= 0;
    }
    public static boolean noMoreCardsDeckTwo (List <Integer> deckTwo){
        return deckTwo.size()<= 0;
    }

}
