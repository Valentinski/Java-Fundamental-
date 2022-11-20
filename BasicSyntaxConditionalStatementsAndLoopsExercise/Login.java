package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //userName
        String userName = scanner.nextLine();
        // What is the password
        String password= "";
        //reversed userName is the password
        for (int position = userName.length() - 1; position >= 0 ; position--) { // here is the problem !!!
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;

        }
        //повтарящо се действие: да въдеждаме парола
        // stop when the pass is correct
        // continue when the pass is incorrect
        String enteredPass = scanner.nextLine();
        int countFailed = 0;

        while (!enteredPass.equals(password)){
            countFailed++;
            if(countFailed == 4){
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();

        }
        //enteredPass == pass
        if(enteredPass.equals(password)){
            System.out.printf("User %s logged in.", userName);
        }
        //User {username} logged in."
        //Incorrect password. Try again.".
        //User {username} blocked!"

    }

}
