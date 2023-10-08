package com.company;

import javax.swing.*;
import java.awt.*;
public class CityInfo {
    CityInfo(){
        JFrame frame= new JFrame("Scrollbar Example");
        frame.setSize(1200,700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon image = new ImageIcon("1mum.jpg");
        JLabel background = new JLabel("",image, JLabel.RIGHT);
        background.setBounds(10,0,520,700);
        frame.add(background);
        frame.getContentPane().setBackground(new Color(67, 179, 203,255));
        JTextArea t = new JTextArea();
        t.setText("\n\t About District\n\n" +
                        "\n" +
                        " Mumbai (also known as Bombay, the official name until 1995) is \n the capital city of the Indian state of Maharashtra." +
        " Mumbai lies on the\n Konkan coast on the west coast of India and has a deep natural\n harbour. In 2008, Mumbai was named an alpha world city. It is also\n the wealthiest city in India, and has the highest number of millionaires\n and billionaires among all cities in India.\n"
//+ "\n"
                +
                " The seven islands that came to constitute Mumbai were home to\n communities of fishing colonies of the Koli people. For centuries, the\n islands were under the control of successive indigenous empires before \n being ceded to the Portuguese Empire and subsequently to the East\n India Company when in 1661 Charles II of England married Catherine\n of Braganza and as partof her dowry Charles received the ports of\n Tangier and Seven Islands of Bombay. During the mid-18th century,\n Bombay was reshaped by the Hornby Vellard project, which\n undertookreclamation of the area between the seven islands from the\n sea. Along with construction ofmajor roads and railways, the\n reclamation project, completed in 1845, transformed Bombay into\n amajor seaport on the Arabian Sea.\n"+
        " Bombay in the 19th century was characterised by economicand\n educational development. During the early 20th century it became a\n strong base for the Indian independence movement.\n Upon India’s independence in 1947 the city was incorporatedinto Bombay State.\n In 1960, following the Samyukta Maharashtra Movement, a new state ofMaharashtra was created with Bombay as the capital.\n" + "\n");
        t.setBounds(570,60,585,525);
        t.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,18));
        frame.add(t);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

