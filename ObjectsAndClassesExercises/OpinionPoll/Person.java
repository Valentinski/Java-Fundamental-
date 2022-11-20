package ObjectsAndClassesExercises.OpinionPoll;

public class Person {
    //characteristics have to be private
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        //new empty object
        //name = null
        //age = 0
        this.name = name;
        this.age = age;
    }

    //methods and functions
    public String getName(){
        return  this.name;
    }
    public int getAge (){
        return  this.age;
    }
}
