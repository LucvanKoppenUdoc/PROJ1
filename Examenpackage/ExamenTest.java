package Examenpackage;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamenTest {

    @org.junit.jupiter.api.Test
    void addStudentGeslaagd() {
        Examen examen = new Examen("Test", 5);

        //Vragen Test
        ArrayList<String> keuzeAntwoorden = new ArrayList<String>();
        keuzeAntwoorden.add("1) Aap");
        keuzeAntwoorden.add("2) Poes");
        keuzeAntwoorden.add("3) Hondje");
        Vraag vraag = new Vraag("Wat is het lievelingsdier van Bram?", 1, keuzeAntwoorden, examen);
        ArrayList<String> keuzeAntwoorden1 = new ArrayList<String>();
        keuzeAntwoorden1.add("1) Rikash");
        keuzeAntwoorden1.add("2) Royalistic");
        keuzeAntwoorden1.add("3) Gert");
        Vraag vraag1 = new Vraag("Wat is Roy zijn bijnaam?", 1, keuzeAntwoorden1, examen);
        ArrayList<String> keuzeAntwoorden2 = new ArrayList<String>();
        keuzeAntwoorden2.add("1) 2");
        keuzeAntwoorden2.add("2) 3");
        keuzeAntwoorden2.add("3) 4");
        Vraag vraag2 = new Vraag("Wat is 2+2?", 3, keuzeAntwoorden2, examen);
        ArrayList<String> keuzeAntwoorden3 = new ArrayList<String>();
        keuzeAntwoorden3.add("1) Delft");
        keuzeAntwoorden3.add("2) Maassluis");
        keuzeAntwoorden3.add("3) Arnhem");
        Vraag vraag3 = new Vraag("Waar woont Daniel?", 2, keuzeAntwoorden3, examen);
        ArrayList<String> keuzeAntwoorden4 = new ArrayList<String>();
        keuzeAntwoorden4.add("1) 1 meter 50");
        keuzeAntwoorden4.add("2) 1 meter 20");
        keuzeAntwoorden4.add("3) Hoe lang is inderdaad een chinees");
        Vraag vraag4 = new Vraag("Hoelang is een chinees?", 3, keuzeAntwoorden4, examen);
        Gebruiker gebruiker = new Gebruiker("Bob", 1234567, "Wachtwoord", false);

        System.out.println(Examen.getExamenlijst().get(0).getStudentGeslaagd(gebruiker));
        System.out.println(gebruiker);
        System.out.println(Examen.getExamenlijst().get(0).getStudentenGeslaagd());
        //Examen.getExamenlijst().get(0).setStudentGeslaagd(gebruiker, true);

    }

    @org.junit.jupiter.api.Test
    void addVragen() {

    }
}