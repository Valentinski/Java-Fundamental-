package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(scanner.nextLine());
        List <String> listOfGuests = new ArrayList<>();
        for (int i = 0; i < countOfCommands ; i++) {
            int index = i;
            List <String> input = List.of((scanner.nextLine().split(" ")));
            String person = input.get(0);
            String isOrNot = input.get(1);
            String thirdIndex = input.get(2);

                if(!isThere(listOfGuests, person) && !not(thirdIndex)) {
                    listOfGuests.add(String.valueOf(person));
                }else if(isThere(listOfGuests, person) && !not(thirdIndex))  {
                    System.out.printf("%s is already in the list!%n", person);
                }else if(!isThere(listOfGuests, person) && not(thirdIndex)){
                    System.out.printf("%s is not in the list!%n",person);
                }else if(isThere(listOfGuests, person) && not(thirdIndex)) {
                 String nameOut = "";
                    for (int j = 0 ; j < listOfGuests.size() ; j++) {
                        nameOut = listOfGuests.get(j);
                        if(person.equals(nameOut)){
                            listOfGuests.remove(j);
                            break;
                        }
                    }
                }
        }
        for (String guest: listOfGuests) {
            System.out.println(guest);
        }
    }
    public static boolean isThere (List<String> list, String name){
        return list.contains(name);
    }
    public static boolean not ( String third){
        return third.equals("not");
    }
}
