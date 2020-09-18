package my_project.model;

import KAGO_framework.model.abitur.netz.Client;
import my_project.control.ViewControll;

public class SpielClient extends Client {

    private Spieler meinSpieler;
    private ViewControll myControll;
    private String[] aktuelleKommandos;

    public SpielClient(String serverIP, int serverPort, ViewControll controll, String name){
        super(serverIP,serverPort);
        myControll = controll;
        meinSpieler = new Spieler(name);
    }
    @Override
    //Hier kommt die Nachricht an, muss aufgesplittet werden
    public void processMessage(String pMessage) {
        aktuelleKommandos = pMessage.split("$");
        arbeiteKommandoAb();
    }

    public void arbeiteKommandoAb(){

    }

}
