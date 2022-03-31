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

    public void getStudentOnName(String naam) {
         Gebruiker match;
        for (Gebruiker gebruiker : this.gebruikersLijst){

                System.out.println(gebruiker.getNaam());

            }
        }

    @Override
    public String toString() {
        return "Gebruikerslijst{" +
                "gebruikersLijst=" + gebruikersLijst +
                '}';
    }
}
