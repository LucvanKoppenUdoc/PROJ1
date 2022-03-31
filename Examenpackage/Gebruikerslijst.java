package Examenpackage;

import java.util.*;

public class Gebruikerslijst {
    private ArrayList<Gebruiker> gebruikersLijst = new ArrayList<Gebruiker>();


     public Gebruikerslijst(ArrayList<Gebruiker> gebruikersLijst){
         this.gebruikersLijst = gebruikersLijst;
     }

     public Integer getAantalStudenten() {
         return this.gebruikersLijst.size();
     }

    public ArrayList<Gebruiker> getGebruikersLijst() {
        return gebruikersLijst;
    }

    public Gebruiker getStudentOnName(String naam) {
         Gebruiker match = null;
        for (Gebruiker gebruiker : this.gebruikersLijst){
        if (gebruiker.getNaam() == naam) {
            match = gebruiker;
        }


            }
        return match;
        }


    public Gebruiker getStudentOnGebruikerNummer(int gebruikernummer) {
        Gebruiker match = null;
        for (Gebruiker gebruiker : this.gebruikersLijst){
            if (gebruiker.getGebruikerNummer() == gebruikernummer) {
                match = gebruiker;
            }


        }
        return match;
    }


    @Override
    public String toString() {
        return "Gebruikerslijst{" +
                "gebruikersLijst=" + gebruikersLijst +
                '}';
    }
}
