package problem6;

public class Square extends Forme{
    private double side;

    public Square(double side){
        this.side=side;
    }
    @Override
    public double getSurface(){
        return this.side*this.side;
    }
    @Override
    public String toString(){
        return String.format("Square (side %.2f cm)", this.side);
    }
}
