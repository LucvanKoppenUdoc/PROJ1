package Examenpackage;

import java.util.ArrayList;

public class Resultaat {
    private Examen examen;
    private Gebruiker gebruiker;
    private double cijfer;
    public static ArrayList<Resultaat> alleResultaten = new ArrayList<Resultaat>();
    private boolean geslaagd;

    public Resultaat(Gebruiker student, Examen examen){
        this.gebruiker = student;
        this.examen = examen;
    }

    public Examen getExamen() {
        return examen;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public ArrayList<Resultaat> getAlleResultaten() {
        return alleResultaten;
    }

    public boolean isGeslaagd() {
        if (cijfer - 5.5 >= 0.000000000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Resultaat{" +
                "examen=" + examen +
                ", gebruiker=" + gebruiker +
                ", cijfer=" + cijfer +
                ", alleResultaten=" + alleResultaten +
                ", geslaagd=" + geslaagd +
                '}';
    }
}
