package Examenpackage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {

    @org.junit.jupiter.api.Test
    void addResultaat() {
        //Arrange
        //Act
        //Check
    }

    @org.junit.jupiter.api.Test
    void verwijderStudent() {
        //Arrange
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        //Act
        Gebruiker.verwijderStudent("Bram");
        //Check
        assertEquals(Gebruiker.getGebruikersLijst().size(), 0);
    }

    @org.junit.jupiter.api.Test
    void getGemCijferStudent() {

    }

    @Test
    void GebruikerslijstTest() {
        //Hier wordt getest of de gebruiker succesvol aan de gebruikerslijst wordt toegevoegd na het aanmaken.
        //Arrange
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        //Act
        //Check
        assertTrue(gebruiker.getGebruikersLijst().contains(gebruiker));
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
    }
}