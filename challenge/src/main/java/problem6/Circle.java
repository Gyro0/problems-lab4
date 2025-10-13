package problem6;

public class Circle extends Forme{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getSurface(){
        return Math.PI*this.radius*this.radius;
    }
    @Override
    public String toString(){
        return String.format("Circle (radius %.1f cm)", this.radius);
    }
}
