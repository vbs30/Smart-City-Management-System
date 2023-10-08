package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.*;

public class RealEst implements ActionListener{
    RealEst(){
        JFrame frame = new JFrame("Real Estate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
        ImageIcon image = new ImageIcon("real199.jpeg");
        JLabel background = new JLabel("",image, JLabel.CENTER);
        background.setBounds(550,150,300,200);
        frame.add(background);
        frame.getContentPane().setBackground(new Color(255,184,87,100));

        JLabel label1 = new JLabel("Area:");
        label1.setBounds(170,80,150,50);
        label1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,22));
        frame.add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(270,80,150,50);
        frame.add(text1);

        JRadioButton r3 = new JRadioButton("Industrial Area");
        r3.setBounds(100,220,150,50);
        r3.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        r3.setBackground(new Color(246, 215, 181, 255));
        r3.setFocusable(false);
        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Industrial Area");
                DefaultTableModel model = new DefaultTableModel();
                frame.setSize(750, 600);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                JTable table = new JTable(model);
                model.addColumn("sr_no");
                model.addColumn("plot_location");
                model.addColumn("plot_dimension");
                model.addColumn("plot_rent");
                model.addColumn("rent_sale");
                String plot_location = text1.getText();
                try {
                    Connection connection = (Connection)
                            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signup", "root", "Vinayak@2002");
                    String sql = "select * from realestate where plot_location=?";
                    PreparedStatement st=connection.prepareStatement(sql);
                    st.setString(1, plot_location);
                    ResultSet rs = st.executeQuery();
                    while(rs.next()) {
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }
                }catch(SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                JScrollPane pane = new JScrollPane(table);
                frame.add(pane);
                frame.setLayout(new FlowLayout(FlowLayout.CENTER));
                frame.setVisible(true);
            }
        });
        frame.add(r3);
        JRadioButton r4 = new JRadioButton("Residential Area");
        r4.setBounds(320,220,180,50);
        r4.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        r4.setBackground(new Color(246,215,181,255));
        r4.setFocusable(false);
        r4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Residental Area");
                DefaultTableModel model1 = new DefaultTableModel();
                frame1.setSize(750, 600);
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                JTable table1 = new JTable(model1);
                model1.addColumn("sr_no");
                model1.addColumn("plot_location");
                model1.addColumn("plot_dimension");
                model1.addColumn("plot_rent");
                model1.addColumn("rent_sale");
                model1.addColumn("owner_name");
                model1.addColumn("phoneno");
                String plot_location = text1.getText();
                try {
                    Connection connection = (Connection)
                            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signup", "root", "Vinayak@2002");
                    String sql = "select * from realest where plot_location=?";
                    PreparedStatement st=connection.prepareStatement(sql);
                    st.setString(1, plot_location);
                    ResultSet rs = st.executeQuery();
                    if(rs.next()) {
                        model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }
                }catch(SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                JScrollPane pane1 = new JScrollPane(table1);
                frame1.add(pane1);
                frame1.setLayout(new FlowLayout(FlowLayout.CENTER));
                frame1.setVisible(true);
            }
        });
        frame.add(r4);

        JButton button1 = new JButton("Cancel");
        button1.setBounds(250, 350, 100, 50);
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
               new MainPage();
            }
        });
        frame.add(button1);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(r3);
        group2.add(r4);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
