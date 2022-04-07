package Examenpackage;

import java.util.*;

public class Vraag {
    private String vraagstelling;
    private Integer goedAntwoord;
    private ArrayList<String> keuzeAntwoorden = new ArrayList<String>();

    public Vraag(String vraagstelling, Integer goedAntwoord, ArrayList<String> keuzeAntwoorden, Examen examen){
        this.vraagstelling = vraagstelling;
        this.goedAntwoord = goedAntwoord;
        this.keuzeAntwoorden = keuzeAntwoorden;

        examen.addVragen(this);
    }

    public String getVraagstelling() {
        return vraagstelling;
    }

    public Integer getGoedAntwoord() {
        return goedAntwoord;
    }

    public ArrayList<String> getKeuzeAntwoorden() {
        return keuzeAntwoorden;
    }

    @Override
    public String toString() {
        return  "\nVraag: " + vraagstelling + '\n' +
                "goedAntwoord= " + goedAntwoord + "\n" +
                "keuzeAntwoorden= " + keuzeAntwoorden + '\n' + '\n';
    }
}