/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class add extends JFrame {

    private JFrame main;
    private JLabel Add;
    private JLabel rest_name;
    private JLabel rest_add;
    private JLabel Telephone;
    

    public add() {
        prepareGUI();
    }

    public static void main(String[] args) {
        add obj = new add();
        obj.showEvent();
    }

    private void prepareGUI() {
        setLayout(null);
        main = new JFrame("Food Ordering System");
//        main.setSize(400, 400);
        main.setLayout(new GridLayout(5, 2));
        String text = "<html><b>Add Restaurant</b>";
        Add = new JLabel(text, JLabel.CENTER);
        Add.setFont(new Font(text, Font.BOLD, 18));
        rest_name = new JLabel("Restaurant Name", JLabel.CENTER);
        rest_add = new JLabel("Restaurant Address", JLabel.CENTER);
        rest_name.setSize(350 , 200);

        main.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent windowevent) {
                System.exit(0);
            }
        });
        
        main.add(Add);
        main.add(rest_name);
        main.add(rest_add);
        main.setVisible(true);
    }
    private void showEvent() {
        //Add.setText("Add New Restaurant");
        
    }

}















