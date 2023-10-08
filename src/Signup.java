package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.*;

public class Signup {
    HashMap<String, String> signinfo = new HashMap<String, String>();
    Signup(){
        JFrame frame=new JFrame("Signup Page");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(124, 248, 231,255));
        frame.setLayout(null);
        frame.setVisible(true);
//ImageIcon image=new ImageIcon("Image/city2.jpg");
//JLabel background = new JLabel("Smart City Management",image,JLabel.CENTER);
//background.setBounds(0, 0, 700, 700);
//frame.add(background);
        JLabel name = new JLabel();
        name.setBounds(50,30,200,50);
        name.setText("Name");
        name.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,25));
        frame.add(name);
        JLabel number = new JLabel();
        number.setBounds(50,100,250,50);
        number.setText("Phone.Number:");
        number.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,25));
        frame.add(number);
        JLabel ea = new JLabel();
        ea.setBounds(50,170,200,50);
        ea.setText("Email.Id:");
        ea.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,25));
        frame.add(ea);
        JLabel user = new JLabel();
        user.setBounds(50,240,200,50);
        user.setText("Username");
        user.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,25));
        frame.add(user);
        JLabel password = new JLabel();
        password.setBounds(50,310,200,50);
        password.setText("Password:");
        password.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,25));
        frame.add(password);
        JLabel g = new JLabel();
        g.setBounds(50,380,200,50);
        g.setText("Gender:");
        g.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,25));
        frame.add(g);

        JTextField name1 = new JTextField();
        name1.setBounds(300,30,250,50);
        name1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(name1);
        JTextField number1 = new JTextField();
        number1.setBounds(300,100,250,50);
        number1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(number1);
        JTextField e1 = new JTextField();
        e1.setBounds(300,170,250,50);
        e1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(e1);
        JTextField user1 = new JTextField();
        user1.setBounds(300,240,250,50);
        user1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(user1);
        JPasswordField pass1 = new JPasswordField();
        pass1.setBounds(300,310,250,50);
        pass1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(pass1);

        JRadioButton gender = new JRadioButton("Male");
        gender.setBounds(300, 380, 70, 50);
        gender.setFont(new Font("Times New Roman",Font.BOLD,20));
        gender.setBackground(new Color(144, 243, 229,255));
        gender.setFocusable(false);
        frame.add(gender);
        JRadioButton gender1 = new JRadioButton("Female");
        gender1.setBounds(430, 380, 100, 50);
        gender1.setFont(new Font("Times New Roman",Font.BOLD,20));
        gender1.setBackground(new Color(144, 243, 229,255));
        gender1.setFocusable(false);
        frame.add(gender1);
        ButtonGroup group = new ButtonGroup();
        group.add(gender);
        group.add(gender1);

        JButton r = new JButton("Register");
        r.setFocusable(false);
        r.setBounds(150,500,100,50);
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==r){
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SignUp", "root", "Vinayak@2002");
                        PreparedStatement ps = connection.prepareStatement("insert into SIGN values(?,?,?,?,?,?)");
                        Statement s = connection.createStatement();
                        String gen = null;
                        if(gender.isSelected())
                        {
                            gen = "Male";
                        }
                        if(gender1.isSelected())
                        {
                            gen = "Female";
                        }
                        s.executeUpdate("Insert into SIGN values('"+name1.getText()+"','"+number1.getText()+"','"+e1.getText()+"','"+user1.getText()+"','"+pass1.getText()+"','"+gen+"')");
                        ps.executeUpdate();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,"Your Information has been saved","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        frame.add(r);

        JButton c = new JButton("Cancel");
        c.setFocusable(false);
        c.setBounds(400,500,100,50);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LoginPage(signinfo);
            }
        });
        frame.add(c);

    }
}
