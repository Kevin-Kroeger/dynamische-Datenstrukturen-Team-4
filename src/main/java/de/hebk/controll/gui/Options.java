package de.hebk.controll.gui;

import de.hebk.controll.Controll;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options  extends JFrame implements ActionListener {

    private Controll ctrl;
    private JPanel options;
    private JLabel topics;
    private JButton wissenschaftButton;
    private JButton naturwissenschaftButton;
    private JButton fangfragenButton;
    private JButton musikButton;
    private JButton filmeButton;
    private JButton geschichteButton;
    private JButton erdkundeButton;
    private JPanel back;
    private JButton menu;

    public Options(Controll pCtrl, String pTitel){
        super(pTitel);
        ctrl = pCtrl;
        this.add(options);
        wissenschaftButton.setBackground(Color.GREEN);
        naturwissenschaftButton.setBackground(Color.GREEN);
        fangfragenButton.setBackground(Color.GREEN);
        musikButton.setBackground(Color.GREEN);
        filmeButton.setBackground(Color.GREEN);
        geschichteButton.setBackground(Color.GREEN);
        erdkundeButton.setBackground(Color.GREEN);

        wissenschaftButton.addActionListener(this);
        naturwissenschaftButton.addActionListener(this);
        fangfragenButton.addActionListener(this);
        musikButton.addActionListener(this);
        filmeButton.addActionListener(this);
        geschichteButton.addActionListener(this);
        erdkundeButton.addActionListener(this);
        menu.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == wissenschaftButton || e.getSource() == naturwissenschaftButton|| e.getSource() == fangfragenButton || e.getSource() == musikButton || e.getSource() == filmeButton || e.getSource() == geschichteButton || e.getSource() == erdkundeButton){
            if(((JButton)e.getSource()).getBackground() == Color.GREEN){
                ((JButton)e.getSource()).setBackground(Color.RED);
                ctrl.deleteTopic(((JButton)e.getSource()).getText());
            }else if(((JButton)e.getSource()).getBackground() == Color.RED){
                ((JButton)e.getSource()).setBackground(Color.GREEN);
                ctrl.addTopic(((JButton)e.getSource()).getText());
            }
        }else if(e.getSource() == menu){
            ctrl.showMenu();
            this.setVisible(false);
        }
    }


}
