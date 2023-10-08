package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Traffic2 {
    Traffic2(){
        JFrame frame = new JFrame("Traffic System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(108, 232, 209,255));

        JLabel name = new JLabel();
        name.setBounds(50,30,200,50);
        name.setText("Start Point");
        name.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(name);
        JLabel number = new JLabel();
        number.setBounds(50,100,250,50);
        number.setText("Destination");
        number.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(number);
        JLabel e = new JLabel();
        e.setBounds(50,170,200,50);
        e.setText("Mode of transport");
        e.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(e);
        JLabel user = new JLabel();
        user.setBounds(50,240,200,50);
        user.setText("Date");
        user.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(user);
        JLabel password = new JLabel();
        password.setBounds(50,310,200,50);
        password.setText("Time");
        password.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(password);
        JLabel username = new JLabel("Username:");
        username.setBounds(50,380,200,50);
        username.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(username);

        JTextField name1 = new JTextField();
        name1.setBounds(320,30,250,50);
        name1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(name1);
        JTextField number1 = new JTextField();
        number1.setBounds(320,100,250,50);
        number1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(number1);
        JTextField e1 = new JTextField();
        e1.setBounds(320,170,250,50);
        e1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(e1);
        JTextField user1 = new JTextField();
        user1.setBounds(320,240,250,50);
        user1.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(user1);
        JTextField user2 = new JTextField();
        user2.setBounds(320,310,250,50);
        user2.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(user2);
        JTextField user3 = new JTextField();
        user3.setBounds(320,380,250,50);
        user3.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,20));
        frame.add(user3);

        JButton button1 = new JButton("Save");
        button1.setBounds(100, 500, 100, 50);
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button1){
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SignUp", "root", "Vinayak@2002");
                        PreparedStatement ps = connection.prepareStatement("insert into SIGN values(?,?,?,?,?,?)");
                        Statement s = connection.createStatement();

                        s.executeUpdate("Insert into Traffic values('"+name1.getText()+"','"+number1.getText()+"','"+e1.getText()+"','"+user1.getText()+"','"+user2.getText()+"','"+user3.getText()+"')");
                        ps.executeUpdate();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,"Your Information has been saved","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        frame.add(button1);
        JButton button2 = new JButton("List");
        button2.setBounds(270, 500, 100, 50);
        button2.setFocusable(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Industrial Area");
                DefaultTableModel model = new DefaultTableModel();
                frame.setSize(750, 600);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                JTable table = new JTable(model);
                model.addColumn("start");
                model.addColumn("destination");
                model.addColumn("Mode of transport");
                model.addColumn("Time");
                model.addColumn("Date");
                String username = user3.getText();
                try {
                    Connection connection = (Connection)
                            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signup", "root", "Vinayak@2002");
                    String sql = "select * from traffic where username=?";
                    PreparedStatement st=connection.prepareStatement(sql);
                    st.setString(1, username);
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
        frame.add(button2);
        JButton button3 = new JButton("Cancel");
        button3.setBounds(440, 500, 100, 50);
        button3.setFocusable(false);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Traffic1 t = new Traffic1();
            }
        });
        frame.add(button3);
        frame.setVisible(true);
    }
}