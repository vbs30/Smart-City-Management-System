package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traffic1 {
    Traffic1(){
        JFrame frame = new JFrame("Traffic System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);
        frame.setLayout(null);

        ImageIcon image = new ImageIcon("traffic200.jpg");
        JLabel background = new JLabel("",image, JLabel.RIGHT);
        background.setBounds(500,200,400,150);
        frame.add(background);
        frame.getContentPane().setBackground(new Color(99, 71, 199,255));

        JButton button1 = new JButton("Search");
        button1.setBounds(210,120,250,65);
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Traffic traffic1 = new Traffic();
            }
        });
        frame.add(button1);
        JButton button2 = new JButton("Save info");
        button2.setBounds(210,280,250,65);
        button2.setFocusable(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Traffic2 t = new Traffic2();
            }
        });
        frame.add(button2);
        JButton button3 = new JButton("Cancel");
        button3.setBounds(290,470,100,65);
        button3.setFocusable(false);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
               new MainPage();
            }
        });
        frame.add(button3);
        frame.setVisible(true);
    }
}
