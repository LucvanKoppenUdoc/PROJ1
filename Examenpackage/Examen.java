package Examenpackage;


import java.util.*;

public class Examen {
    private String naam;
    private ArrayList<Gebruiker> studentGeslaagd = new ArrayList<Gebruiker>();
    private ArrayList<Vraag> vragen = new ArrayList<Vraag>();
    private Integer teBehalenPunten;
    
    public Examen(String naam, Integer teBehalenPunten){
        this.naam = naam;
        this.teBehalenPunten = teBehalenPunten;
    }

    public String getNaam() {
        return naam;
    }
}
