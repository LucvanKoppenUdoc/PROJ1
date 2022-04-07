package Examenpackage;

import java.util.*;

public class Vraag {
    private String vraagstelling;
    private Integer goedAntwoord;
    private ArrayList<String> keuzeAntwoorden = new ArrayList<String>();

    public Vraag(String vraagstelling, Integer goedAntwoord){
        this.vraagstelling = vraagstelling;
        this.goedAntwoord = goedAntwoord;
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
        return "Vraag{" +
                "vraagstelling='" + vraagstelling + '\'' +
                ", goedAntwoord=" + goedAntwoord +
                ", keuzeAntwoorden=" + keuzeAntwoorden +
                '}';
    }
}