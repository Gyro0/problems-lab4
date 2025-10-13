package problem7;

public class Carpenter extends Person{

    public Carpenter(String name){
        super(name);
    }
    @Override
    public void display(){
        System.out.println(String.format("I am %s the Carpenter", this.getName()));
    }
}
