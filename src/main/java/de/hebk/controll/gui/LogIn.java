package de.hebk.controll.gui;

import de.hebk.controll.Controll;
import de.hebk.user.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame implements ActionListener {
    private JPanel login;
    private String pUsername;
    private int pAge;
    private Controll ctrl;
    private JTextField username;
    private JTextField age;
    private JButton weiterButton;
    private JLabel usernamelabel;
    private JLabel agelabel;

    /**
     * Konstruktor
     * @param pCtrl
     * @param pTitel
     */
    public LogIn(Controll pCtrl,String pTitel){
        super(pTitel);
        ctrl = pCtrl;
        this.add(login);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pAge = 0;
        pUsername = "";
        username.addActionListener(this);
        age.addActionListener(this);
        weiterButton.addActionListener(this);
    }

    /**
     * Actionlistener
     * @param event the event to be processed
     */
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == username){
            pUsername = username.getText();
        }else if(event.getSource() == age){
            pAge = Integer.parseInt(age.getText());
        }else if(event.getSource() == weiterButton){
            if(pUsername == null || pUsername.equals("")){
                username.setBackground(Color.red);
            }else if(pAge == 0){
                age.setBackground(Color.red);
            }else{
                ctrl.getGame().createUser(pUsername,pAge);
                ctrl.showMenu();
                this.setVisible(false);
            }
        }
    }

    /**
     * liefert den Wert pUsername zurück
     * @return
     */
    public String getpUsername() {
        return pUsername;
    }

    /**
     * setzt den Parameter als pUsername
     * @param pUsername
     */
    public void setpUsername(String pUsername) {
        this.pUsername = pUsername;
    }

    /**
     * liefert den Wert pAger zurück
     * @return
     */
    public int getpAge() {
        return pAge;
    }

    /**
     * setzt den Parameter als pAge
     * @param pAge
     */
    public void setpAge(int pAge) {
        this.pAge = pAge;
    }
}
