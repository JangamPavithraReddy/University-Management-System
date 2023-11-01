package university.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class About  extends JFrame{
    
    About(){
        setSize(700,500);
        setLocation(400,150);
       
        
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pavi photo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);
        
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By:JANGAM PAVITHRA REDDY");
        name.setBounds(70, 220, 600, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(name);
        
        JLabel rollno = new JLabel("Roll Number:2021MCA16038");
        rollno.setBounds(70, 250, 600, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno);
        
        JLabel section = new JLabel("Section:A");
        section.setBounds(70, 280, 600, 40);
        section.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(section);
        
           
        JLabel contact = new JLabel("Contact:pavithra.16188@gmail.com");
        contact.setBounds(70, 310, 600, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);

        
        setLayout(null);
        
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new About();
    }
}
