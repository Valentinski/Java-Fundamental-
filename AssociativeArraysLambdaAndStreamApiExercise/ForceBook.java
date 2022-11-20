package AssociativeArraysLambdaAndStreamApiExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){

            if(input.contains("|")){
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                // check if there is this team
                if(!map.containsKey(team)){
                    // I take the team and put empty array list
                    map.put(team, new ArrayList<>());
                    map.get(team). add(player);
                }else {
                    List<String> currentPlayers = map.get(team);
                    boolean isExist = false;
                    // I take list with lists of the teams
                    for (List<String> list : map.values()) {
                        if(list.contains(player));
                        isExist = true;
                    }
                    if(!isExist){
                        currentPlayers.add(player);
                        map.put(team,currentPlayers);
                    }

                }
            }else if(input.contains("->")){
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                // if we have this player, we have to remove them from all teams and we have to place them in another team
                map.entrySet().forEach(entry -> entry.getValue().remove(player));

                //check if the team exist
                if(map.containsKey(team)){
                    List<String> currentPlayers = map.get(team);
                    currentPlayers.add(player);
                    map.put(team, currentPlayers);
                }else { // if not
                    map.put(team, new ArrayList<>());
                    map.get(team). add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }

        // we remove the teams without players
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
