/*3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount
class and implement the respective methods to handle deposits and withdrawals for each account type.*/
package Abstract;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
abstract class BankAccount {

    private String accNumber;
    private double balance;

    public BankAccount(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getaccNumber() {
        return accNumber;
    }

    public double getbalance() {
        return balance;
    }

    protected void setbalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double ammount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }

    public void deposit(double ammount) {
        setbalance(getbalance() + ammount);
        System.out.println("Deposit of" + ammount + "Successful.");
        System.out.println("Current Balance : " + getbalance());
    }

    public void withdraw(double ammount) {
        if (getbalance() >= ammount) {
            setbalance(getbalance() - ammount);
            System.out.println("Withdraw of " + ammount + "Successful.");
            System.out.println("Current Balance : " + getbalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }

    public void deposit(double ammount) {
        setbalance(getbalance() + ammount);
        System.out.println("Deposit of" + ammount + "Successful.");
        System.out.println("Current balance : " + getbalance());
    }

    public void withdraw(double ammount) {
        if (getbalance() >= ammount) {
            setbalance(getbalance() - ammount);
            System.out.println("Withdrawal of $" + ammount + " successful.");
            System.out.println("Current balance: $" + getbalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }

    }
}
public class Program_3 {
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

        // User input for account details
        System.out.println("__________________Savings account Details_________:");
        System.out.print("Enter account number: ");
        String savingaccNum = input.nextLine();
        System.out.print("Enter initial balance: ");
        double savingbalance = input.nextDouble();

        // Creating a SavingsAccount
        BankAccount saving = new SavingsAccount(savingaccNum, savingbalance);
        System.out.println("Savings Account created: " + savingaccNum + " and balance:" + savingbalance);

      
        System.out.print("Enter deposit ammount: ");
        double savingdeposit = input.nextDouble();
        saving.deposit(savingdeposit);
        System.out.print("Enter withdraw ammount: ");
        double savingwithdraw = input.nextDouble();
        saving.withdraw(savingwithdraw);
        input.nextLine();
        
        System.out.println("_____________________Current Account Details__________:");
        System.out.print("account number: ");
        String currentaccNum = input.nextLine();
        System.out.print("initial balance: ");
        double currentbalance = input.nextDouble();
        
        BankAccount current = new CurrentAccount(currentaccNum, currentbalance);
        System.out.println("Current Account created: " + currentaccNum + " and balance: " + currentbalance);
        
        System.out.print("Enter deposit ammount: ");
        double currentdeposit = input.nextDouble();
        current.deposit(currentdeposit);

        System.out.print("Enter withdraw ammount: ");
        double currentwithdraw = input.nextDouble();
        current.withdraw(currentwithdraw);
    }
}
