package Examenpackage;


import java.util.*;

public class Examen {
    private String naam;
    private ArrayList<Gebruiker> studentenGeslaagd = new ArrayList<Gebruiker>();
    private ArrayList<Vraag> vragen = new ArrayList<Vraag>();
    private Integer teBehalenPunten;
    
    public Examen(String naam, Integer teBehalenPunten){
        this.naam = naam;
        this.teBehalenPunten = teBehalenPunten;
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
