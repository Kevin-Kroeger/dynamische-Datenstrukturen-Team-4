package de.hebk.controll.gui;

import de.hebk.controll.Controll;

import javax.swing.*;
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

    public Options(Controll pCtrl, String pTitel){
        super(pTitel);
        ctrl = pCtrl;
        this.add(options);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
