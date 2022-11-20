package FInalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder stopBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();
        while (!command.equals("Travel")){
            if(command.contains("Add Stop")){
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                //validation of the index
                if(isValidIndex(index, stopBuilder)){
                    stopBuilder.insert(index, stopName);
                }

            }else if(command.contains("Remove Stop")){

                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if(isValidIndex(startIndex, stopBuilder) && isValidIndex(endIndex, stopBuilder)){
                    stopBuilder.delete(startIndex, endIndex + 1);
                }
            }else if(command.contains("Switch")){
                String oldText= command.split(":")[1] ;
                String newText= command.split(":")[2] ;
                // we do exchange only if we have this stop "oldText"
                if(stopBuilder.toString().contains(oldText)){
                    String updatedText = stopBuilder.toString().replace(oldText, newText);
                    stopBuilder = new StringBuilder(updatedText);
                }
            }


            System.out.println(stopBuilder);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+stopBuilder);
    }
    //validation method in a text
    public static boolean isValidIndex (int index, StringBuilder builder ){
        return index >= 0 && index <= builder.length() - 1;
    }
}
