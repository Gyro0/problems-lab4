package problem7;

public class Person {
    private String name;

    public Person(String name){this.name=name;}
    public String getName(){return this.name;}
    public void display(){
        System.out.println(String.format("I am %s the Person", this.name));
    }
}

