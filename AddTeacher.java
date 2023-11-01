package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tfname;
    JTextField tffname;
    JLabel labelempId;
    JDateChooser dcdob;
    JTextField tfaddress;
    JTextField tfphone;
    JTextField tfemail;
    JTextField tfx;
    JTextField tfxii;
    JTextField tfaadhar;
    JComboBox cbcourse;
    JComboBox cbbranch;
    JButton submit,cancel;
    
    
    Random ran=new Random();
    long first4=Math.abs((ran.nextLong() %9000L)+1000L);
    
    AddTeacher(){
        
        setSize(800,600);
        setLocation(400,50);
        
        setLayout(null);
        
        JLabel heading=new JLabel("New Teacher Details");
        heading.setBounds(310,30,400,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,90,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,16));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,90,150,30);
        add(tfname);
        
        JLabel lblfname=new JLabel("Father's Name");
        lblfname.setBounds(400,90,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,16));
        add(lblfname);
        
        tffname=new JTextField();
        tffname.setBounds(600,90,150,30);
        add(tffname);
        
        
        JLabel lblempId=new JLabel("Employee Id");
        lblempId.setBounds(30,130,300,30);
        lblempId.setFont(new Font("serif",Font.BOLD,16));
        add(lblempId);
        
        labelempId=new JLabel("101"+first4);
        labelempId.setBounds(200,130,300,30);
        labelempId.setFont(new Font("serif",Font.BOLD,16));
        add(labelempId);
        
        JLabel lbldob=new JLabel("Date of Birth");
        lbldob.setBounds(400,130,300,30);
        lbldob.setFont(new Font("serif",Font.BOLD,16));
        add(lbldob);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(600,130,150,30);
        add(dcdob);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30,170,200,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,16));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(200,170,150,30);
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(400,170,300,30);
        lblphone.setFont(new Font("serif",Font.BOLD,16));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(600,170,150,30);
        add(tfphone);
        
        JLabel lblemail=new JLabel("Email Id");
        lblemail.setBounds(30,210,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,16));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,210,150,30);
        add(tfemail);
        
        JLabel lblx=new JLabel("Class X(%)");
        lblx.setBounds(400,210,300,30);
        lblx.setFont(new Font("serif",Font.BOLD,16));
        add(lblx);
        
        tfx=new JTextField();
        tfx.setBounds(600,210,150,30);
        add(tfx);
        
        JLabel lblxii=new JLabel("Class XII(%)");
        lblxii.setBounds(30,250,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,16));
        add(lblxii);
        
        tfxii=new JTextField();
        tfxii.setBounds(200,250,150,30);
        add(tfxii);
        
        JLabel lblaadhar=new JLabel("Aadhar Number");
        lblaadhar.setBounds(400,250,300,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,16));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(600,250,150,30);
        add(tfaadhar);
        
        JLabel lblcourse=new JLabel("Qualification");
        lblcourse.setBounds(30,290,200,30);
        lblcourse.setFont(new Font("serif",Font.BOLD,16));
        add(lblcourse);
        
        String course[]={"MCA","B.Tech","Msc","Bsc","BCA","MBA","MCom","BA","BBA"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(200,290,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        JLabel lblbranch=new JLabel("Department");
        lblbranch.setBounds(400,290,200,30);
        lblbranch.setFont(new Font("serif",Font.BOLD,16));
        add(lblbranch);
        
        String branch[]={"Computer Science","Mechanical","Electronics","Civil","IT"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(600,290,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        submit=new JButton(" submit");
        submit.setBounds(250,450,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        add( submit);
        
        
        cancel=new JButton(" cancel");
        cancel.setBounds(450,450,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add( cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== submit) {
            String name=tfname.getText();
            String fname=tffname.getText();
            String rollno=labelempId.getText();
            String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String x=tfx.getText();
            String xii=tfxii.getText();
            String aadhar=tfaadhar.getText();
            String course=(String)cbcourse.getSelectedItem();
            String branch=(String)cbcourse.getSelectedItem();
            
            try {
                String query="insert into teacher values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"')";
                
                        Conn con=new Conn();
                        con.s.executeUpdate(query);
                        
                        JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
                        setVisible(false);
            } catch(Exception e) {
                e.printStackTrace();
            }
            
             } else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddTeacher();
    }
    
}

    
