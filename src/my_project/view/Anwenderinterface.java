package my_project.view;

import my_project.control.ViewControll;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anwenderinterface {
    private JFrame fenster;
    private JTextField textField1;
    private JPanel mainPanel;
    private JButton sendButton;
    private JLabel derGegner;
    private JLabel siegOderNiederlage;
    private JLabel Siege;
    private JLabel GegnerAuswahl;
    private JLabel Endergebnis;
    private JButton startButton;
    private JTextPane textPane1;
    private ViewControll vC;
    private ImageIcon v;
    

    public Anwenderinterface(ViewControll vC){
        this.vC = vC;
        fenster = new JFrame("Das Spiel, bitte triff deine Auswahl");
        fenster.setContentPane(mainPanel);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(false);
        fenster.setBounds(400,300,400,300);



        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vC.verarbeiteNachricht(textField1.getText());
            }
        });
    }

    public void setFensterVisible(boolean b){
        fenster.setVisible(b);
    }

    public void setDerGegner(String s) {
        derGegner.setText(s);
    }

    public void setSiege(String siege) {
        Siege.setText(siege);
    }

    public void setGegnerAuswahl(String gegnerAuswahl) {
        GegnerAuswahl.setText(gegnerAuswahl);
    }

    public void setEndergebnis(String s){
        Endergebnis.setText(s);
    }
}
