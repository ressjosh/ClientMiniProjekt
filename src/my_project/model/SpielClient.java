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
        String test = "wurst$peter";
        aktuelleKommandos = test.split("\\$");
        System.out.println(aktuelleKommandos[0]);
    }
    @Override
    //Hier kommt die Nachricht an, muss aufgesplittet werden
    public void processMessage(String pMessage) {
        String test = "wurst$peter";
        aktuelleKommandos = test.split("$");
        System.out.println(aktuelleKommandos[0]);
        arbeiteKommandoAb();
    }

    public void arbeiteKommandoAb(){
        if(aktuelleKommandos[0].equals("gegner")){
            if(aktuelleKommandos[1].equals("name")){

            }else if(aktuelleKommandos[1].equals("auswahl")){

            }
        }else if(aktuelleKommandos[0].equals("punkte")){
            meinSpieler.setGewonneneRunden(Integer.parseInt(aktuelleKommandos[1]));
        }else if(aktuelleKommandos[0].equals("sende")){
            if(aktuelleKommandos[1].equals("name")){
                send("name$"+meinSpieler.getName());
                System.out.println("Hello");
            }else if(aktuelleKommandos[1].equals("möglichkeiten")){
                if(meinSpieler.getMeineAuswahl() != null){
                    send("spiele$"+meinSpieler.getMeineAuswahl());
                }else{
                    myControll.setErwarteEingabe(true);
                }
            }
        }else if(aktuelleKommandos[0].equals("status")){
            meinSpieler.setLetzteRundeErgebnis(aktuelleKommandos[1]);
        }
    }

}
