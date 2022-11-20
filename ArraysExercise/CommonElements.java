package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split(" ") ;
        String [] secondArray = scanner.nextLine().split(" ");


        String first = " ";
        String second = " ";
        String theSame = " ";

        for (int i = 0; i < secondArray.length ; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                first = firstArray[j];
                second = secondArray[i];

                if(first.equals(second)){
                    System.out.print(firstArray[j] + " ");
                }


            }
        }


    }
}
