package my_project.view;

import com.sun.tools.javac.Main;
import my_project.control.ViewControll;
import my_project.model.SpielClient;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class Verbindungsaufbau {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField remoteIPText;
    private JTextField portTextField;
    private JButton connectButton;
    private JLabel aufforderung;
    private JLabel ipLabel;
    private JLabel portLabel;
    private ViewControll vC;
    private Font ueberschrift;

    public Verbindungsaufbau(ViewControll vC){
        this.vC = vC;
        ueberschrift = new Font("Arial", Font.ITALIC, 20);
        aufforderung.setFont(ueberschrift);
        frame = new JFrame("Spieler-Client");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(600,300,450,300);


        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        vC.verbindungZumServerSuchen(remoteIPText.getText(), Integer.parseInt(portTextField.getText()));
                        System.out.println("Verbindung zum Server wurde aufgebaut, warten auf weitere Weisungen");
                        System.out.println("..........................................");
                        aktiviereWarteBereich();
                    }catch(NumberFormatException e){
                        System.out.println(e.getMessage());

                }
            }
        });


    }
    private void aktiviereWarteBereich(){
        aufforderung.setText("Herzlich Willkommen im Spiel");
        connectButton.setVisible(false);
        ipLabel.setFont(ueberschrift);
        ipLabel.setText("Warte auf Rückmeldung.....");
        remoteIPText.setVisible(false);
        portTextField.setVisible(false);
        portLabel.setVisible(false);
        portLabel.setVisible(false);
    }

    public void setFensterVisible(boolean b){
        frame.setVisible(b);
    }
}
