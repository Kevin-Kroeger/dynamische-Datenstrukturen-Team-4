package de.hebk.controll.gui;

import de.hebk.controll.Controll;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeSurvive;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModesurviveGui extends JFrame implements ActionListener {

    private Gamemode gamemode;
    private Controll ctrl;
    private JLabel question;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JPanel panel1;

    public ModesurviveGui(Controll pControll, Gamemode pGamemode, String ptitle) {
        super(ptitle);
        ctrl = pControll;
        this.gamemode = pGamemode;
        gamemode.randomQuestion();
        generateLabelButtontext();


        this.add(panel1);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    private void generateLabelButtontext() {
        gamemode.start();
        question.setText(gamemode.getCurrentQuestion().getQuestion());
        button1.setText(gamemode.getCurrentQuestion().getAnswers()[0]);
        button2.setText(gamemode.getCurrentQuestion().getAnswers()[1]);
        button3.setText(gamemode.getCurrentQuestion().getAnswers()[2]);
        button4.setText(gamemode.getCurrentQuestion().getAnswers()[3]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
