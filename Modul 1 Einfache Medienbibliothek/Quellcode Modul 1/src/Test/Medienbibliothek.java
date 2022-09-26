package Test;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Medienbibliothek {

    private ArrayList<Medium> medienliste; //Ersetzbarkeit verwendet

    public Medienbibliothek() {
        this.medienliste = new ArrayList<>();
    }

    public void mediumHinzufügen(Medium m)
    {
        this.medienliste.add(m);
    }

    /*
     * Ausgabe aller Medien in der Bibliothek über Methodenpolymorphie
     */
    public void alleMedienAusgeben()
    {
        for(Medium m : medienliste)
        {
            System.out.println("-----------------------------");
            m.anzeigen(); //polymorpher Methodenaufruf
        }
    }

    /*
     * Methode, die die generische Liste durchläuft und nur VHS aussucht,
     * und diesen dann als eigene Liste zurückgibt.
     * Zweck: Illustration der Funktionsweise des instanceof Operators.
     */
    public ArrayList<VHS> alleVHSalsListe()
    {
        ArrayList<VHS> vhs = new ArrayList<>();
        for(Medium m : medienliste)
        {
            if(m instanceof VHS)
            {
                vhs.add((VHS)m);
            }
        }
        return vhs;
    }
}

