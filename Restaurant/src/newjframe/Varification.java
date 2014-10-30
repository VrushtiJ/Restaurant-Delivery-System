/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class Varification extends JFrame {
    
    JFrame frame;
    JTextField Username;
    JLabel User;
    JLabel Pass;
    JPasswordField Password;
    JPasswordField Con_Pass;
    JLabel Confirm_Password;
    JButton Yes;
    JButton No;
    
    JLabel Name;
    JLabel Tel1;
    JLabel Tel2;
    JLabel Tel3;
    JLabel Ar;
    JLabel Ar1;
    
    Varification(String name, String tel1,String tel2,String tel3,String ar1,String ar)
    {
        frame=new JFrame("Create new Delivery man");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        User=new JLabel("Username: ");
        Pass=new JLabel("Password: ");
        Confirm_Password=new JLabel("Confirm Password: ");
        Yes=new JButton("Yes");
        No=new JButton("No");
        Password=new JPasswordField();
        Username=new JTextField();
        Con_Pass=new JPasswordField();
        
        Name=new JLabel(name);
        Tel1=new JLabel(tel1);
        Tel2=new JLabel(tel2);
        Tel3=new JLabel(tel3);
        Ar1=new JLabel(ar1);
        Ar=new JLabel(ar);
        
        setLayout(null);
        
        User.setBounds(50,40,100,20);
        Username.setBounds(180,40,200,20);
        Pass.setBounds(50,60,100,20);
        Password.setBounds(180,60,200,20);
        Confirm_Password.setBounds(50,80,150,20);
        Con_Pass.setBounds(210,80,200,20);
        Yes.setBounds(80,120,80,20);
        No.setBounds(200,120,80,20);
        
        setSize(400,400);
        
        add(User);
        add(Username);
        add(Pass);
        add(Password);
        add(Confirm_Password);
        add(Con_Pass);
        add(Yes);
        add(No);
        Data();
        setVisible(true);
    }
    
    
    public void Data()
    {
         Yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Con_Pass.getText().equals(Password.getText()))
                {
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information", "root", "Joshi94");
                    Statement st = (Statement) con.createStatement();
                    String str = "insert into delivey_man(Name,Tel1,Tel2,Tel3,Del_Area,area,Username,Password) values('" + Name.getText() + "','"+Tel1.getText()+"','" + Tel2.getText() + "','"+Tel3.getText()+"','"+Ar1.getText()+"','"+Ar.getText()+"','" +Username.getText()+"','"+Password.getText()+"')";
                    st.executeUpdate(str);
                    
                    
               //     String str1="insert into info(No,Address) values(1,'"+Rest_Add.getText() +"')";
                 //   st.executeUpdate(str1);
                    JOptionPane.showMessageDialog(null, Name.getText()+ "Added Successfully ....!!");
                   
                }   
                  catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                    ex.printStackTrace();
            
                  }
                setVisible(false);
             }
            }

        });
         
         No.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            setVisible(false);
            Delievery_Man man=new Delievery_Man();
            man.setVisible(true);
        }
    });
     }
}
