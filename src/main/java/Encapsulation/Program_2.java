/*
2. Write a Java program to create a class called BankAccount with private instance variables
accountNumber and balance. Provide public getter and setter methods to access and modify these
variables.
 */
package Encapsulation;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
class BankAccount{
    private String accountNumber;
    private double balance;
    
    public String getaccountNumber(){
        return accountNumber;
    }
    public void setaccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    
    public double getbalance(){
        return balance;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        String accNum=input.nextLine();
        System.out.print("Enter the Balance : ");
        double balance=input.nextDouble();
        
        BankAccount b=new BankAccount();
        b.setaccountNumber(accNum);
        b.setbalance(balance);
        System.out.println("Account Number : "+b.getaccountNumber());
       
        System.out.println("Balance : "+b.getbalance());
    }
}
