package de.hebk.controll.gui;

import de.hebk.controll.Controll;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private Controll ctrl;
    private JPanel menu;
    private JPanel selection;
    private JButton play;
    private JButton leaderboard;
    private JButton options;
    private JButton exit;
    private JButton profile;
    private JPanel top;
    private JLabel icon;

    /**
     * Konstruktor
     * @param pCtrl
     * @param pTitel
     */
    public Menu(Controll pCtrl, String pTitel){
        super(pTitel);
        ctrl = pCtrl;
        this.add(menu);
        Icon pic = new ImageIcon("src/main/java/de/hebk/images/wwm.png");
        icon.setIcon(pic);
        play.addActionListener(this);
        leaderboard.addActionListener(this);
        options.addActionListener(this);
        profile.addActionListener(this);
        exit.addActionListener(this);
    }


    /**
     * Actionlistener
     * @param event the event to be processed
     */
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == play){
            this.setVisible(false);
            ctrl.showSelection();
        }else if(event.getSource() == leaderboard){
            this.setVisible(false);
            ctrl.showLeaderboard();
        }else if(event.getSource() == options){

        }else if(event.getSource() == profile){
            this.setVisible(false);
            ctrl.showProfile();
        }else if(event.getSource() == exit){
            System.exit(1);
        }

    }
}
