package de.hebk.controll.gui;

import de.hebk.controll.Controll;
import de.hebk.gamemode.ModeNormal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
    private Controll ctrl;
    private JPanel menu;
    private JButton play;
    private JButton leaderboard;
    private JButton options;
    private JTextArea werWirdMillionärTextArea;
    private JButton profile;
    private JButton beendenButton;

    public Menu(Controll pCtrl,String pTitel){
        super(pTitel);
        ctrl = pCtrl;

        this.add(menu);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        play.addActionListener(this);
        leaderboard.addActionListener(this);
        options.addActionListener(this);
        profile.addActionListener(this);
        beendenButton.addActionListener(this);
    }


    public void actionPerformed(ActionEvent event){
        if(event.getSource() == play){
            this.setVisible(false);
            ctrl.showSelection();
        }else if(event.getSource() == leaderboard){

        }else if(event.getSource() == options){

        }else if(event.getSource() == profile){

        }else if(event.getSource() == beendenButton){
            System.exit(1);
        }
    }


}
