package com.company;

import javax.swing.*;
import java.awt.*;

public class STabel3 {
    STabel3(){
        JFrame frame =new JFrame("List of Tourist Places");
        frame.setSize(900,650);
        frame.getContentPane().setLayout(new FlowLayout());
        JTextArea t=new JTextArea(35,65);
        JScrollPane scrollableTextArea = new JScrollPane(t);
        t.setText("1.     Gateway of India, Mumbai\r\n"
                + "2.     Sanjay Gandhi National Park, Mumbai\r\n"
                + "3.     Red Carpet Wax Museum, Mumbai\r\n"
                + "4.     Haji Ali Dargah, Mumbai\r\n"
                + "5.     Elephanta Caves, Mumbai\r\n"
                + "6.     Siddhivinayak Temple, Mumbai\r\n"
                + "7.     Chhatrapati Shivaji Terminus (CST), Mumbai\r\n"
                + "8.     Chhatrapati Shivaji Maharaj Vastu Sangrahalaya, Mumbai\r\n"
                + "9.     ISKCON Temple, Mumbai\r\n"
                + "10.   Girgaon Chowpatty, Mumbai\r\n"
                + "11.   Shri Mahalakshmi Temple, Mumbai\r\n"
                + "12.   Powai Lake, Mumbai\r\n"
                + "13.   Nehru Center, Mumbai\r\n"
                + "14.   Taraporewala Aquarium, Mumbai\r\n"
                + "15.   Veermata Jijabai Bhosale Zoo, Mumbai\r\n"
                + "16.   EsselWorld, Mumbai\r\n"
                + "17.   Shivaji Park, Mumbai\r\n"
                + "18.   Juhu Beach, Mumbai\r\n"
                + "19.   Marine Drive, Mumbai\r\n"
                + "20.   Chota Kashmir, Mumbai\r\n"
                + "21.   Worli Sea Face, Mumbai\r\n"
                + "22.   Prithvi Theatre, Mumbai\r\n"
                + "23.   Versova Beach, Mumbai\r\n"
                + "24.   Madh Island, Mumbai\r\n"
                + "25.   Global Vipassana Pagoda, Mumbai\r\n"
                + "26.   Bandra-Worli Sea Link, Mumbai\r\n"
                + "27.   Mumbai Film City, Mumbai\r\n"
                + "28.   Hakone Entertainment Centre, Mumbai\r\n"
                + "29.   Snow World, Mumbai\r\n"
                + "30.   National Gallery Of Modern Art, Mumbai\r\n"
                + "31.   Gorai Beach, Mumbai\r\n"
                + "");
        t.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,14));
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollableTextArea);
        frame.setVisible(true);
    }
}
