

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

        System.out.println("Welkom bij het examen programma\n1:\tkeuze 1\n2: \tkeuze2\n3: \tkeuze3\n4: \tkeuze4");

    }

}


