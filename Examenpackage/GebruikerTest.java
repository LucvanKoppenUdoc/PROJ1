package Examenpackage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class GebruikerTest {

    @org.junit.jupiter.api.Test
    void addResultaat() {

        //Arrange
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        Examen examen = new Examen("Nederlands", 10);

        ArrayList<String> keuzeAntwoorden = new ArrayList<String>();
        keuzeAntwoorden.add("1) 12");
        keuzeAntwoorden.add("2) 13");
        keuzeAntwoorden.add("3) 14");
        Vraag vraag = new Vraag("Hoe oud is Bram?", 2, keuzeAntwoorden, examen);

        Resultaat resultaat = new Resultaat(gebruiker, examen, 10.0);
        //act
        //Check
        assertEquals(1, gebruiker.getResulaten().size());
    }

    @org.junit.jupiter.api.Test
    void verwijderStudent() {
        //Arrange
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        //Act
        Gebruiker.verwijderStudent("Bram");
        //Check
//        System.out.println(gebruiker.getGebruikersLijst());
        assertEquals(0, Gebruiker.getGebruikersLijst().size());
    }

    @org.junit.jupiter.api.Test
    void getGemCijferStudent() {
        //Arrange

        //Act

        //Check

    }

    @Test
    void GebruikerslijstTest() {
        //Hier wordt getest of de gebruiker succesvol aan de gebruikerslijst wordt toegevoegd na het aanmaken.
        //Arrange
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        //Act
        //Check
        assertTrue(gebruiker.getGebruikersLijst().contains(gebruiker));
        Gebruiker.verwijderStudent("Bram");
    }

    @Test
    void GebruikerslijstTest1() {
        //Hier wordt getest of de grote van gebruikerslijst 1 is na het toevoegen van een student
        //Arrange
        int Size = Gebruiker.getGebruikersLijst().size();
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        int newSize = gebruiker.getGebruikersLijst().size();
        //Act
        //Check
        assertEquals(newSize - Size, 1);
        Gebruiker.verwijderStudent("Bram");
    }
}