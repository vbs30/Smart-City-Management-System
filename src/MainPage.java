package com.company;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MainPage {
    HashMap<String,String> Maininfo = new HashMap<String,String>();
     MainPage() {
          JFrame frame = new JFrame("Smart-City Management System");
          frame.setSize(850,700);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(null);
          ImageIcon image = new ImageIcon("MainPage1.jpeg");
          JLabel background = new JLabel("",image,JLabel.CENTER);
          background.setBounds(0,0,1200,700);
          frame.add(background);
          /*background.setIcon(image);
          background.setVerticalAlignment(JLabel.CENTER);
          background.setHorizontalAlignment(JLabel.CENTER);
          JLabel l =new JLabel("MUMBAI - THE CITY OF SUCCESS");
          l.setBounds(600,200,500,100);
          l.setFont(new Font("Consolas",Font.BOLD,30));
          l.setForeground(new Color(0,0,0,255));
          frame.add(l);
          background.add(l);
          */
          JButton button = new JButton("");
          button.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
          button.setBounds(150,100,200,200);
          ImageIcon icon1 = new ImageIcon("info.png");
          button.setIcon(icon1);
          button.setFocusable(false);
          button.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    Information info = new Information();
               }
          });
          frame.add(button);

          JButton button1 = new JButton("");
          button1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
          button1.setBounds(450,100,200,200);
          ImageIcon icon2 = new ImageIcon("electricity-logo.jpg");
          button1.setIcon(icon2);
          button1.setFocusable(false);
          button1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    Electric electric = new Electric();
               }
          });
          frame.add(button1);

          JButton button2 = new JButton("");
          button2.setBounds(150,400,200,200);
          button2.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
          ImageIcon icon3 = new ImageIcon("real-estate.jpg");
          button2.setIcon(icon3);
          button2.setFocusable(false);
          button2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    RealEst re = new RealEst();
               }
          });
          frame.add(button2);

          JButton button3 = new JButton("");
          button3.setBounds(450,400,200,200);
          button3.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
          ImageIcon icon4 = new ImageIcon("map.jpg");
          button3.setIcon(icon4);
          button3.setFocusable(false);
          button3.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    Traffic1 traffic = new Traffic1();
               }
          });
          JButton button4 = new JButton("");
          button4.setBounds(660,30,130,40);
          button4.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
          ImageIcon icon = new ImageIcon("logout-button_3.jpg");
          button4.setIcon(icon);
          button4.setFocusable(false);
          button4.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                 frame.dispose();
                 new LoginPage(Maininfo);
             }
          });
          frame.add(button4);
          background.add(button);
          background.add(button1);
          background.add(button2);
          background.add(button3);
          background.add(button4);
          frame.setVisible(true);
     }
}