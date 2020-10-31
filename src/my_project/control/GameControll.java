package my_project.control;

import my_project.model.SpielClient;

public class GameControll {

    private SpielClient spielClient;
    private ViewControll vC;

    public GameControll(){
        vC = new ViewControll(this);
    }

    public void erstelleClient(String serverIP, int serverPort){
        try {
            spielClient = new SpielClient(serverIP, serverPort, this);
        }catch(Exception e){
            System.out.println("Dieser Server existiert leider nicht");
        }
   }
}
