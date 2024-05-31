/*2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() 
and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and 
implement the respective methods to calculate the area and perimeter of each shape.*/
package Abstract;

import java.util.Scanner;


/**
 *
 * @author Arafat
 */
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculateArea(){
        return 3.1416*radius*radius;
    }
    @Override
    double calculatePerimeter(){
        return 2*3.1416*radius;
    }
}
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1,double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    double calculateArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    double calculatePerimeter(){
        return side1+side2+side3;
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        double radius;
        System.out.println("Enter the radius: ");
        radius=input.nextDouble();
        
        Shape circle = new Circle(radius);
        System.out.println("Circle Area : "+circle.calculateArea());
        System.out.println("Circle Perimeter : "+circle.calculatePerimeter());
        double side1;
        double side2;
        double side3;
        System.out.println("Enter side1 = ");
        side1=input.nextDouble();
        System.out.println("Enter side2 = ");
        side2=input.nextDouble();
        System.out.println("Enter side3 = ");
        side3=input.nextDouble();
        
        Shape triangle = new Triangle(side1,side2,side3);
        System.out.println("Triangle area : "+triangle.calculateArea());
        System.out.println("Triangle Perimeter : "+triangle.calculatePerimeter());
    }
}
