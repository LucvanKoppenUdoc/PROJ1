package Examenpackage;

import java.util.ArrayList;

public class Resultaat {
    private Examen examen;
    private Gebruiker gebruiker;
    private double cijfer;
    private ArrayList<Vraag> fout = new ArrayList<Vraag>();
    public static ArrayList<Resultaat> alleResultaten = new ArrayList<Resultaat>();
    private boolean geslaagd;

    public Resultaat(Gebruiker student, Examen examen, double cijfer, ArrayList<Vraag> fout){
        this.gebruiker = student;
        this.examen = examen;
        this.cijfer = cijfer;
        this.fout = fout;
        if (cijfer - 5.5 >= 0.000000000) {
            this.geslaagd = true;
            examen.addStudentGeslaagd(student);
        } else {
            this.geslaagd = false;
        }
        alleResultaten.add(this);
        student.addResultaat(this);
    }

    public Examen getExamen() {
        return examen;
    }

    public double getCijfer() {
        return cijfer;
    }

    public ArrayList<Vraag> getFout() {return fout;}

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public ArrayList<Resultaat> getAlleResultaten() {
        return alleResultaten;
    }

    public boolean getGeslaagd() {return geslaagd; }

    @Override
    public String toString() {
        return "Resultaat{" +
                "examen=" + examen +
                ", gebruiker=" + gebruiker +
                ", cijfer=" + cijfer +
                ", geslaagd=" + geslaagd +
                '}';
    }
}