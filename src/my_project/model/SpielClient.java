package my_project.model;

import KAGO_framework.model.abitur.netz.Client;
import my_project.control.GameControll;
import my_project.control.ViewControll;

public class SpielClient extends Client {

    private Spieler meinSpieler;
    private GameControll myControll;
    private String[] aktuelleKommandos;

    public SpielClient(String serverIP, int serverPort, GameControll controll){
        super(serverIP,serverPort);
        myControll = controll;
        meinSpieler = new Spieler();
    }

    @Override
    //Hier kommt die Nachricht an, muss aufgesplittet werden
    public void processMessage(String pMessage) {
        aktuelleKommandos = pMessage.split("//$");
        arbeiteKommandoAb();
    }

    public void arbeiteKommandoAb(){
        if(aktuelleKommandos[0].equals("sende")){
            if(aktuelleKommandos[1].equals("name")){

            }else if(aktuelleKommandos[1].equals("auswahl")){

            }
        }else if(aktuelleKommandos[0].equals("punkte")){
            for(int i = 1; i < aktuelleKommandos.length; i= i +2){
                meinSpieler.setAlleSpieler(aktuelleKommandos[i] + "§" + aktuelleKommandos[i+1]);
            }
        }else if(aktuelleKommandos[0].equals("gegner")){
            if(aktuelleKommandos[1].equals("name")){

            }else if(aktuelleKommandos[1].equals("auswahl")){

            }
        }else if(aktuelleKommandos[0].equals("status")){
            if(aktuelleKommandos[1].equals("rausgeworfen")){

            }else if(aktuelleKommandos[0].equals("aussetzen")){

            }
        }else if(aktuelleKommandos[0].equals("zeit")){

        }


    }

}
