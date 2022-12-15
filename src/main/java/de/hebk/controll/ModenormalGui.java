package de.hebk.controll;

import de.hebk.gamemode.Gamemode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModenormalGui extends JFrame implements ActionListener{



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
    private JButton joker1;
    private JButton joker3;
    private JButton joker2;
    private JPanel joker;
    private JLabel money1;
    private JLabel money2;
    private JLabel money3;
    private JLabel money4;
    private JLabel money5;
    private JLabel money6;
    private JLabel money7;
    private JLabel money8;
    private JLabel money9;
    private JLabel money10;
    private JLabel money11;
    private JLabel money12;
    private JLabel money13;
    private JLabel money14;
    private JLabel money15;

    public ModenormalGui(Gamemode pGamemode, String pTitel) {
        super(pTitel);

        gamemode = pGamemode;
        gamemode.randomQuestion();
        generateLabelButtontext();

        this.add(panel1);
        this.setSize(600, 400);
        this.setVisible(true);

        //Icons für Joker
        Icon joker50 = new ImageIcon("src/main/java/de/hebk/images/icons/50-50.png");
        joker1.setIcon(joker50);
        Icon jokertele = new ImageIcon("src/main/java/de/hebk/images/icons/tele.png");
        joker2.setIcon(jokertele);
        Icon jokeraudience = new ImageIcon("src/main/java/de/hebk/images/icons/audience.png");
        joker3.setIcon(jokeraudience);

        antwort1.addActionListener(this);
        antwort2.addActionListener(this);
        antwort3.addActionListener(this);
        antwort4.addActionListener(this);



        //Bild Wer wird Millionär
        ImageIcon wwm = new ImageIcon("wer-wird-millionaer-20201023-DE-news.jpg");
        JLabel pic = new JLabel(wwm);
        //frage.add(pic);

    }
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == antwort1 || event.getSource() == antwort2 || event.getSource() == antwort3 || event.getSource() == antwort4){
                if(gamemode.checkcorrect(((JButton) event.getSource()).getText())){
                    gamemode.nextQuestion();
                    generateLabelButtontext();
                    System.out.println("Korrekt");

                }else{
                    System.out.println("Falsch");
                }
            }
        }






    private void generateLabelButtontext() {
        gamemode.getCurrentQuestion().randomAnswers();
        antwort1.setText(gamemode.getCurrentQuestion().getAnswers()[0]);
        antwort2.setText(gamemode.getCurrentQuestion().getAnswers()[1]);
        antwort3.setText(gamemode.getCurrentQuestion().getAnswers()[2]);
        antwort4.setText(gamemode.getCurrentQuestion().getAnswers()[3]);
        frage.setText(gamemode.getCurrentQuestion().getQuestion());
    }
}