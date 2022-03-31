

import Examenpackage.Gebruiker;
import Examenpackage.Gebruikerslijst;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Gebruiker> lijstje = new ArrayList<Gebruiker>();
        Gebruiker gebruiker1 = new Gebruiker("Luc", 21095582, true);
        lijstje.add(gebruiker1);
        Gebruikerslijst gebruikers = new Gebruikerslijst(lijstje);

        System.out.println(gebruikers);

        System.out.println(gebruikers.getStudentOnGebruikerNummer(21095582));
    }

}
