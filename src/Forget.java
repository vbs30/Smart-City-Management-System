package com.company;

import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.HashMap;
import javax.swing.*;

public class Forget implements ActionListener {
    HashMap<String, String> proceedinfo = new HashMap<String, String>();

    Forget() {
        HashMap<String, String> proceedinfoOriginal = null;
        proceedinfo = proceedinfoOriginal;
        JFrame frame = new JFrame("Forget Page");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(130, 250, 240,255));
        frame.setLayout(null);
        JLabel e = new JLabel();
        e.setBounds(50, 170, 200, 50);
        e.setText("Email.Id:");
        e.setFont(new Font("Mv Boli", Font.BOLD, 27));
        frame.add(e);
        JLabel number = new JLabel();
        number.setBounds(50, 100, 250, 50);
        number.setText("Phone.Number:");
        number.setFont(new Font("Mv Boli", Font.BOLD, 27));
        frame.add(number);
        JTextField number1 = new JTextField();
        number1.setBounds(300, 100, 250, 50);
        number1.addActionListener(this);
        frame.add(number1);
        JTextField e1 = new JTextField();
        e1.setBounds(300, 170, 250, 50);
        e1.addActionListener(this);
        frame.add(e1);

        JButton proceed = new JButton("Login");
        proceed.setBounds(150, 400, 100, 40);
        proceed.setFocusable(false);
        proceed.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number = number1.getText();
                    String email = e1.getText();
                    try {
                        Connection connection = (Connection)
                                DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signup", "root", "Vinayak@2002");
                        PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select phone_number, email_id from sign where phone_number=? and email_id=?");
                        st.setString(1,number);
                        st.setString(2,email);
                        ResultSet rs = st.executeQuery();
                        if (rs.next()) {
                            frame.dispose();
                            MainPage main = new MainPage();
                        }else {
                            JOptionPane.showMessageDialog(proceed, "Invalid Credentials");
                        }
                    }catch (SQLException sqlException) {
                        sqlException.printStackTrace();
                    }
                }
        });
        frame.add(proceed);
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(380, 400, 100, 40);
        cancel.setFocusable(false);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage(proceedinfo);
            }
        });
        frame.add(cancel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}