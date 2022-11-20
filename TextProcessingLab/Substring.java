package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();
        int index = text.indexOf(toRemove);

        // index -1 is invalid
        while (index != -1){
            //we delete the index and it is replaced with " " ;
        text = text.replace(toRemove, "");

        // the index is needed to be searched again
        index = text.indexOf(toRemove);
        }
        System.out.println(text);
    }
}
