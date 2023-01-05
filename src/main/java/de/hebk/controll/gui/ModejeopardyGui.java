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
