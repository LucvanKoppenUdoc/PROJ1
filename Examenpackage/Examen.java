package Examenpackage;
public class Examen {
    private String naam;
    //private ArrayList<Student> studentGeslaagd = new ArrayList<Student>();
    //private ArrayList<Vraag> vragen = new ArrayList<Vraag>();
    private Integer teBehalenPunten;
    
    public Examen(String naam, Integer teBehalenPunten){
        this.naam = naam;
        this.teBehalenPunten = teBehalenPunten;
    }
}
