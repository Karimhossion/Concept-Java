/*
3. Write a Java program to create a base class Shape with a 
method called calculateArea(). Create three subclasses:
Circle, Rectangle, and Triangle. Override the calculateArea()
method in each subclass to calculate and return the shape's 
area.
*/
package Polymorphism;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
class Shape{
    public double calculateArea(){
        return 0;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return 3.1416*radius*radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
}
class Triangle extends Shape{
    private double base;
    private double heigth;
    
    public Triangle (double base, double heigth){
        this.base=base;
        this.heigth=heigth;
    }
    @Override
    public double calculateArea(){
        return 0.5*base*heigth;
    }
}
public class Program_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("_______Circle_____:");
        System.out.println("Enter radius : ");
        double radius=input.nextDouble();
        Circle c=new Circle(radius);
        System.out.println("Circle Area : "+c.calculateArea());
        
        System.out.println("___________Rectangle________:");
        System.out.println("Enter length: ");
        double length=input.nextDouble();
        System.out.println("Enter Width : ");
        double width=input.nextDouble();
        Rectangle r=new Rectangle(length,width);
        System.out.println("Rectangle area : "+r.calculateArea());
        
        System.out.println("_____________Triangle_________: ");
        System.out.println("Enter Base : ");
        double base=input.nextDouble();
        System.out.println("Enter width : ");
        double heigth=input.nextDouble();
        Triangle t=new Triangle(base,heigth);
        System.out.println("Triangle area : "+t.calculateArea());
    }
}
