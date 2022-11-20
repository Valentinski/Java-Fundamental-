package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("course start")){

          String [] commandLine = commands.split(":");
          String command = commandLine[0];
          String lessonTitle = commandLine[1];


          switch (command){
              case "Add":
                    if(!isThere(input, lessonTitle)){
                        input.add(lessonTitle);
                    }
                  break;
              case "Insert":
                  int index = Integer.parseInt(commandLine[2]);
                  if(indexValidation(input, index) && !isThere(input, lessonTitle)){
                      input.add(index, lessonTitle);
                  }
                  break;
              case "Remove":
                  if(isThere(input, lessonTitle)){
                      input.remove(lessonTitle);
                  }
                  break;
              case "Swap":
                  if(isThere(input, lessonTitle)){
                      String lessonTitleTwo = commandLine[2];
                      int tittleOneIndex = input.indexOf(lessonTitle); // index of the first lesson;
                      int tittleTwoIndex = input.indexOf(lessonTitleTwo); // index of the second lesson;
                      String removedLesson = lessonTitle;
                      String secondLesson = lessonTitleTwo;
                      input.remove(lessonTitle);
                      input.remove(lessonTitleTwo);
                      input.add(tittleOneIndex, secondLesson);
                      input.add(tittleTwoIndex, removedLesson);

                  }
                  break;
              case "Exercise":

                  // трябва да я продължа !!!
                  break;


          }




            commands = scanner.nextLine();
        }
    }
    public static boolean isThere (List<String> lessons, String tittle){
        return lessons.contains(tittle);
    }
    public static boolean indexValidation (List<String> indexes, int index ){
        return index<= indexes.size() - 1 && index >= 0;
    }
}
