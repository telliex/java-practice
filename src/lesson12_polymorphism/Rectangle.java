package lesson12_polymorphism;

public class Rectangle {
    private  double length;
    private  double width;
    public Rectangle( double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter(){
        return length * width * 2 ;
    }

    public double calculateArea(){
        return length * width;
    }

    public String toString(){
        return "A rectangle of " + length + " by " + width;
    }
}
