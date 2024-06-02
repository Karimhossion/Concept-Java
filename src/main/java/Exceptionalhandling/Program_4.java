/*
multiple catch
*/
package Exceptionalhandling;

/**
 *
 * @author Arafat
 */
public class Program_4 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }catch(ArithmeticException e){
            System.out.println("task1 is complete");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task2 is complete");
        }catch(Exception e){
            System.out.println("complete task");
        }
        System.out.println("Rest code............");
    }
}
