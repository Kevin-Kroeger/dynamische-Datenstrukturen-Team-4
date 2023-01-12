package de.hebk.controll.gui;

import de.hebk.Game;
import de.hebk.controll.Controll;
import de.hebk.gamemode.ModeJeopardy;
import de.hebk.gamemode.ModeNormal;
import de.hebk.gamemode.ModeSurvive;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamemodeSelection extends JFrame implements ActionListener {
    private Controll ctrl;
    private JPanel selection;
    private JButton normal;
    private JButton survive;
    private JButton jeopardy;
    private JButton back;

    /**
     * Konstruktor
     * @param pCtrl
     * @param pTitel
     */
    public GamemodeSelection(Controll pCtrl,String pTitel){
        super(pTitel);
        ctrl = pCtrl;
        this.add(selection);
        normal.addActionListener(this);
        survive.addActionListener(this);
        jeopardy.addActionListener(this);
        back.addActionListener(this);
    }

    /**
     * Actionlistener
     * @param event the event to be processed
     */
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == normal){
            setVisible(false);
            ctrl.getGame().startGame(1);
            ctrl.gamemodeGui(ctrl.getGame().getGamemode());
        }else if(event.getSource() == survive){
            setVisible(false);
            ctrl.getGame().startGame(2);
            ctrl.gamemodeGui(ctrl.getGame().getGamemode());
        }else if(event.getSource() == jeopardy){
            setVisible(false);
            ctrl.getGame().startGame(3);
            ctrl.gamemodeGui(ctrl.getGame().getGamemode());
        }else if(event.getSource() == back){
            ctrl.showMenu();
            this.setVisible(false);
        }
    }
}
