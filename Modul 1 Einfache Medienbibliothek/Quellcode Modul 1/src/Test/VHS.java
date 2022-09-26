package Test;


public class VHS extends Medium { //SChlüsselwort um zu erkennen, dass hier eine Vererbung zwischen der Mutterklasse (Medium) und der Subklasse (VHS) passiert

    private int spieldauer; //jene Datenfelder, die die Mutterklasse und die anderen Subklassen nicht besitzen
    private String qualität;

    public VHS(String titel, double wert, String standort, int spieldauer, String qualität) { //dem Konstruktor werden alle Parameter mitgeben
        super(titel, wert, standort); //Jene Werte, die auch in der Mutterklasse exisiterien werden hier durch super() implementiert
        this.spieldauer = spieldauer; //Zusätzliche-Klasseneigene-Datenfelder
        this.qualität = qualität;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String getQualität() {
        return qualität;
    }

    public void setQualität(String qualität) {
        this.qualität = qualität;
    }

    public void anzeigen() //Überschreiben der Mutterklassenmethode
    {
        super.anzeigen();
        System.out.println("[VHS] Spieldauer -> " + this.getSpieldauer() + " Qualität -> " + this.getQualität());
    }

}

