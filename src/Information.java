package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Information {
    Information(){
        HashMap<String,String> Info = new HashMap<String,String>();
        JFrame frame =new JFrame("");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(239, 228, 9,255));
        JButton button1 = new JButton("");
        button1.setBounds(100,100,200,200);
        button1.setFocusable(false);
        ImageIcon icon1 = new ImageIcon("Education.png");
        button1.setIcon(icon1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new STable1();
            }
        });
        frame.add(button1);
        JButton button2 = new JButton("");
        button2.setBounds(400,100,200,200);
        button2.setFocusable(false);
        ImageIcon icon2 = new ImageIcon("hospital.png");
        button2.setIcon(icon2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new STable2();
            }
        });
        frame.add(button2);
        JButton button3 = new JButton("");
        button3.setBounds(100,400,200,200);
        button3.setFocusable(false);
        ImageIcon icon3 = new ImageIcon("restro.jpg");
        button3.setIcon(icon3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new STabel3();
            }
        });
        frame.add(button3);
        JButton button4 = new JButton("");
        button4.setBounds(400,400,200,200);
        button4.setFocusable(false);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CityInfo();
            }
        });
        frame.add(button4);
        JButton button5 = new JButton("");
        button5.setBounds(520,30,130,40);
        button5.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
        ImageIcon icon = new ImageIcon("logout-button_3.jpg");
        button5.setIcon(icon);
        button5.setFocusable(false);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LoginPage(Info);
            }
        });
        frame.add(button5);
        frame.setVisible(true);
    }

}
