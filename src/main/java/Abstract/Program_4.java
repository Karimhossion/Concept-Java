/*
4. Write a Java program to create an abstract class Animal with abstract methods eat() 
and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and 
implement the eat() and sleep() methods differently based on their specific behavior.
 */
package Abstract;

/**
 *
 * @author Arafat
 */
abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
}
class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lion eat");
    }
    public void sleep(){
        System.out.println("Lion sleep");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger eat");
    }
    public void sleep(){
        System.out.println("Tiger sleep");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer eat");
    }
    public void sleep(){
        System.out.println("Deer sleep");
    }
}
public class Program_4 {
    public static void main(String[] args) {
        Animal l=new Lion();
        l.eat();
        l.sleep();
        
        System.out.println("");
        Animal t=new Tiger();
        t.eat();
        t.sleep();
        
        System.out.println("");
        Animal d= new Deer();
        d.eat();
        d.sleep();
    }
}
