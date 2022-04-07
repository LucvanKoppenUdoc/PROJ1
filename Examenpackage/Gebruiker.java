package Examenpackage;

import java.util.*;

public class Gebruiker {
    private String naam;
    private Integer gebruikerNummer;
    private String wachtwoord;
    private ArrayList<Resultaat> resulaten = new ArrayList<Resultaat>();
    public static ArrayList<Gebruiker> gebruikerslijst = new ArrayList<Gebruiker>();
    private boolean admin;


    public Gebruiker(String naam, Integer gebruikerNummer, String wachtwoord, boolean admin){
        this.naam = naam;
        this.gebruikerNummer = gebruikerNummer;
        this.wachtwoord = wachtwoord;
        this.admin = admin;

        gebruikerslijst.add(this);
    }

    public ArrayList<Gebruiker> getGebruikersLijst() {
        return gebruikerslijst;
    }

    public String getNaam() {
        return naam;
    }

    public Integer getGebruikerNummer() {
        return gebruikerNummer;
    }

    public String getWachtwoord() {return wachtwoord;}

    public Gebruiker getGebruikerOnGebruikerNummer(int gebruikernummer) {
        Gebruiker match = null;
        for (Gebruiker gebruiker : gebruikerslijst){
            if (gebruiker.getGebruikerNummer() == gebruikernummer) {
                match = gebruiker;
            }
        }
        return match;
    }

    public Gebruiker getStudentOnName(String naam) {
        Gebruiker match = null;
        for (Gebruiker gebruiker : gebruikerslijst){
            if (gebruiker.getNaam().contentEquals(naam)) {
                match = gebruiker;
            }
        }
        return match;
    }
    public boolean verwijderStudent(String naam) {
        Gebruiker match = null;
        boolean removed = false;
        for (Gebruiker gebruiker : gebruikerslijst){
            if (gebruiker.getNaam().equals(naam)) {
                match = gebruiker;
            }
        }
        try {
            if(gebruikerslijst.remove(match)) {
                removed = true;
            } else {
                removed = false;
            }

        } catch (Exception e) {
            System.out.println(e);
            removed = false;

        }
        return removed;
    }

    public Integer getAantalStudenten() {
        return gebruikerslijst.size();
        // todo dit telt ook admins mee!
    }


    @Override
    public String toString() {
        return "Gebruiker" + "\n \t" +
                "naam='" + naam + "\n \t" +
                "gebruikerNummer= " + gebruikerNummer + "\n \t" +
                "admin=" + admin + "\n \n";
    }
}