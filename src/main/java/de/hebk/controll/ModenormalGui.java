package de.hebk.controll;

import de.hebk.Game;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeNormal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModenormalGui extends JFrame {

    private Gamemode gamemode;
    private JPanel panel1;
    private JButton antwort1;
    private JButton antwort2;
    private JButton antwort3;
    private JButton antwort4;
    private JLabel frage;
    private JPanel geldAnzeige;
    private JPanel antworten;
    private JPanel fragePanel;

    public ModenormalGui(Gamemode pGamemode, String pTitel){
        super(pTitel);
        gamemode = pGamemode;
        generateLabelButtontext();
        this.setSize(600,400);
        this.setVisible(true);
        this.add(panel1);

        //Bild Wer wird Millionär
        ImageIcon wwm = new ImageIcon("wer-wird-millionaer-20201023-DE-news.jpg");
        JLabel pic = new JLabel(wwm);
        panel1.add(pic);

        antwort1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }



    private void generateLabelButtontext() {
        gamemode.randomQuestion();
        gamemode.getCurrentQuestion().randomAnswers();
        antwort1.setText(gamemode.getCurrentQuestion().getAnswers()[0]);
        antwort2.setText(gamemode.getCurrentQuestion().getAnswers()[1]);
        antwort3.setText(gamemode.getCurrentQuestion().getAnswers()[2]);
        antwort4.setText(gamemode.getCurrentQuestion().getAnswers()[3]);
        frage.setText(gamemode.getCurrentQuestion().getQuestion());
    }
}