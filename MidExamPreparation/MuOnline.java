package MidExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // we take hole array with the rooms
        String [] roomsArr = scanner.nextLine().split("\\|");
        boolean isDead =false;
        int healthInit = 100;
        int bitcoins = 0;
        // we have to separate the elements in the room
        for (int i = 0; i < roomsArr.length ; i++) {
            // we take one room, which contain  two elements [rat 10];
            // we create new array from this element
            String [] room = roomsArr[i].split(" ");
            String command = room[0]; //[rat]
            int num = Integer.parseInt(room[1]); //[10]

            switch (command){

                case "potion":
                    int diffHealth = 100 - healthInit;
                    healthInit = healthInit + num;
                    if(healthInit > 100){
                        num = diffHealth;
                        healthInit = 100;
                    }
                        System.out.printf("You healed for %d hp.%n", num);
                        System.out.printf("Current health: %d hp.%n",healthInit);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n",num);
                    bitcoins +=num;
                    break;
                default:
                    healthInit = healthInit - num;
                    if(healthInit<=0){
                        isDead = true;
                        System.out.printf("You died! Killed by %s.%n",command);
                        System.out.printf("Best room: %d%n", i + 1);
                    }else {
                        System.out.printf("You slayed %s.%n",command);
                    }
                    break;
            }
            if(isDead){
                break;
            }

        }

        if(!isDead){
            //"You've made it!"
            //"Bitcoins: {bitcoins}"
            //"Health: {health}"
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n",healthInit);
        }


    }
}
