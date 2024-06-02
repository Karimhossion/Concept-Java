/*
1. Write a Java program that throws an exception and 
catch it using a try-catch block.
 */
package Exceptionalhandling;

/**
 *
 * @author Arafat
 */
public class Program_1 {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
            System.out.println("Result: "+result);

        } catch (ArithmeticException e) {
            System.out.println("Error"+e.getMessage());
        }
    }

    private static int divideNumbers(int divide, int divisor) {
        if (divisor == 0) {

            throw new ArithmeticException("cannot divide the given number by zero.");
        }
        return divide/divisor;
    }
}
