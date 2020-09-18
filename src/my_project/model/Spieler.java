package my_project.model;

public class Spieler {
    private String name;
    private String meineAuswahl;

    public Spieler(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeineAuswahl(String meineAuswahl) {
        this.meineAuswahl = meineAuswahl;
    }
}
