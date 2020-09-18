package my_project.model;

import KAGO_framework.model.abitur.netz.Client;
import my_project.control.ViewControll;

public class SpielClient extends Client {

    private Spieler meinSpieler;
    private ViewControll myControll;

    public SpielClient(String serverIP, int serverPort, ViewControll controll){
        super(serverIP,serverPort);
        myControll = controll;
        meinSpieler = new Spieler();
    }
    @Override
    //Hier kommt die Nachricht an, muss aufgesplittet werden
    public void processMessage(String pMessage) {

    }


}
