package de.hebk.controll.gui;

import de.hebk.controll.Controll;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeJeopardy;
import de.hebk.gamemode.ModeNormal;
import de.hebk.gamemode.ModeSurvive;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leaderboard extends JFrame implements ActionListener {
    private Controll ctrl;
    private JLabel[] modenormalplace;
    private JLabel[] modesurviveplace;
    private JLabel[] modejeopardyplace;
    private JLabel[] modenormalnames;
    private JLabel[] modesurvivenames;
    private JLabel[] modejeopardynames;
    private JPanel leaderboard;
    private JPanel modenormal;
    private JPanel modesurvive;
    private JPanel modejeopardy;
    private JLabel modenormalplace1;
    private JLabel modenormalplace2;
    private JLabel modenormalplace3;
    private JLabel modenormalplace4;
    private JLabel modenormalplace5;
    private JLabel modenormalplace6;
    private JLabel modenormalplace7;
    private JLabel modenormalplace8;
    private JLabel modenormalplace9;
    private JLabel modenormalplace10;
    private JLabel normalScore;
    private JLabel modesurvivescore;
    private JLabel modesurviveplace1;
    private JLabel modesurviveplace2;
    private JLabel modesurviveplace3;
    private JLabel modesurviveplace4;
    private JLabel modesurviveplace5;
    private JLabel modesurviveplace6;
    private JLabel modesurviveplace7;
    private JLabel modesurviveplace8;
    private JLabel modesurviveplace9;
    private JLabel modesurviveplace10;
    private JLabel modejeopardyplace1;
    private JLabel modejeopardyplace2;
    private JLabel modejeopardyplace3;
    private JLabel modejeopardyplace4;
    private JLabel modejeopardyplace5;
    private JLabel modejeopardyplace6;
    private JLabel modejeopardyplace7;
    private JLabel modejeopardyplace8;
    private JLabel modejeopardyplace9;
    private JLabel modejeopardyplace10;
    private JButton menu;
    private JLabel name1;
    private JLabel money;
    private JLabel name2;
    private JLabel pointsurvive;
    private JLabel name3;
    private JLabel pointjeopardy;
    private JLabel modenormalname1;
    private JLabel modenormalname2;
    private JLabel modenormalname3;
    private JLabel modenormalname4;
    private JLabel modenormalname5;
    private JLabel modenormalname6;
    private JLabel modenormalname7;
    private JLabel modenormalname8;
    private JLabel modenormalname9;
    private JLabel modenormalname10;
    private JLabel modesurvivename1;
    private JLabel modesurvivename2;
    private JLabel modesurvivename3;
    private JLabel modesurvivename4;
    private JLabel modesurvivename5;
    private JLabel modesurvivename6;
    private JLabel modesurvivename7;
    private JLabel modesurvivename8;
    private JLabel modesurvivename9;
    private JLabel modesurvivename10;
    private JLabel modejeopardyname1;
    private JLabel modejeopardyname2;
    private JLabel modejeopardyname3;
    private JLabel modejeopardyname4;
    private JLabel modejeopardyname5;
    private JLabel modejeopardyname6;
    private JLabel modejeopardyname7;
    private JLabel modejeopardyname8;
    private JLabel modejeopardyname9;
    private JLabel modejeopardyname10;

    /**
     * Konstruktor
     */
    public Leaderboard(Controll pCtrl,String pTitel){
        super(pTitel);
        ctrl = pCtrl;
        this.add(leaderboard);
        modenormalplace = new JLabel[10];
        modenormalnames = new JLabel[10];
        modejeopardyplace = new JLabel[10];
        modejeopardynames = new JLabel[10];
        modesurviveplace = new JLabel[10];
        modesurvivenames = new JLabel[10];
        addArrayJeopardy();
        addArraynameJeopardy();
        addArrayNormal();
        addArraynameNormal();
        addArraySurvive();
        addArraynameSurvive();
        menu.addActionListener(this);
    }

    /**
     * Actionlistener
     * @param event the event to be processed
     */
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == menu){
            ctrl.showMenu();
        }
    }

    /**
     * Fügt den User zu Bestenliste hinzu
     * @param pGamemode
     */
    public void addPosLeaderboard(Gamemode pGamemode){
        if(pGamemode instanceof ModeNormal){
            for(int i = 0; i < modenormalplace.length-1; i++){
                if(((ModeNormal) pGamemode).getMoney() > Integer.parseInt(modenormalplace[i].getText())){
                    for(int j = i; j < modenormalplace.length; j++){
                        modenormalplace[j] = modenormalplace[j+1];
                    }
                    modenormalnames[i].setText(ctrl.getGame().getUser()[0].getName());
                    modenormalplace[i].setText(ctrl.getGame().getUser()[0].getName());
                    return;
                }
            }
        }else if(pGamemode instanceof ModeSurvive){
            for(int i = 0; i < modesurviveplace.length; i++){
                if(((ModeSurvive) pGamemode).getCount() > Integer.parseInt(modesurviveplace[i].getText())){
                    for(int j = i; j < modesurviveplace.length-1; j++){
                        modesurviveplace[j] = modesurviveplace[j+1];
                    }
                    modesurviveplace[i].setText(ctrl.getGame().getUser()[0].getName());
                    modesurvivenames[i].setText(String.valueOf(ctrl.getGame().getUser()[0].getCount()));
                    return;
                }
            }
        }else if(pGamemode instanceof ModeJeopardy){
            for(int i = 0; i < modesurviveplace.length; i++){
                if(ctrl.getGame().getUser()[0].getPoints() > Integer.parseInt(modejeopardyplace[i].getText())){
                    for(int j = i; j < modejeopardyplace.length-1; j++){
                        modejeopardyplace[j] = modejeopardyplace[j+1];
                    }
                    modejeopardyplace[i].setText(ctrl.getGame().getUser()[0].getName());
                    modejeopardynames[i].setText(String.valueOf(ctrl.getGame().getUser()[0].getPoints()));
                    return;
                }
            }
            for(int i = 0; i < modesurviveplace.length; i++){
                if(ctrl.getGame().getUser()[1].getPoints() > Integer.parseInt(modejeopardyplace[i].getText())){
                    for(int j = i; j < modejeopardyplace.length-1; j++){
                        modejeopardyplace[j] = modejeopardyplace[j+1];
                    }
                    modejeopardyplace[i].setText(ctrl.getGame().getUser()[1].getName());
                    modejeopardynames[i].setText(String.valueOf(ctrl.getGame().getUser()[1].getPoints()));
                }
            }
        }
    }

    /**
     * Packt die Label in ein Array
     */
    public void addArraySurvive(){
        modesurviveplace[0] = modesurviveplace1;
        modesurviveplace[1] = modesurviveplace2;
        modesurviveplace[2] = modesurviveplace3;
        modesurviveplace[3] = modesurviveplace4;
        modesurviveplace[4] = modesurviveplace5;
        modesurviveplace[5] = modesurviveplace6;
        modesurviveplace[6] = modesurviveplace7;
        modesurviveplace[7] = modesurviveplace8;
        modesurviveplace[8] = modesurviveplace9;
        modesurviveplace[9] = modesurviveplace10;
    }

    /**
     * Packt die Label in ein Array
     */
    public void addArrayNormal(){
        modenormalplace[0] = modenormalplace1;
        modenormalplace[1] = modenormalplace2;
        modenormalplace[2] = modenormalplace3;
        modenormalplace[3] = modenormalplace4;
        modenormalplace[4] = modenormalplace5;
        modenormalplace[5] = modenormalplace6;
        modenormalplace[6] = modenormalplace7;
        modenormalplace[7] = modenormalplace8;
        modenormalplace[8] = modenormalplace9;
        modenormalplace[9] = modenormalplace10;
    }

    /**
     * Packt die Label in ein Array
     */
    public void addArrayJeopardy(){
        modejeopardyplace[0] = modejeopardyplace1;
        modejeopardyplace[1] = modejeopardyplace2;
        modejeopardyplace[2] = modejeopardyplace3;
        modejeopardyplace[3] = modejeopardyplace4;
        modejeopardyplace[4] = modejeopardyplace5;
        modejeopardyplace[5] = modejeopardyplace6;
        modejeopardyplace[6] = modejeopardyplace7;
        modejeopardyplace[7] = modejeopardyplace8;
        modejeopardyplace[8] = modejeopardyplace9;
        modejeopardyplace[9] = modejeopardyplace10;
    }

    public void addArraynameNormal(){
        modenormalnames[0] = modenormalname1;
        modenormalnames[1] = modenormalname2;
        modenormalnames[2] = modenormalname3;
        modenormalnames[3] = modenormalname4;
        modenormalnames[4] = modenormalname5;
        modenormalnames[5] = modenormalname6;
        modenormalnames[6] = modenormalname7;
        modenormalnames[7] = modenormalname8;
        modenormalnames[8] = modenormalname9;
        modenormalnames[9] = modenormalname10;
    }

    public void addArraynameSurvive(){
        modesurvivenames[0] = modesurvivename1;
        modesurvivenames[1] = modesurvivename2;
        modesurvivenames[2] = modesurvivename3;
        modesurvivenames[3] = modesurvivename4;
        modesurvivenames[4] = modesurvivename5;
        modesurvivenames[5] = modesurvivename6;
        modesurvivenames[6] = modesurvivename7;
        modesurvivenames[7] = modesurvivename8;
        modesurvivenames[8] = modesurvivename9;
        modesurvivenames[9] = modesurvivename10;
    }

    public void addArraynameJeopardy(){
        modejeopardynames[0] = modejeopardyname1;
        modejeopardynames[1] = modejeopardyname2;
        modejeopardynames[2] = modejeopardyname3;
        modejeopardynames[3] = modejeopardyname4;
        modejeopardynames[4] = modejeopardyname5;
        modejeopardynames[5] = modejeopardyname6;
        modejeopardynames[6] = modejeopardyname7;
        modejeopardynames[7] = modejeopardyname8;
        modejeopardynames[8] = modejeopardyname9;
        modejeopardynames[9] = modejeopardyname10;
    }
}
