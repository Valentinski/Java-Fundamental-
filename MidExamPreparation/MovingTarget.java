package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> targetList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // we read all commands until End
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("End")){
            //we create an array, because we muss manipulate all elements
            String [] commandLine = inputLine.split(" "); //[Shoot 5 10]
            String command = commandLine[0]; // [Shoot]
            int index = Integer.parseInt(commandLine[1]); //[5]
            int value = Integer.parseInt(commandLine[2]); //[10]

            // we read all commands
            switch (command){
                case "Shoot":

                    if(validIndex(targetList,index)){ // we check if the index is valid
                        int currentNum = targetList.get(index);
                       currentNum = currentNum - value;
                       if(currentNum <= 0){
                           //delete index // we remove the index from the list
                           targetList.remove(index);
                       }else {
                           //we set the new value on the currently index
                           targetList.set(index, currentNum);
                       }
                    }
                    break;
                case"Add":
                    if(validIndex(targetList,index)){
                        //to insert/add a new value on given index
                        targetList.add(index, value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validIndexRadius = targetList.size()-1 >= index
                            && targetList.size() - 1 >= index + value
                            && index - value >= 0;

                    if (validIndexRadius) {

                        //we create a circle
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targetList.remove(index - value);
                        }
                    }else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            inputLine=scanner.nextLine();

        }
        //printing the list
        //we create new List which one we fill with  tha values of the targetList
        List<String> resultList = new ArrayList<>();
        for (int target : targetList) {
            resultList.add(String.valueOf(target));
        }
        System.out.println(String.join("|", resultList));
    }
    public  static boolean validIndex (List <Integer> list, int index ){
        return index<= list.size() - 1 && index >= 0;
    }
}
