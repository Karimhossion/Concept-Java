/*
4. Write a Java program to create a class called Employee with private instance 
variables employee_id, employee_name, and employee_salary. Provide public getter 
and setter methods to access and modify the id and name variables, but provide a
getter method for the salary variable that returns a formatted string
 */
package Encapsulation;

/**
 *
 * @author Arafat
 */
class Employee{
    private String employee_id;
    private String employee_name;
    private double employee_salary;
    
    public String getemployee_id(){
        return employee_id;
    }
    public void setemployee_id(String employee_id)
    {
        this.employee_id=employee_id;
    }
    public String getemployee_name(){
        return employee_name;
    }
    public void setemployee_name(String employee_name){
        this.employee_name=employee_name;
    }
    
    public double getemployee_salary(){
        return employee_salary;
    }
    public void setemployee_salary(double employee_salary){
        this.employee_salary=employee_salary;
    }
}
public class Program_4 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setemployee_id("231311034asd");
        e.setemployee_name("Md karim");
        e.setemployee_salary(25000);
        
        System.out.println("id = "+e.getemployee_id());
        System.out.println("Name = "+e.getemployee_name());
        System.out.println("Salary = "+e.getemployee_salary());
    }
}
