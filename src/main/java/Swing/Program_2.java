/*
swing by inheritance
*/
package Swing;
import javax.swing.*;
/**
 *
 * @author Arafat
 */

public class Program_2 extends JFrame {
    Program_2(){
        JButton b= new JButton("Click");
        b.setBounds(130,100,100,40);
        
        JCheckBox c= new JCheckBox("Check me");
        c.setBounds(130,150,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Program_2();
    }
}
