package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Electric {
    Electric(){
        JFrame frame = new JFrame("Electricity System");
        frame.setSize(1000,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("electric_pic.jpg");
        JLabel background = new JLabel("",image, JLabel.CENTER);
        background.setBounds(0,0,1000,700);
        frame.add(background);
        JLabel label1 = new JLabel("Customer name:");
        label1.setBounds(35,100,150,50);
        label1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,20));
        label1.setForeground(new Color(0, 0, 0,255));
        frame.add(label1);
        JLabel label2 = new JLabel("Customer ID:");
        label2.setBounds(35,200,150,50);
        label2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,20));
        label2.setForeground(new Color(0, 0, 0,255));
        frame.add(label2);
        JLabel label3 = new JLabel("Unit Consumed:");
        label3.setBounds(35,300,150,50);
        label3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,20));
        label3.setForeground(new Color(0, 0, 0,255));
        frame.add(label3);

        JTextField text1 = new JTextField();
        text1.setBounds(235,100,200,50);
        text1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,18));
        frame.add(text1);
        JTextField text2 = new JTextField();
        text2.setBounds(235,200,200,50);
        text2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,18));
        frame.add(text2);
        JTextField text3 = new JTextField();
        text3.setBounds(235,300,200,50);
        text3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,18));
        frame.add(text3);
        JTextArea area = new JTextArea();
        area.setBounds(570,80,300,320);
        area.setFont(new Font("Baskerville Old Face", Font.PLAIN,20));
        frame.add(area);

        JButton button1 = new JButton("Generate bill");
        button1.setBounds(20,480,150,50);
        button1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,16));
        button1.setFocusable(false);
        final double[] charge = new double[1];
        final double[] total = new double[1];
        final int[] count = new int[1];
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                String customer_name = text1.getText();
                String customer_id = text2.getText();
                String meter_no = text3.getText();
                try {
                    Connection connection = (Connection)
                            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SignUp", "root", "Vinayak@2002");
                    String sql = "Select customer_id, customer_name,meter_no,current_reading,bill_for,due_date,amount from Electric where customer_id =?";
                    PreparedStatement st=connection.prepareStatement(sql);
                    st.setString(1, customer_id);
                    ResultSet rs = st.executeQuery();
                    while(rs.next())
                    {
                        area.setText("\n\n Customer ID : "+rs.getString(1) +"\n Customer Name :"+ rs.getString(2)+"\n Meter No. :"+rs.getString(3)+"\n Current reading : "+rs.getString(4)+"\n Bill For : "+rs.getString(5)+"\n Due date:"+rs.getString(6));
                        count[0] = Integer.parseInt(text3.getText());
                        if(count[0] <=100)
                        {
                            charge[0] = 10;
                        }
                        else if(count[0] <=200)
                        {
                            charge[0] = 15;
                        }
                        else if(count[0] <=300)
                        {
                            charge[0] = 20;
                        }
                        else if(count[0] >300)
                        {
                            charge[0] = 25;
                        }
                        total[0] = count[0]*charge[0];
                        area.setText(area.getText()+"\n Amount: "+total[0]);
                    }
                }catch(SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
        JButton button3 = new JButton("Cancel");
        button3.setBounds(600,480,150,50);
        button3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,17));
        button3.setFocusable(false);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainPage mainpage = new MainPage();
            }
        });
        frame.add(button3);
        frame.setLayout(null);
        background.add(button1);
        background.add(button3);
        background.add(label1);
        background.add(label2);
        background.add(label3);
        background.add(area);
        frame.setVisible(true);
    }
}
