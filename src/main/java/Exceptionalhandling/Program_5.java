/*
exception occurs and handled
*/
package Exceptionalhandling;

/**
 *
 * @author Arafat
 */
public class Program_5 {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block always executed");
        }
        System.out.println("Rest of the code.....");
    }
}
