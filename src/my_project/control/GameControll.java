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

   public void nameKannGesendetWerden(){
        vC.nameFensterStart();
   }

   public void auswahlKannGesendetWerden(){
        vC.auswahlKannGesendetWerden();
   }

   public void draussen(String grund){
        vC.draussen(grund);
   }

   public void aussetzen(){
        vC.aussetzen();
   }

   public void zeitUpdate(String zeit){
        vC.zeitUpdate(zeit);
   }
}