package problem7;

public class Plumber extends Person{
    public Plumber(String name){
        super(name);
    }

    @Override
    public void display(){
        System.out.println(String.format("I am %s the Plumber", this.getName()));
    }
}
