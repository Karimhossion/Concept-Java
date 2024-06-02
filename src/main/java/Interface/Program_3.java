/*
3.Write a Java programming to create a banking system with three 
classes - Bank, Account, SavingsAccount, and CurrentAccount. 
The bank should have a list of accounts and methods for adding 
them. Accounts should be an interface with methods to deposit,
withdraw, calculate interest, and view balances. SavingsAccount 
and CurrentAccount should implement the Account interface and 
have their own unique methods.
 */
package Interface;

/**
 *
 * @author Arafat
 */
interface Account{
    void deposit(double amount);
    void withdraw(double amount);
    double getbalance();
}
class SavingsAccount implements Account{
    private double balance;
    private double interestRate;
    
    public SavingsAccount(double balance , double interestrate){
        this.balance=balance;
        this.interestRate=interestRate;
    }
    public void deposit(double amount){
        balance +=amount;
    }
    @Override
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getbalance(){
        return balance;
    }
    
    public void interest(){
        balance+=balance*interestRate/100;
    }
}
/*class CurrentAccount implements Account{
    
}*/
public class Program_3 {
    
}
