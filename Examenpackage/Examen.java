package Examenpackage;


import java.util.*;

public class Examen {
    private String naam;
    private ArrayList<Gebruiker> studentenGeslaagd = new ArrayList<Gebruiker>();
    private ArrayList<Vraag> vragen = new ArrayList<Vraag>();
    public static ArrayList<Examen> examenlijst= new ArrayList<Examen>();
    private Integer teBehalenPunten;
    
    public Examen(String naam, Integer teBehalenPunten){
        this.naam = naam;
        this.teBehalenPunten = teBehalenPunten;

        examenlijst.add(this);
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Gebruiker> getStudentGeslaagd() {
        return studentenGeslaagd;
    }

    public void setStudentGeslaagd(ArrayList<Gebruiker> studentGeslaagd) {
        this.studentenGeslaagd = studentGeslaagd;
    }

    public void addStudentGeslaagd(Gebruiker studentGeslaagd) {
        this.studentenGeslaagd.add(studentGeslaagd);
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }

    public void setVragen(ArrayList<Vraag> vragen) {
        this.vragen = vragen;
    }

    public void addVragen(Vraag vraag) {
        this.vragen.add(vraag);
    }

    public static ArrayList<Examen> getExamenlijst() {
        return examenlijst;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "naam='" + naam + '\'' +
                ", studentenGeslaagd=" + studentenGeslaagd +
                ", vragen=" + vragen +
                ", teBehalenPunten=" + teBehalenPunten +
                '}';
    }
}