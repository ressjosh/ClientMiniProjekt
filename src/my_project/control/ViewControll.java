package my_project.control;

import my_project.model.SpielClient;
import my_project.model.Spieler;
import my_project.view.Anwendungsstart;
import my_project.view.SpielInterface;
import my_project.view.Verbindungsaufbau;

import javax.swing.*;

public class ViewControll {

    private SpielClient spielClient;
    private Spieler spieler;
    private GameControll gC;
    private Verbindungsaufbau verbindungsaufbau;
    private Anwendungsstart anwendungsstart;
    private SpielInterface spielInterface;

    public ViewControll(GameControll gameControll) {
        verbindungsaufbau = new Verbindungsaufbau(this);
        anwendungsstart = new Anwendungsstart(this);
        spielInterface = new SpielInterface(this);
        gC = gameControll;
    }

    public void verbindungZumServerSuchen(String ip, int port){
        gC.erstelleClient(ip, port);
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }

    public void nameFensterStart(){
        verbindungsaufbau.setFensterVisible(false);
        anwendungsstart.setVisibility(true);
    }

    public void auswahlKannGesendetWerden(){
        //TODO SpielInterface
    }

    public void draussen(String grund){
        verbindungsaufbau.setFensterVisible(true);
        spielInterface.setFensterVisible(false);
        anwendungsstart.setVisibility(false);
        JOptionPane.showMessageDialog(null,grund);
    }

    public void aussetzen(){
        //TODO Button und so müssen erledigt werden
    }

    public void zeitUpdate(String zeit){
        if (anwendungsstart.sichtbar()) anwendungsstart.setTimer(zeit);
        //TODO SPIELINTERFACE TIMER
    }

}
