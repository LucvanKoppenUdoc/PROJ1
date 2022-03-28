package Examenpackage;
public class Gebruiker {
    private String naam;
    private Integer gebruikerNummer;
    //private ArrayList<Resultaat> resulaten = new ArrayList<Resultaat>();
    private boolean admin;


    public Gebruiker(String naam, Integer gebruikerNummer, boolean admin){
        this.naam = naam;
        this.gebruikerNummer = gebruikerNummer;
        this.admin = admin;
    }

    // public void maakExamen(/* Examen examen */){
    //     if admin.equals(true){
    //         // maak examen
    //     }
    // }

    // public resultaat getResultaat(/* Examen examen */){
    //     return resultaat;
    // }
}
