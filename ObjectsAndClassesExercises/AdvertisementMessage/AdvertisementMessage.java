package ObjectsAndClassesExercises.AdvertisementMessage;

import java.lang.reflect.Array;
import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List <String> phrases = Arrays.asList("Excellent product.","Such a great product.","I always use that product.",
                "Best product of its category.","Exceptional product.","I can’t live without this product.");
        List <String> events = Arrays.asList("Now I feel good.","I have succeeded with this product.",
                "Makes miracles. I am happy of the results!","I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied.","I feel great!");
        List <String> authors = Arrays.asList("Diana","Petya","Stella","Elena","Katya","Iva","Annie","Eva");
        List <String> cities = Arrays.asList("Burgas","Sofia","Plovdiv","Varna","Ruse");

        for (int i = 1; i <= n ; i++) {
            Random rnd = new Random();

            int randomIndexPhrases  = rnd.nextInt(phrases.size());
            String phrasesWord = phrases.get(randomIndexPhrases);

            int randomIndexEvent = rnd.nextInt(events.size());
            String eventWord = events.get(randomIndexEvent);

            int randomIndexAuthors = rnd.nextInt(authors.size());
            String authorWord = authors.get(randomIndexAuthors);

            int randomIndexCities  = rnd.nextInt(cities.size());
            String citiesWord = cities.get(randomIndexCities);

            System.out.printf("%s %s %s - %s%n", phrasesWord, eventWord, authorWord, citiesWord);

        }
    }
}
