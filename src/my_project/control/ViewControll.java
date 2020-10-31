package my_project.control;

import my_project.model.SpielClient;
import my_project.model.Spieler;
import my_project.view.Verbindungsaufbau;

public class ViewControll {

    private SpielClient spielClient;
    private Spieler spieler;

    public ViewControll() {
        new Verbindungsaufbau(this);
    }

    public void verbindungZumServerSuchen(String ip, int port){

    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }
}
