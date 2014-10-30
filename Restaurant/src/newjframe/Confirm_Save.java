/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newjframe;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class Confirm_Save extends JFrame{
    
        JFrame frame;
        JLabel Nam;
        JLabel Tele;
        JLabel Name;
        JLabel Tel;
        JLabel del;
        JLabel Ar;
        JLabel Ar1;
        JLabel Tel1;
        JLabel Tel2;
        JLabel Tel3;
        JLabel save;
        JButton yes;
        JButton no;
        
    Confirm_Save(String name, String tel1,String tel2, String tel3,String DelArea, String area)
    {
        
        frame=new JFrame("Confirm Save");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Nam=new JLabel("NAME: ");
        Name=new JLabel(name);
        Ar=new JLabel(area);
        Ar1=new JLabel(DelArea);
        Tele=new JLabel("Telephone Number:");
        Tel1=new JLabel(tel1);
        Tel2=new JLabel(tel2);
        Tel3=new JLabel(tel3);
        Tel=new JLabel("(" + tel1 + ")" + tel2 + "-" + tel3);
        del=new JLabel(DelArea + " Area covered by this restaurant");
        save=new JLabel("Would you like to save this restaurant?");
        yes=new JButton("Yes");
        no=new JButton("No");
     
        setLayout(null);
        Nam.setBounds(50,40,100,20);
        Name.setBounds(160,40,200,20);
        Tele.setBounds(50, 60, 150, 20);
        Tel.setBounds(180,60, 150, 20);
        del.setBounds(50, 90, 400, 20);
        save.setBounds(60,120,400,20);
        yes.setBounds(80,150,70,30);
        no.setBounds(180,150,70,30);
        setSize(400,300);
        
        add(Nam);
        add(Name);
        add(Tele);
        add(Tel);
        add(del);
        add(save);
        add(yes);
        add(no);
        ShowEvent(name, tel1,tel2, tel3,DelArea,area);
        setVisible(true);
        
    }
    
    public void ShowEvent(String nam,String Tele1,String Tele2, String Tele3, String delarea,String Are)
    {
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Varification verfy=new Varification(nam,Tele1,Tele2,Tele3,delarea,Are);
                    verfy.setVisible(true);
                
             }
            

        });
        
        no.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
         
            setVisible(false);
            Delievery_Man man=new Delievery_Man();
            man.setVisible(true);
        }
        });
    }
        
    }

