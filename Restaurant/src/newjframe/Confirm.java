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
public class Confirm extends JFrame {

    JFrame frame;
    JLabel Name;
    JLabel Rest_Name;
    JLabel Address;
    JLabel Rest_Add;
    JLabel Telephone;
    JLabel Number;
    JLabel Openning_hours;
    JLabel Sun;
    JLabel Sun_time;
    JLabel Mon;
    JLabel Mon_time;
    JLabel Tue;
    JLabel Tue_time;
    JLabel Wed;
    JLabel Wed_time;
    JLabel Thur;
    JLabel Thur_time;
    JLabel Fri;
    JLabel Fri_time;
    JLabel Sat;
    JLabel Sat_time;
    JLabel Area;
    JLabel Save;
    JButton Yes;
    JButton No;
    
    
    JLabel num1;
    JLabel num2;
    JLabel num3;
    JLabel Sun_o_m;
    JLabel Sun_o_n;
    JLabel Sun_c_m;
    JLabel Sun_c_n;
    JLabel Mon_o_m;
    JLabel Mon_o_n;
    JLabel Mon_c_m;
    JLabel Mon_c_n;
    JLabel Tue_o_m;
    JLabel Tue_o_n;
    JLabel Tue_c_m;
    JLabel Tue_c_n;
    JLabel Wed_o_m;
    JLabel Wed_o_n;
    JLabel Wed_c_m;
    JLabel Wed_c_n;
    JLabel Thur_o_m;
    JLabel Thur_o_n;
    JLabel Thur_c_m;
    JLabel Thur_c_n;
    JLabel Fri_o_m;
    JLabel Fri_o_n;
    JLabel Fri_c_m;
    JLabel Fri_c_n;
    JLabel Sat_o_m;
    JLabel Sat_o_n;
    JLabel Sat_c_m;
    JLabel Sat_c_n;
    

