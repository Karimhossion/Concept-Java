/*
2. Write a Java program to create a Animal interface with a method called bark()
that takes no arguments and returns void. Create a Dog class that implements Animal
and overrides speak() to print "Dog is barking".
 */
package Interface;

/**
 *
 * @author Arafat
 */
interface Animal{
    public void bark();
}
class Dog implements Animal{
    public void bark(){
        System.out.println("Dog is braking");
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
    }
}
