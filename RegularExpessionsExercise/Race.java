package RegularExpessionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"George, Peter, Bill, Tom".split(", ") ->
        // масив: ["George", "Peter", "Bill", "Tom"]  ->
        // лист: {"George", "Peter", "Bill", "Tom"}
        String names = scanner.nextLine();
        List<String> racersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList()); //списък с имената на състезателите
        //състазател -> дистанция
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        racersNames.forEach(name -> racersDistances.put(name, 0));

        //Regex
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetters);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            //input = "G!32e%o7r#32g$235@!2e"
            //име на състезателя -> само от буквите
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input); //всички букви -> ["G", "e", "o", "r", "g", "e"]
            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }

            //дистанция на състезателя -> сума от цифрите
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input); // всички цифри -> ["3", "2", "7", "3", "2", ...]
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }


            //добавя дистанцията на определения състезател
            String racerName = nameBuilder.toString(); //име на състезателя
            if (racersDistances.containsKey(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put (racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        //състезател -> дистанция
        //George -> 55
        //Peter -> 25
        //Bill -> 11

        List<String> nameOfFirstThree = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //сортирам записите по value (дистанция) в намаляващ ред
                .limit(3) //взима първите 3 записа от мап
                .map(entry -> entry.getKey()) //на всеки запис взимам ключ (име на играч)
                .collect(Collectors.toList()); //{"George", "Peter", "Bill"}

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));



    }
}
