package my_project.view;

import javax.swing.*;
import java.awt.*;

import my_project.control.ViewControll;

public class Anwendungsstart {
    private JFrame frame01;
    private JButton charakter01;
    private JButton charakter02;
    private JButton charakter03;
    private JButton charakter04;
    private JButton charakter05;
    private JTextField name;
    private JLabel timer;
    private JPanel mainPanel;
    private JLabel ueberschrift;
    private JLabel tipp01;
    private JLabel tipp02;
    private JButton sendenButton;
    private JButton charakter06;
    private Font aufforderung;
    private boolean sichtbar;
    private ImageIcon icon;
    private ViewControll vC;


    public Anwendungsstart(ViewControll vC){
        this.vC = vC;
        icon = new ImageIcon(getClass().getResource("person.jpg"));
        charakter01.setIcon(icon);
        charakter02.setIcon(icon);
        charakter03.setIcon(icon);
        charakter04.setIcon(icon);
        charakter05.setIcon(icon);
        charakter06.setIcon(icon);

        sichtbar = false;
        aufforderung = new Font("Arial", Font.BOLD, 15);
        ueberschrift.setFont(aufforderung);
        frame01 = new JFrame("Persönliche Attribute");
        frame01.setContentPane(mainPanel);
        frame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame01.pack();
        frame01.setVisible(false);
        frame01.setBounds(600,300,400,300);
        tipp01.setFont(new Font("Arial", Font.ITALIC, 15));
        tipp02.setFont(new Font("Arial", Font.ITALIC, 15));
        timer.setFont(new Font ("Arial", Font.BOLD, 30));

    }

    public void setVisibility(boolean b){
        frame01.setVisible(b);
        sichtbar= b;
    }

    public boolean sichtbar(){
        return sichtbar;
    }

    public void setTimer(String i){
        if(Integer.parseInt(i) < 10) timer.setForeground(Color.RED);
        timer.setText(i);
    }
}
