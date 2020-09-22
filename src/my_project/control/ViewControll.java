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
    private boolean erwarteEingabe;


    public ViewControll() {
        i = new ClientInterface(this);
        a = new Anwenderinterface(this);
        erwarteEingabe = false;
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
            spieler.setMeineAuswahl("A");
        }else if(auswahl.equals("schere")){
            spieler.setMeineAuswahl("B");
        }else if(auswahl.equals("papier")){
            spieler.setMeineAuswahl("C");
        }else if(auswahl.equals("brunnen")){
            spieler.setMeineAuswahl("D");
        }else if(auswahl.equals("tornado")){
            spieler.setMeineAuswahl("E");
        }

        if(erwarteEingabe){
            tC.send(spieler.getMeineAuswahl());
        }
    }

    public void setErwarteEingabe(boolean erwarteEingabe) {
        this.erwarteEingabe = erwarteEingabe;
    }

    public void aktualisiereMeineAnzeige(){
        if(spieler.getMeinGegener() != null){
            a.setDerGegner(spieler.getMeinGegener());
        }else a.setDerGegner("");
        a.setSiege(String.valueOf(spieler.getGewonneneRunden()));
        if(spieler.getAuswahlGegner() != null){
            a.setGegnerAuswahl(spieler.getAuswahlGegner());
        }else a.setGegnerAuswahl("");
        if(spieler.getAuswahlGegner().equals("A")){
            a.setGegnerAuswahl("stein");
        }else if(spieler.getAuswahlGegner().equals("B")){
            a.setGegnerAuswahl("schere");
        }else if(spieler.getAuswahlGegner().equals("C")){
            a.setGegnerAuswahl("papier");
        }else if(spieler.getAuswahlGegner().equals("D")){
            a.setGegnerAuswahl("brunnen");
        }else if(spieler.getAuswahlGegner().equals("E")){
            a.setGegnerAuswahl("tornado");
        }

        if(spieler.getLetzteRundeErgebnis() != null){
            a.setEndergebnis(spieler.getLetzteRundeErgebnis());
        }
    }
}
