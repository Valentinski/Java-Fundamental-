package ObjectsAndClassesExercises.Articles;

public class Articles {
    //the articles contents:

    //characteristics
    private String title;
    private String content;
    private String author;

    //constructions - create an object
    public Articles (String title, String content, String author){
        //new object from the class Article it has all characteristics, title, content, author.
        // it takes all of them
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //functions: new method
    //there is three functions: edit, changeAuthor, rename
    public void edit (String newContent){

        this.content = newContent;
    }

    public void changeAuthor (String newAuthor){

        this.author = newAuthor;
    }

    public void rename (String newTitle){

        this.title = newTitle;
    }

    @Override // ПРЕНАПИСВАМ метод, за да работи по мой избор
    public  String toString(){
        // how looks like the output
        return this.title + " - " + this.content + ":" + this.author;
    }
}
