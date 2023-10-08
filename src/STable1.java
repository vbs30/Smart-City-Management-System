package com.company;

import javax.swing.*;
import java.awt.*;

public class STable1 {
    STable1(){
        JFrame frame =new JFrame("List of Schools");
        frame.setSize(1200,670);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        JTextArea t=new JTextArea(39,90);
        JScrollPane scrollableTextArea = new JScrollPane(t);
        t.setText("1.\tActivity High School\n" +
                "2.\tAnandilal Podar High School\n" +
                "3.\tAnjuman - I -Islamic High School & Junior College\n" +
                "4.\n" +
                " \tA .H. Wadia High School\n" +
                "5.\n" +
                " \tAbhyudaya Education English High School\n" +
                "6."+
                " \tActivity High School\n" +
                "\n" +
                "7.\tBalvikas Modern Nursery School\n" +
                "8.\tBarretto High School\n" +
                "9.\tBharda New High School\n" +
                "10.\tBai Ratanbai F D Panday Girl's High School\n" +
                "11.\tBalmohan Vidya Mandir\n" +
                "\n" +
                "12.\tCardinal Gracious High School\n" +
                "13.\tCarmel of St. Joseph School\n" +
                "14.\tCentral Government Employees Education Society’s High School\n" +
                " \n" +
                "15.\tConvent of Jesus and Mary\n" +
                "\n" +
                "16.\tDiamond Jubilee High School\n" +
                "17.\n" +
                " \tDon Bosco High School\n" +
                "18.\tDr Antonia D'Silva Technical High School & Junior College\n" +
                "19.\tDawoodbhoy Fazalbhoy High School\n" +
                "20.\tDiamond Jubilee High School\n" +
                "\n" +
                "21.\tE.E.E. Sassoon High School\n" +
                "22.\tFather Agnel Technical High School\n" +
                "\n" +
                "23.\tGirton High School - Nursery\n" +
                " \n" +
                "24.\tG A Kulkarni High School\n" +
                "25.\tG.D. Somani School\n" +
                "26.\tG B Education Society's High School\n" +
                "\n" +
                "27.\tHindi Vidya Bhavan\n" +
                "28.\tHiraben Manalal Nanavati English High School\n" +
                "29.\tHirjeebhoy Allahrakhia Laljeebhoy Sajan Girls High School\n" +
                " \n" +
                "30.\tHoly Angel English High School\n" +
                "31.\tHoly Cross English School\n" +
                "32.\tHoly Cross High School\n" +
                "\n" +
                "33.\tIndian Education Society's English Primary School\n" +
                " \n" +
                "34.\tIndian Education Society's English School\n" +
                " \n" +
                "35.\tInfant Jesus High School\n" +
                "36.\tI G Bhatia High School\n" +
                " 37.\tI.E.S. VN Sule Guruji English Medium Secondary School\n" +
                "38\tI.J. PaPh Gandhi Shikshan Bhavan\n" +
                "\n" +
                "39.\tJamnabai Narsee School\n" +
                "40.\tJasudben M.L. School\n" +
                "41.\tJ.B.Petit High School for Girls\n" +
                " \n" +
                "42.\tJ.B.Wacha High School for Girls\n" +
                "43.\tJalbhai Dorabji Bharda High School\n" +
                "\n" +
                "44.\tKhojashia Ishanaashari Jamat Primary School\n" +
                "45.\tK. J. Khilnani High School\n" +
                "46.\tKalyanji K Rajpopat School\n" +
                "47.\tKamla High school\n" +
                "48.\tKhar Education Society\n" +
                "49.\tLeelavati Primary School\n" +
                "50.\tLittle Angels English High School\n" +
                "\n" +
                "51.\tLittle Bo Peep\n" +
                "52.\tLady Engineer's High School\n" +
                "53.\tLearners Academy\n" +
                "\n" +
                "54.\tManav Mandir Primary School\n" +
                "55.\tManeckji Cooper Education Trust School\n" +
                "56.\tMarble Arch School\n" +
                "57.\tMarol Education Academy High School\n" +
                "58.\tM. P. Bhutta Primary School\n" +
                "59.\tM.P.Shah English High School\n" +
                "\n" +
                "60.\tNanikram Meghraj Trust Academy\n" +
                " \n" +
                "61.\tNew Activity Primary School\n" +
                " \n" +
                "62.\tNew Model English High School\n" +
                " \n" +
                "63.\tOur Lady of Dolours School\n" +
                " \n" +
                "64.\tOur Lady of Dolours High School\n" +
                " \n" +
                "65.\tOur Lady of Good Counsel Primary School\n" +
                " \n" +
                "66.\tOur Lady of Salvation High School\n" +
                " \n" +
                "\n" +
                "67. \tPragna Bodhini High School\n" +
                "  \n" +
                "68. \tPalm Beach High School  \n" +
                "69. \tParel English School\n" +
                "  \n" +
                "70. \tParle Tilak Vidyalaya English Medium School\n" +
                "  \n" +
                "71. \tPrathamesh Pre-Primary and Primary School\n" +
                "  \n" +
                "\n" +
                "72. \tQueen Mary School  \n" +
                "73. \tRajhans Vidyalaya  \n" +
                "74. \tRamanlal Nagindas Shah High School\n" +
                "  \n" +
                "75. \tRamchand Khemchand Academy\n" +
                "  \n" +
                "76. \tRegina Pacis Convent High School\n" +
                "  \n" +
                "77. \tC.F. Andrews Higher Secondary School\n" +
                "  \n" +
                "78. \tRobert Money Primary School\n" +
                "  \n" +
                "79. \tRose English High School  \n" +
                "\n" +
                "80. \tSaifiya High School  \n" +
                "81. \tS.T.S Mission English High School  \n" +
                "82. \tSacred Heart Boys High School  \n" +
                "83. \tSacred Heart High School  \n" +
                "84. \tSaraswati Mandir English Primary School  \n" +
                "85. \tSardar English High School  \n" +
                "86. \tShardashram Vidya Mandir English Primary School \n" +
                "87. \tSheth M.A.High School  \n" +
                "88. \tShree Gita Vidyalaya  \n" +
                "89. \tShree Kalgidhar Mission High School  \n" +
                "90. \tSardar Sant Singh English Primary School  \n" +
                "91. \tScholars Academy - Chincholi \n" +
                "92. \tSchool of Sacred Heart  \n" +
                "\n" +
                "93.\tTaheri High School\n" +
                "94.\tTaiyabiyah Girls High School\n" +
                "95.\tThe Alexandra Girl's English Institution\n" +
                " \n" +
                "96.\tThe American School of Bombay\n" +
                " \n" +
                "97.\tThe Andhra Education Society's High School\n" +
                " \n" +
                "98.\tThe Bai Awabai Framji Petit Girls High School\n" +
                " \n" +
                "\n" +
                "99.\tUmedbhai PaPh English High School.\n" +
                " \n" +
                "100.\tUniversal English High School\n" +
                " \n" +
                "101.\tUtpal Sanghvi School\n" +
                "102.\tVilla Theresa High School\n" +
                "103.\tVivek Vidyalaya\n" +
                "104.\tValiram Bherumal Melwani High School\n" +
                " \n" +
                "105.\tVanita Vishram Primary School\n" +
                " \n" +
                "\n" +
                "106.\tWalsingham House School\n" +
                "107.\tWilson High School\n" +
                "108.\tYoung Ladies High School\n" +
                "109.\tYashodham Vidyalya\n" +
                "\n");
        t.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,14));

        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollableTextArea);

        frame.setVisible(true);
    }

}
