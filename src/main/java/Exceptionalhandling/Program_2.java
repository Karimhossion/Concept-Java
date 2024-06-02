/*
Write a Java program to create a method that takes an integer
as a parameter and throws an exception if the number is odd.
 */
package Exceptionalhandling;

/**
 *
 * @author Arafat
 */
public class Program_2 {

    public static void main(String[] args) {
        int n = 18;
        trynumber(n);
        n = 7;
        trynumber(n);
    }

    private static void trynumber(int n) {
        try {
            checkeventNumber(n);
            System.out.println("even =" + n);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void checkeventNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Odd: " + number);
        }
    }
}
