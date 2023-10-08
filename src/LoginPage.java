package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;
import java.sql.*;

public class LoginPage implements ActionListener{
    JFrame frame = new JFrame("Smart-City Management System");
    JButton loginButton = new JButton("Login");
    JButton signupButton = new JButton("Signup");
    JButton resetButton = new JButton("Reset");
    JButton forgetButton = new JButton("Forget Password");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    JLabel label=new JLabel();
    HashMap<String,String> logininfo = new HashMap<String,String>();
    ImageIcon image=new ImageIcon("login199.jpg");
    JLabel background = new JLabel("",image,JLabel.CENTER);

    LoginPage(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
background.setBounds(0, 0, 750, 600);
        userIDLabel.setBounds(210,120,110,35);
        userIDLabel.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        userIDLabel.setForeground(Color.white);
        userPasswordLabel.setBounds(210,200,110,35);
        userPasswordLabel.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
        userPasswordLabel.setForeground(Color.white);
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));
        userIDField.setBounds(350,120,200,35);
        userIDField.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,17));
        userIDField.setForeground(Color.black);
        userPasswordField.setBounds(350,200,200,35);
        userPasswordLabel.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,23));
                userPasswordLabel.setForeground(Color.white);

        loginButton.setBounds(220,300,100,32);
        loginButton.setBackground(new Color(0,0,0,255));
        loginButton.setForeground(Color.white);
        loginButton.setFocusable(false);
        loginButton.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,17));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userIDField.getText();
                @SuppressWarnings("deprecation")
                String password = userPasswordField.getText();
                try {
                    Connection connection = (Connection)
                            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SignUp", "root", "Vinayak@2002");
                    PreparedStatement st = (PreparedStatement)
                            connection.prepareStatement("Select username, password from sign where username=? and password=?");
                    st.setString(1, username);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        frame.dispose();
                        MainPage MainPage = new MainPage();
                    } else {
                        JOptionPane.showMessageDialog(loginButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        signupButton.setBounds(280,395,200,35);
        signupButton.setBackground(new Color(0,0,0,255));
        signupButton.setForeground(Color.white);
        signupButton.setFocusable(false);
        signupButton.addActionListener(this);
        signupButton.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,17));

        resetButton.setBounds(430,300,100,32);
        resetButton.setBackground(new Color(0,0,0,255));
        resetButton.setForeground(Color.white);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,17));

        forgetButton.setBounds(280,460,200,35);
        forgetButton.setBackground(new Color(0,0,0,255));
        forgetButton.setForeground(Color.white);
        forgetButton.setFocusable(false);
        forgetButton.addActionListener(this);
        forgetButton.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,17));

        frame.setResizable(true);
        frame.add(label);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(signupButton);
        frame.add(resetButton);
        frame.add(forgetButton);
        frame.add(background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==signupButton) {
            frame.dispose();
            Signup s = new Signup();
        }
        if(e.getSource()==forgetButton) {
            frame.dispose();
            Forget v = new Forget();
        }

    }
}
