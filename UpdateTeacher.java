package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateTeacher extends JFrame implements ActionListener{
    
    JTextField tfaddress,tfphone,tfemail,tfcourse,tfbranch;
    JLabel labelEmpId;
    JButton submit,cancel;
    Choice cEmpId;
    UpdateTeacher(){
        
        setSize(800,600);
        setLocation(400,50);
        
        setLayout(null);
        
        JLabel heading=new JLabel("Update Teacher Details");
        heading.setBounds(30,10,400,50);
        heading.setFont(new Font("Tahoma",Font.ITALIC,35));
        add(heading); 
        
        JLabel lblrollnumber=new JLabel("Select Employee Id");
        lblrollnumber.setBounds(30,70,200,20);
        lblrollnumber.setFont(new Font("Serif",Font.PLAIN,19));
        add(lblrollnumber);
        
        cEmpId=new Choice();
        cEmpId.setBounds(230,70,200,20);
        add(cEmpId);
        
        try {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacher");
            while(rs.next()) {
                cEmpId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,100,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,16));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200,100,150,30);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelname);
        
        JLabel lblfname=new JLabel("Father's Name");
        lblfname.setBounds(400,90,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,16));
        add(lblfname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(600,90,150,30);
        labelfname.setFont(new Font("serif",Font.PLAIN,16));
        add(labelfname);
        
        
        JLabel lblrollno=new JLabel("Employee Id");
        lblrollno.setBounds(30,130,300,30);
        lblrollno.setFont(new Font("serif",Font.BOLD,16));
        add(lblrollno);
        
        labelEmpId=new JLabel();
        labelEmpId.setBounds(200,130,300,30);
        labelEmpId.setFont(new Font("serif",Font.PLAIN,16));
        add(labelEmpId);
        
        JLabel lbldob=new JLabel("Date of Birth");
        lbldob.setBounds(400,130,300,30);
        lbldob.setFont(new Font("serif",Font.BOLD,16));
        add(lbldob);
        
        JLabel labeldob=new JLabel();
        labeldob.setBounds(600,130,150,30);
        labeldob.setFont(new Font("serif",Font.PLAIN,16));
        add(labeldob);
        
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
        
        JLabel labelx=new JLabel();
        labelx.setBounds(600,210,150,30);
        labelx.setFont(new Font("serif",Font.PLAIN,16));
        add(labelx);
        
        JLabel lblxii=new JLabel("Class XII(%)");
        lblxii.setBounds(30,250,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,16));
        add(lblxii);
        
        JLabel labelxii=new JLabel();
        labelxii.setBounds(200,250,150,30);
        labelxii.setFont(new Font("serif",Font.PLAIN,16));
        add(labelxii);
        
        JLabel lblaadhar=new JLabel("Aadhar Number");
        lblaadhar.setBounds(400,250,300,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,16));
        add(lblaadhar);
        
        JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(600,250,150,30);
        labelaadhar.setFont(new Font("serif",Font.PLAIN,16));
        add(labelaadhar);
        
        JLabel lblcourse=new JLabel("Education");
        lblcourse.setBounds(30,290,200,30);
        lblcourse.setFont(new Font("serif",Font.BOLD,16));
        add(lblcourse);
        
        tfcourse=new JTextField();
        tfcourse.setBounds(200,290,150,30);
        add(tfcourse);
        
        JLabel lblbranch=new JLabel("Department");
        lblbranch.setBounds(400,290,200,30);
        lblbranch.setFont(new Font("serif",Font.BOLD,16));
        add(lblbranch);
        
        tfbranch=new JTextField();
        tfbranch.setBounds(600,290,150,30);
        add(tfbranch);
        
        try {
            Conn c=new Conn();
            String query="select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelEmpId.setText(rs.getString("empId"));
                tfcourse.setText(rs.getString("education"));
                tfbranch.setText(rs.getString("department"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                     Conn c=new Conn();
                     String query="select * from techer where empId='"+cEmpId.getSelectedItem()+"'";
                     ResultSet rs=c.s.executeQuery(query);
                     while(rs.next()) {
                        labelname.setText(rs.getString("name"));
                        labelfname.setText(rs.getString("fname"));
                        labeldob.setText(rs.getString("dob"));
                        tfaddress.setText(rs.getString("address"));
                        tfphone.setText(rs.getString("phone"));
                        tfemail.setText(rs.getString("email"));
                        labelx.setText(rs.getString("class_x"));
                        labelxii.setText(rs.getString("class_xii"));
                        labelaadhar.setText(rs.getString("aadhar"));
                        labelEmpId.setText(rs.getString("empId"));
                        tfcourse.setText(rs.getString("education"));
                        tfbranch.setText(rs.getString("department"));
                    }
            
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        
    });
        
        submit=new JButton(" Update");
        submit.setBounds(250,400,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        add( submit);
        
        
        cancel=new JButton(" cancel");
        cancel.setBounds(450,400,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add( cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== submit) {
            String empId=labelEmpId.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String course=tfcourse.getText();
            String branch=tfbranch.getText();
            
           
            try {
                String query="update teacher set address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+course+"',department='"+branch+"' where empId='"+empId+"'";        
                Conn con=new Conn();
                con.s.executeUpdate(query);
                        
                JOptionPane.showMessageDialog(null,"teacher Details Updated Successfully");
                setVisible(false);
            } catch(Exception e) {
                e.printStackTrace();
            }
            
             } else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new UpdateTeacher();
    }
    
}

