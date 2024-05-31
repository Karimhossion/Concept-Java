/*
5. Write a Java program to create a class called Circle with a private instance
variable radius. Provide public getter and setter methods to access and modify 
the radius variable. However, provide two methods called calculateArea() and 
calculatePerimeter() that return the calculated area and perimeter based on the
current radius value.
 */
package Encapsulation;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
class Circle{
    private double radius;
    
    public double getradius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
    
    public double calculateArea(){
        return 3.1416*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*3.1416*radius;
    }
}
public class Program_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter radius : ");
        double radius=input.nextDouble();
        
        Circle c=new Circle();
        c.setradius(radius);
        
        System.out.println("Radius : "+c.getradius());
        System.out.println("Area : "+c.calculateArea());
        System.out.println("Perimeter : "+c.calculatePerimeter());
    }
}
