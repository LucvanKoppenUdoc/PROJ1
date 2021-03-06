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

    public Examen(){}

    public String getNaam() {return naam; }

    public int getTeBehalenPunten() {return teBehalenPunten; }

    public ArrayList<Gebruiker> getStudentenGeslaagd() {
        return studentenGeslaagd;
    }

    public boolean getStudentGeslaagd(Gebruiker student) {
        boolean geslaagd = false;
        for (Gebruiker gebruiker : this.studentenGeslaagd) {
           if (gebruiker.equals(student)) {
               geslaagd = true;
           } else{
               geslaagd = false;
           }
        }
        return geslaagd;
    }

    public void setStudentGeslaagd(ArrayList<Gebruiker> studentGeslaagd) {
        this.studentenGeslaagd = studentGeslaagd;
    }

    public void addStudentGeslaagd(Gebruiker studentGeslaagd) { this.studentenGeslaagd.add(studentGeslaagd); }

    public ArrayList<Vraag> getVragen() {return vragen;}

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
        ArrayList<Integer> test = new ArrayList<Integer>();
        for (Gebruiker gebruiker : getStudentenGeslaagd()){
            test.add(gebruiker.getGebruikerNummer());
        }

        return  "\nExamen " + naam +
                "\nStudenten Geslaagd = " + test +
                "\nAantal Studenten Geslaagd = " + test.size() +
                "\nVragen = " + vragen.size() +
                "\nTe behalen punten = " + teBehalenPunten + "\n";
    }
}