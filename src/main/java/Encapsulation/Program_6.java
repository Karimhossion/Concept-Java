/*
7. Write a Java program to create a class called Student with private instance 
variables student_id, student_name, and grades. Provide public getter and setter 
methods to access and modify the student_id and student_name variables. However,
provide a method called addGrade() that allows adding a grade to the grades variable
while performing additional validation.
 */
package Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Arafat
 */
/*class Student{
    public int student_id;
    public String student_name;
    public List<Double> grade;
    
    public int getstudent_id(){
        return student_id;
    }
    public void setstudent_id(int student_id){
        this.student_id=student_id;
    }
    
    public String getstudent_name(){
        return student_name;
    }
    public void setstudent_name(String student_name){
        this.student_name=student_name;
    }
    
    public List <Double> getgrade(){
        return grade;
    }
    public void setgrade(String grade){
        if (grade==null) {
            grade=new ArrayList < > ();
        }
        grade.add(grade);
    }
}
public class Program_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Id : ");
        int student_id=input.nextInt();
        
        System.out.println("Enter Name : ");
        String student_name=input.nextLine();
        
        System.out.println("Enter grade : ");
        String grade=input.nextLine();
        
        Student s=new Student();
        
        s.setstudent_id(student_id);
        s.setstudent_name(student_name);
        s.setgrade(grade);
        
        System.out.println("Id : "+s.getstudent_id());
        System.out.println("Name : "+s.getstudent_name());
        System.out.println("grade : "+s.getgrade());
    }
}
*/