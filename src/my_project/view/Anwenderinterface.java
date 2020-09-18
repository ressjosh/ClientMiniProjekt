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
    private JButton startButton;
    private JTextPane textPane1;
    private ViewControll vC;

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

            }
        });
    }

    public void setFensterVisible(boolean b){
        fenster.setVisible(b);
    }

    public void updateNachrichten(String s){
        textPane1.setText(textPane1.getText()+ "\n" + s);
    }
}
