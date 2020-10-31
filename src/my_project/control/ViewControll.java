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

   /*public void erstelleClient(String serverIP, int serverPort){
        try {
            spielClient = new SpielClient(serverIP, serverPort, this, name);
        }catch(Exception e){
            System.out.println("Dieser Server existiert leider nicht");
        }
   }*/

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }
}
