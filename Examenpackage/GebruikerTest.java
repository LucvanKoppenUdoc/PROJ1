package Examenpackage;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {

    @org.junit.jupiter.api.Test
    void addResultaat() {
    }

    @org.junit.jupiter.api.Test
    void verwijderStudent() {

    }

    @org.junit.jupiter.api.Test
    void getGemCijferStudent() {

    }

    @Test
    void getGebruikersLijst() {
        //Hier wordt getest of de gebruiker succesvol aan de gebruikerslijst wordt toegevoegd na het aanmaken.
        //Arrange
        Gebruiker gebruiker = new Gebruiker("Bram", 123, "hallo", false);
        //Act
        //Check
        assertTrue(gebruiker.getGebruikersLijst().contains(gebruiker));
    }
}