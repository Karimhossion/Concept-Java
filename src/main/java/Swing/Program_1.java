//Creating one button and adding it on the JFrame object inside the main() method. 
package Swing;

import javax.swing.*;

/**
 *
 * @author Arafat
 */
public class Program_1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton("Click");
        b.setBounds(130,100,100,40);
        
        f.add(b);
        
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
