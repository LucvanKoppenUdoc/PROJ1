

import Examenpackage.Gebruiker;
import Examenpackage.Gebruikerslijst;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Gebruiker> lijstje = new ArrayList<Gebruiker>();
        Gebruiker gebruiker1 = new Gebruiker("Luc", 21095582, true);
        lijstje.add(gebruiker1);
        Gebruikerslijst gebruikers = new Gebruikerslijst(lijstje);

        //System.out.println(gebruikers);
        //System.out.println(gebruikers.getStudentOnGebruikerNummer(21095582));

        String menu = "Menu
        1) Lijst met examens
        2) Lijst met studenten
        3) Nieuwe student inschrijven
        4) Student verwijderen
        5) Examen afnemen
        6) Is student geslaagd voor test?
        7) Welke examens heeft student gehaald?
        8) Welke student heeft de meeste examens gehaald?
        0) Exit
        Uw keuze:
        ";
        System.out.println(menu);

    }

}


