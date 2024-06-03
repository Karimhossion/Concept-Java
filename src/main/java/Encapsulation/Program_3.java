/*
3. Write a Java program to create a class called Rectangle with private instance
variables length and width. Provide public getter and setter methods to access and 
modify these variables.
 */
package Encapsulation;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
class Rectangle{
    private double length;
    private double width;
    
    public double getlength(){
        return length;
    }
    public void setlength(double length){
        this.length=length;
    }
    public double getwidth(){
        return width;
    }
    public void setwidth(double width){
        this.width=width;
    }
}
public class Program_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter length : ");
        double length=input.nextDouble();
        System.out.println("Enter width : ");
        double width=input.nextDouble();
        Rectangle r=new Rectangle();
        r.setlength(length);
        r.setwidth(width);
        
        System.out.println("length : "+r.getlength());
        System.out.println("WIdth : "+r.getwidth());
    }
}



/*
import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = input.nextDouble();
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        
        Rectangle r = new Rectangle();
        r.setLength(length);
        r.setWidth(width);
        
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}
*/
