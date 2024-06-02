/*
4. Write a Java program to create a class Employee 
with a method called calculateSalary(). 
Create two subclasses Manager and Programmer.
In each subclass, override the calculateSalary()
method to calculate and return the salary based on 
their specific roles.
*/
package Polymorphism;

/**
 *
 * @author Arafat
 */
class Employee{
    private String name;
    private String id;
    public Employee(String name, String id)
    {
        this.name=name;
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }
    public double calculateSalary(){
        return 0;
    }
}
class Manager extends Employee{
    private double baseSalary;
    private double bonus;
    
    public Manager(String name,double baseSalary,double bonus){
        super(name,"Manager");
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }
    
    @Override
    public double calculateSalary(){
        return baseSalary+bonus;
    }
    
}
class Programmer extends Employee{
    private double baseSalary;
    private double bonus;
    
    public Programmer(String name, double baseSalary,double bonus){
        super(name,"Programmer");
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }
    public double calculateSalary(){
        return baseSalary+bonus;
    }
}
public class Program_5 {
    public static void main(String[] args) {
        Employee m=new Manager("karim",7500,1500);
        Employee p=new Programmer("arafat",20000,5000);
        
        System.out.println("Manager : "+m.calculateSalary());
        System.out.println("Programmer : "+p.calculateSalary());
    }
}
