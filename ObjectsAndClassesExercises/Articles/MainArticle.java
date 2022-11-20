package ObjectsAndClassesExercises.Articles;

import ObjectsAndClassesExercises.Articles.Articles;

import java.util.Scanner;

public class MainArticle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        // One object is created from the class Articles
        Articles articles = new Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String newValue = command.split(": ")[1];

            switch (commandName){
                case "Edit":
                    articles.edit(newValue);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(newValue);
                    break;
                case "Rename":
                    articles.rename(newValue);
                    break;
            }
        }
        System.out.println(articles.toString());
    }
}
