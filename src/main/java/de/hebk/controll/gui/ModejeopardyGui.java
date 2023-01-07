package de.hebk.controll.gui;

import de.hebk.controll.Controll;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModejeopardyGui extends JFrame implements ActionListener {
    private Controll ctrl;
    private JPanel jeopardy;
    private JLabel topic1;
    private JLabel topic2;
    private JLabel topic3;
    private JLabel topic4;
    private JButton first100;
    private JButton first200;
    private JButton first300;
    private JButton first400;
    private JButton first500;
    private JButton first600;
    private JButton second100;
    private JButton second200;
    private JButton second300;
    private JButton second400;
    private JButton second500;
    private JButton second600;
    private JButton third100;
    private JButton third200;
    private JButton third300;
    private JButton third400;
    private JButton third500;
    private JButton third600;
    private JButton fourth200;
    private JButton fourth300;
    private JButton fourth400;
    private JButton fourth500;
    private JButton fourth600;
    private JButton fourth100;
    private JPanel questions;
    private JTextArea question;
    private JButton answers1;
    private JButton answers3;
    private JButton answers4;
    private JButton answers2;
    private JLabel team1;
    private JLabel team2;
    private JPanel point1;
    private JLabel point2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel answers;
    private JPanel points;
    private JButton homebutton;
    private JPanel home;

    public ModejeopardyGui(Controll pCtrl, String pTitel, String[] pTopics){
        super(pTitel);
        ctrl = pCtrl;

        this.add(jeopardy);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        generateTopicLabel(pTopics);
    }

    public void actionPerformed(ActionEvent event){

    }

    private void generateTopicLabel(String[] pTopic){
        topic1.setText(pTopic[0]);
        topic2.setText(pTopic[1]);
        topic3.setText(pTopic[2]);
        topic4.setText(pTopic[3]);
    }

    private void generateQuestion(){

    }
}
