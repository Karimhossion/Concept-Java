
package Exceptionalhandling;

/**
 *
 * @author Arafat
 */
public class Program_3 {
    public static void main(String[] args) {
        try{
            int data=50/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest the code..........");
    }
}
