package Test;

/**
 * Diese Klasse ist eine Mutterklasse und dient zur Erklärung der Vererbung und Polymorphie
 */
public class Medium {

    private String titel; //Jene Datenfelder, die die Subklassen gemeinsam haben
    private double wert;
    private String standort;

    public Medium(String titel, double wert, String standort) { //dem Konstruktor werden jene Parameter mitgegeben, die sie gemein haben
        this.titel = titel;
        this.wert = wert;
        this.standort = standort;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public void anzeigen()
    {
        System.out.println("Medium: Titel -> " + this.getTitel() + " Standort -> " + this.getStandort() + " Wert -> " + this.getWert());
    }

}
