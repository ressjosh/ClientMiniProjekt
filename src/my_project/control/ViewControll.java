package my_project.control;

import my_project.model.SpielClient;
import my_project.model.Spieler;
import my_project.view.Verbindungsaufbau;

public class ViewControll {

    private SpielClient spielClient;
    private Spieler spieler;
    private GameControll gC;

    public ViewControll(GameControll gameControll) {
        new Verbindungsaufbau(this);
        gC = gameControll;
    }

    public void verbindungZumServerSuchen(String ip, int port){
        gC.erstelleClient(ip, port);
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }
}
