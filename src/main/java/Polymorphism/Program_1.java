/*
1. Write a Java program to create a base class Animal (Animal Family)
with a method called Sound(). Create two subclasses Bird and Cat. 
Override the Sound() method in each subclass to make a specific sound 
for each animal.
*/
package Polymorphism;

/**
 *
 * @author Arafat
 */
class Animal{
    public void sound(){
        System.out.println("make a sound");
    }
}
class Bird extends Animal{
    @Override
    public void sound(){
        System.out.println("bird sound");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat sound");
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        Bird b=new Bird();
        b.sound();
        Cat c=new Cat();
        c.sound();
    }
}
