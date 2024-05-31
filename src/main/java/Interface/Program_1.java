/*
1.Write a Java program to create an interface Shape with the getArea()
method. Create three classes Rectangle, Circle, and Triangle that 
implement the Shape interface. Implement the getArea() method for each 
of the three classes.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
interface Shape{
    public double getArea();
}
class Rectangle implements Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.1416*radius*radius;
    }
}
class Triangle implements Shape{
    private double base;
    private double height;
    
    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // _________Rectangle_____
        System.out.println("___________Rectangle________:");
        System.out.println("Enter the length : ");
        double length=input.nextDouble();
        System.out.println("Enter the height : ");
        double width=input.nextDouble();
        Rectangle r=new Rectangle(length,width);
        System.out.println("Rectangle Area : "+r.getArea());
        
        System.out.println("___________Circle_________:");
        System.out.print("Enter the radius: ");
        double radius=input.nextDouble();
        Circle c=new Circle(radius);
        System.out.println("Circle Area : "+c.getArea());
        
        System.out.println("__________Triangle__________:");
        System.out.println("Enter the Base : ");
        double base=input.nextDouble();
        System.out.println("Enter the Height : ");
        double height=input.nextDouble();
        Triangle t=new Triangle(base,height);
        System.out.println("Triangle Area : "+t.getArea());
        
    }
}
