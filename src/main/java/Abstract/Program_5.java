/*
12. Write a Java program to create an abstract class GeometricShape with abstract methods area() and 
perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement 
the respective methods to calculate the area and perimeter of each shape.
 */
package Abstract;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
abstract class GeometricShape{
    public abstract double area();
    public abstract double perimeter();
}
class Triangle extends GeometricShape{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle (double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    public double area(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double perimeter(){
        return side1+side2+side3;
    }
}

class Square extends GeometricShape{
    private double side;
    
    public Square(double side)
    {
        this.side=side;
    }
    @Override
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
} 
public class Program_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter side1: ");
        double side1=input.nextDouble();
        
        System.out.println("Enter side2: ");
        double side2=input.nextDouble();
        
        System.out.println("Enter side3: ");
        double side3=input.nextDouble();
        GeometricShape t =new Triangle(side1,side2,side3);
        System.out.println("Triangle area : "+t.area());
        System.out.println("Triangle perimeter : "+t.perimeter());
        
        System.out.println("Enter side: ");
        double side=input.nextDouble();
        GeometricShape s=new Square(side);
        
        System.out.println("Square area : "+s.area());
        System.out.println("Square Perimeter : "+s.perimeter());
    }
}
