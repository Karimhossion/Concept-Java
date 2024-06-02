/*
2. Write a Java program to create a class Vehicle with a 
method called speedUp(). Create two subclasses Car and Bicycle
. Override the speedUp() method in each subclass to increase 
the vehicle's speed differently.
 */
package Polymorphism;

/**
 *
 * @author Arafat
 */
class Vehicle{
    public void speedUp(){
        System.out.println("Speed Up");
    }
}
class Car extends Vehicle{
    @Override
    public void speedUp(){
        System.out.println("Car Speed Up");
    }
}
class Bicycle extends Vehicle{
    @Override
    public void speedUp(){
        System.out.println("Bicycle Speed Up");
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        v.speedUp();
        Car c=new Car();
        c.speedUp();
        Bicycle b= new Bicycle();
        b.speedUp();
    }
}
