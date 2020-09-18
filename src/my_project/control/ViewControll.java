package my_project.control;

import my_project.model.SpielClient;
import my_project.model.Spieler;
import my_project.view.Anwenderinterface;
import my_project.view.ClientInterface;

public class ViewControll {

    private ClientInterface i;
    private SpielClient tC;
    private Anwenderinterface a;
    private Spieler spieler;


    public ViewControll() {
        i = new ClientInterface(this);
        a = new Anwenderinterface(this);
    }


    public void setClientOn(){
        i.setFensterVisible(true);
    }

   public void leiteMessageWeiter(String s){
       i.updateDarstellung(s);
   }

   public void erstelleClient(String serverIP, int serverPort, String name){
        try {
            System.out.println("Erstelle Client mit Server: " + serverIP + ", auf: " + serverPort);
            tC = new SpielClient(serverIP, serverPort, this, name);
            i.setFensterVisible(false);
            a.setFensterVisible(true);
        }catch(Exception e){
            System.out.println("Dieser Server existiert leider nicht");
        }
   }

   public void leiteNachrichtAnServer(String s){

    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }

    public void verarbeiteNachricht(String auswahl){
        if(auswahl.equals("stein")){
            spieler.setMeineAuswahl("a");
        }else if(auswahl.equals("schere")){
            spieler.setMeineAuswahl("b");
        }else if(auswahl.equals("papier")){
            spieler.setMeineAuswahl("c");
        }else if(auswahl.equals("brunnen")){
            spieler.setMeineAuswahl("d");
        }else if(auswahl.equals("tornado")){
            spieler.setMeineAuswahl("e");
        }
    }
}
