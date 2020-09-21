package my_project.model;

public class Spieler {
    private String name;
    private String meineAuswahl;
    private int gewonneneRunden;
    private String letzteRundeErgebnis;


    public Spieler(String name) {
        this.name = name;
        gewonneneRunden = 0;
        meineAuswahl = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeineAuswahl(String meineAuswahl) {
        this.meineAuswahl = meineAuswahl;
    }

    public String getName() {
        return name;
    }

    public String getMeineAuswahl() {
        return meineAuswahl;
    }


    public void setGewonneneRunden(int gewonneneRunden) {
        this.gewonneneRunden = gewonneneRunden;
    }

    public void setLetzteRundeErgebnis(String letzteRundeErgebnis) {
        this.letzteRundeErgebnis = letzteRundeErgebnis;
    }

    public void setzeMeineParameter(String letzteRundeErgebnis){

    }

    public int getGewonneneRunden() {
        return gewonneneRunden;
    }

    public String getLetzteRundeErgebnis() {
        return letzteRundeErgebnis;
    }
}
