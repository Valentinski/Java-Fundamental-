package ObjectsAndClassesExercises.ArticleVTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesVTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> titleList = new ArrayList<>();
        List<String> contentList = new ArrayList<>();
        List<String> authorList = new ArrayList<>();

        for (int i = 1; i <=n + 1 ; i++) {
            String input = scanner.nextLine();
            String command = input.split(", ")[0];
            if(command.equals("title") || command.equals("content") || command.equals("author")){
                for (int j = 0; j < n ; j++) {
                    String title = titleList.get(j);
                    String content = contentList.get(j);
                    String author = authorList.get(j);

                    System.out.printf("%s - %s: %s%n", title, content, author);

                }
                break;
            }else {
                String title = input.split(", ")[0];
                String content = input.split(", ")[1];
                String author = input.split(", ")[2];

                titleList.add(title);
                contentList.add(content);
                authorList.add(author);

            }
        }

    }
}
