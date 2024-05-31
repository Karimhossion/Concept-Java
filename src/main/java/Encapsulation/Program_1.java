/*
Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify 
these variables.
*/
package Encapsulation;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
class Person{
    private String name;
    private int age;
    private String country;
    
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getcountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person p=new Person();
        System.out.println("Enter Name : ");
        String name=input.nextLine();
        
        p.setName(name);
        System.out.println("Enter Age : ");
        int age=input.nextInt();
        p.setAge(age);
        input.nextLine();
        
        
        System.out.println("Enter Country: ");
        String country=input.nextLine();
        p.setCountry(country);
        
        System.out.println("Name : "+p.getName());
        System.out.println("Age : "+p.getage());
        System.out.println("Country : "+p.getcountry());
    }
}
