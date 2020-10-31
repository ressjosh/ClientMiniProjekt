package my_project.view;

import javax.swing.*;
import java.awt.*;

public class Anwendungsstart {
    private JFrame frame;
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
    private Font aufforderung;
    private boolean sichtbar;

    public Anwendungsstart(){
        /*ii = new ImageIcon(getClass().getResource("informatikbild.jpg"));
        Graphics g = ii.getImage().getGraphics();
        aufforderung.setIcon(ii);
*/
        sichtbar = false;
        aufforderung = new Font("Arial", Font.BOLD, 15);
        ueberschrift.setFont(aufforderung);
        frame = new JFrame("Persönliche Attribute");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(600,300,400,300);
        tipp01.setFont(new Font("Arial", Font.ITALIC, 5));
        tipp02.setFont(new Font("Arial", Font.ITALIC, 5));
        timer.setFont(new Font ("Arial", Font.BOLD, 20));

    }

    public void setVisibility(boolean b){
        frame.setVisible(b);
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
