package lesson12_polymorphism;

public class Triangle {

    private  double side1;
    private  double side2;
    private  double side3;
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side3)*(s-side2)*(s-side1));
    }

    public double calculateArea(){
        return side1+side2+side3;
    }

    public String toString(){
        return "A Triangle with sides" + side1 + "," + side2 + "," + side3 ;
    }
}
