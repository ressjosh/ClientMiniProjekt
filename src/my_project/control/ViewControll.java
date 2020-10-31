package my_project.control;

import my_project.model.SpielClient;
import my_project.model.Spieler;
import my_project.view.Anwenderinterface;
import my_project.view.ClientInterface;

public class ViewControll {

    private SpielClient spielClient;
    private Spieler spieler;

    public ViewControll() {

    }

   public void erstelleClient(String serverIP, int serverPort, String name){
        try {
            spielClient = new SpielClient(serverIP, serverPort, this, name);
        }catch(Exception e){
            System.out.println("Dieser Server existiert leider nicht");
        }
   }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }
}
