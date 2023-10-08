package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Traffic {
    Traffic(){
        JFrame frame = new JFrame("Traffic System");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(108,232,209,255));
        JLabel l1 = new JLabel("Source :");
        l1.setBounds(180, 80, 100, 50);
        l1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));
        JLabel l2 = new JLabel("Destination :");
        l2.setBounds(180, 200, 100, 50);
        l2.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,18));

        JTextField t1 = new JTextField();
        t1.setBounds(330, 80, 180, 50);
        JTextField t2 = new JTextField();
        t2.setBounds(330, 200, 180, 50);

        JButton button1 = new JButton("Check");
        button1.setBounds(150,370,150,50);
        button1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,16));
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Route Information");
                DefaultTableModel model = new DefaultTableModel();
                frame.setSize(750, 600);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                JTable table = new JTable(model);
                model.addColumn("sr_no");
                model.addColumn("Route_name");
                model.addColumn("Best mode of Transport");
                model.addColumn("Start Point");
                model.addColumn("Destination");

                String start = t1.getText();
                String destination = t2.getText();
                try {
                    Connection connection = (Connection)
                            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signup", "root", "Vinayak@2002");
                    String sql = "select * from traffic1 where start=? and destination=?";
                    PreparedStatement st=connection.prepareStatement(sql);
                    st.setString(1, start);
                    st.setString(2, destination);
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
        JButton button2 = new JButton("Cancel");
        button2.setBounds(380,370,150,50);
        button2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,16));
        button2.setFocusable(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Traffic1 t = new Traffic1();
            }
        });
        frame.add(button1);
        frame.add(l2);
        frame.add(l1);
        frame.add(t1);
        frame.add(t2);
        frame.add(button2);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
