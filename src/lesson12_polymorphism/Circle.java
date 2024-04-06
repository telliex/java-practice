package lesson12_polymorphism;

public class Circle implements Shape{
    private  double radius;
    public Circle( double radius){
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return radius * 2 * Math.PI;
    }

    public double calculateArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "A circle with radius of " + radius;
    }

}