    Confirm(String rest, String Add, String Del, String tel1, String tel2, String tel3, Object mon_o_m, Object mon_o_n, Object mon_c_m, Object mon_c_n, Object tue_o_m, Object tue_o_n, Object tue_c_m, Object tue_c_n, Object wed_o_m, Object wed_o_n, Object wed_c_m, Object wed_c_n, Object thur_o_m, Object thur_o_n, Object thur_c_m, Object thur_c_n, Object fri_o_m, Object fri_o_n, Object fri_c_m, Object fri_c_n, Object sat_o_m, Object sat_o_n, Object sat_c_m, Object sat_c_n, String sun_o_m, String sun_o_n, Object sun_c_m, Object sun_c_n) {

        frame = new JFrame("Confirm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Name = new JLabel("Restaurant Name:");
        Rest_Name = new JLabel(rest);

        Address = new JLabel("Restaurant Address:");
        Rest_Add = new JLabel(Add);
          //System.out.println(String.valueOf(Rest_Add));

        Telephone = new JLabel("Telephone Number");
        Number = new JLabel("(" + tel1 + ")" + tel2 + "-" + tel3);
        
        Openning_hours = new JLabel("Openning Hours");

        Sun = new JLabel("Sunday :");
        Sun_time = new JLabel(sun_o_m + "h" + sun_o_n + " - " + sun_c_m + "h");

        Mon = new JLabel("Monday :");
        Mon_time = new JLabel(mon_o_m + "h" + mon_o_n + " - " + mon_c_m + "h" + mon_c_n);

        Tue = new JLabel("Tuesday");
        Tue_time = new JLabel(tue_o_m + "h" + tue_o_n + " - " + tue_c_m + "h" + tue_c_n);

        Wed = new JLabel("Wednesday");
        Wed_time = new JLabel(wed_o_m + "h" + wed_o_n + " - " + wed_c_m + "h" + wed_c_n);

        Thur = new JLabel("Thursday");
        Thur_time = new JLabel(thur_o_m + "h" + thur_o_n + " - " + thur_c_m + "h" + thur_c_n);

        Fri = new JLabel("Friday");
        Fri_time = new JLabel(fri_o_m + "h" + fri_o_n + " - " + fri_c_m + "h" + fri_c_n);

        Sat = new JLabel("Saturday");
        Sat_time = new JLabel(sat_o_m + "h" + sat_o_n + " - " + sat_c_m + "h" + sat_c_n);

        Area = new JLabel(Del + " Area covered by this restaurant");

        Save = new JLabel("Would you like to save this restaurant?");

        Yes = new JButton("Yes");
        No = new JButton("No");
        setLayout(null);

        Name.setBounds(50, 40, 200, 20);
        Rest_Name.setBounds(220, 40, 150, 20);

        Address.setBounds(50, 70, 150, 20);
        Rest_Add.setBounds(220, 70, 150, 20);

        Telephone.setBounds(50, 100, 150, 20);
        Number.setBounds(220, 100, 150, 20);

        Openning_hours.setBounds(150, 160, 150, 20);

        Sun.setBounds(50, 180, 150, 20);
        Sun_time.setBounds(210, 180, 150, 20);

        Mon.setBounds(50, 200, 150, 20);
        Mon_time.setBounds(210, 200, 150, 20);

        Tue.setBounds(50, 220, 150, 20);
        Tue_time.setBounds(210, 220, 150, 20);

        Wed.setBounds(50, 240, 150, 20);
        Wed_time.setBounds(210, 240, 150, 20);

        Thur.setBounds(50, 260, 150, 20);
        Thur_time.setBounds(210, 260, 150, 20);

        Fri.setBounds(50, 280, 150, 20);
        Fri_time.setBounds(210, 280, 150, 20);

        Sat.setBounds(50, 300, 150, 20);
        Sat_time.setBounds(210, 300, 150, 20);

        Area.setBounds(60, 330, 300, 20);

        Save.setBounds(60, 380, 300, 20);

        Yes.setBounds(100, 400, 70, 20);
        No.setBounds(200, 400, 50, 20);
        setSize(380, 490);

        num1=new JLabel(tel1);
        num2=new JLabel(tel2);
        num3=new JLabel(tel3);
        Sun_o_m=new JLabel(sun_o_m);
        Sun_o_n=new JLabel(sun_o_n);
        Sun_c_m=new JLabel((String) sun_c_m);
        Sun_c_n=new JLabel((String) sun_c_n);
        Mon_o_m=new JLabel((String) mon_o_m);
        Mon_o_n=new JLabel((String) mon_o_n);
        Mon_c_m=new JLabel((String) mon_c_m);
        Mon_c_n=new JLabel((String) mon_c_n);
        Tue_o_m=new JLabel((String) tue_o_m);
        Tue_o_n=new JLabel((String) tue_o_n);
        Tue_c_m=new JLabel((String) tue_c_m);
        Tue_c_n=new JLabel((String) tue_c_n);
        Wed_o_m=new JLabel((String) wed_o_m);
        Wed_o_n=new JLabel((String) wed_o_n);
        Wed_c_m=new JLabel((String) wed_c_m);
        Wed_c_n=new JLabel((String) wed_c_n);
        Thur_o_m=new JLabel((String) thur_o_m);
        Thur_o_n=new JLabel((String) thur_o_n);
        Thur_c_m=new JLabel((String) thur_c_m);
        Thur_c_n=new JLabel((String) thur_c_n);
        Fri_o_m=new JLabel((String) fri_o_m);
        Fri_o_n=new JLabel((String) fri_o_n);
        Fri_c_m=new JLabel((String) fri_c_m);
        Fri_c_n=new JLabel((String) fri_c_n);
        Sat_o_m=new JLabel((String) sat_o_m);
        Sat_o_n=new JLabel((String) sat_o_n);
        Sat_c_m=new JLabel((String) sat_c_m);
        Sat_c_n=new JLabel((String) sat_c_n);
        
        
        
        add(Name);
        add(Rest_Name);
        add(Address);
        add(Rest_Add);
        add(Telephone);
        add(Number);
        add(Openning_hours);
        add(Sun);
        add(Sun_time);
        add(Mon);
        add(Mon_time);
        add(Tue);
        add(Tue_time);
        add(Wed);
        add(Wed_time);
        add(Thur);
        add(Thur_time);
        add(Fri);
        add(Fri_time);
        add(Sat);
        add(Sat_time);
        add(Area);
        add(Save);
        add(Yes);
        add(No);
        ShowEvent();
    //    Edit();
        setVisible(true);
    }

    public void ShowEvent() {
        
        Yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information", "root", "Joshi94");
                    Statement st = (Statement) con.createStatement();
                    String str = "insert into info(Name,Address,sun_m1,sun_m2,sum_c_m,sun_c_n,mon_o_m,mon_o_n,mon_c_m,mon_c_n,tue_o_m,tue_o_n,tue_c_m,tue_c_n,wed_o_m,wed_o_n,wed_c_m,wed_c_n,thur_o_m,thur_o_n,thur_c_m,thur_c_n,fri_o_m,fri_o_n,fri_c_m,fri_c_n,sat_o_m,sat_o_n,sat_c_m,sat_c_n,tel1,tel2,tel3) values('" + Rest_Name.getText() + "','"+Rest_Add.getText()+"','"+Sun_o_m.getText()+"',"
                            + "'"+Sun_o_n.getText()+"','"+Sun_c_m.getText()+"','"+Sun_c_n.getText()+"','"+Mon_o_m.getText()+"','"+Mon_o_n.getText()+"','"+Mon_c_m.getText()+"','"+Mon_c_n.getText()+"','"+Tue_o_m.getText()+"','"+Tue_o_n.getText()+"','"+Tue_c_m.getText()+"','"+Tue_c_n.getText()+"','"+Wed_o_m.getText()+"','"+Wed_o_n.getText()+"','"+Wed_c_m.getText()+"','"+Wed_c_n.getText()+"','"+Thur_o_m.getText()+"'"
                            + ",'"+Thur_o_n.getText()+"','"+Thur_c_m.getText()+"','"+Thur_c_n.getText()+"','"+Fri_o_m.getText()+"','"+Fri_o_n.getText()+"','"+Fri_c_m.getText()+"','"+Fri_c_m.getText()+"','"+Sat_o_m.getText()+"','"+Sat_o_n.getText()+"','"+Sat_c_m.getText()+"','"+Sat_c_n.getText()+"','"+num1.getText()+"','"+num2.getText()+"','"+num3.getText()+"')";
                    st.executeUpdate(str);
                    
                    
               //     String str1="insert into info(No,Address) values(1,'"+Rest_Add.getText() +"')";
                 //   st.executeUpdate(str1);
                    JOptionPane.showMessageDialog(null, Rest_Name.getText()+"  " + Rest_Add.getText() + "Added Successfully ....!!");
                    
                }   
                  catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                    ex.printStackTrace();
            
                  }
                setVisible(false);
             }
            

        });

        No.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Add_Restaurant ob = new Add_Restaurant();
                ob.setVisible(true);
            }
        });
    }
    
}
