package Examenpackage;


import java.util.*;

public class Gebruiker {
    private String naam;
    private Integer gebruikerNummer;
    private ArrayList<Resultaat> resulaten = new ArrayList<Resultaat>();
    private boolean admin;


    public Gebruiker(String naam, Integer gebruikerNummer, boolean admin){
        this.naam = naam;
        this.gebruikerNummer = gebruikerNummer;
        this.admin = admin;
    }

    public String getNaam() {
        return naam;
    }

    public void maakExamen(){
         if (admin == true) {
             Examen examen = new Examen("examen 1", 10);
         }
     }

    public Integer getGebruikerNummer() {
        return gebruikerNummer;
    }

    //    public Resultaat getResulaat() {
//        return resulaten;
//    }


    @Override
    public String toString() {
        return "Gebruiker{" +
                "naam='" + naam + '\'' +
                ", gebruikerNummer=" + gebruikerNummer +
                ", resulaten=" + resulaten +
                ", admin=" + admin +
                '}';
    }
}