package my_project.control;

import my_project.model.SpielClient;
import my_project.view.ClientInterface;

public class ViewControll {

    private ClientInterface i;
    private SpielClient tC;


    public ViewControll() {
        i = new ClientInterface(this);
    }


    public void setClientOn(){
        i.setFensterVisible(true);
    }

   public void leiteMessageWeiter(String s){
       i.updateDarstellung(s);
   }

   public void erstelleClient(String serverIP, int serverPort){
        try {
            System.out.println("Erstelle Client mit Server: " + serverIP + ", auf: " + serverPort);
            tC = new SpielClient(serverIP, serverPort, this);
            i.setFensterVisible(false);
        }catch(Exception e){
            System.out.println("Dieser Server existiert leider nicht");
        }
   }

   public void leiteNachrichtAnServer(String s){

    }
}
